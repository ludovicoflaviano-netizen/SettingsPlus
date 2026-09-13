package io.github.ludovicoflaviano.settingsplus;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;

public final class SettingsPlus extends JavaPlugin implements Listener, CommandExecutor {
    private SettingsStore store;
    private final Map<UUID, PlayerSettings> cache = new EnumMap<>(UUID.class);
    private final Map<UUID, SettingsMenu> menus = new java.util.HashMap<>();

    @Override public void onEnable() {
        saveDefaultConfig();
        store = new SettingsStore(new java.io.File(getDataFolder(), "players"));
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("settings").setExecutor(this);
        getLogger().info("Settings+ enabled with " + Setting.values().length + " personal toggles.");
    }

    @Override public void onDisable() {
        cache.values().forEach(store::save);
        cache.clear();
    }

    public SettingsStore store() { return store; }
    public PlayerSettings settings(Player player) { return cache.computeIfAbsent(player.getUniqueId(), store::load); }

    public void openCategories(Player player) {
        Inventory inv = getServer().createInventory(null, 27, Component.text("Settings+", NamedTextColor.WHITE));
        int slot = 10;
        for (SettingCategory category : SettingCategory.values()) {
            ItemStack item = new ItemStack(categoryIcon(category));
            ItemMeta meta = item.getItemMeta();
            meta.displayName(Component.text(category.title(), NamedTextColor.WHITE));
            meta.lore(java.util.List.of(Component.text(category.description(), NamedTextColor.GRAY), Component.empty(), Component.text("Click to open", NamedTextColor.DARK_GRAY)));
            item.setItemMeta(meta);
            inv.setItem(slot, item);
            slot++;
            if (slot == 17) slot = 19;
        }
        inv.setItem(22, simple(Material.BARRIER, "Close"));
        player.openInventory(inv);
    }

    private Material categoryIcon(SettingCategory c) {
        return switch (c) {
            case CHAT -> Material.WRITABLE_BOOK; case VISUAL -> Material.FIREWORK_STAR; case AUDIO -> Material.NOTE_BLOCK;
            case SOCIAL -> Material.PLAYER_HEAD; case GAMEPLAY -> Material.DIAMOND_SWORD; case INTERFACE -> Material.CHEST;
            case PERFORMANCE -> Material.REDSTONE; case NOTIFICATIONS -> Material.BELL;
        };
    }

    private ItemStack simple(Material m, String name) { ItemStack i = new ItemStack(m); ItemMeta x=i.getItemMeta(); x.displayName(Component.text(name, NamedTextColor.WHITE)); i.setItemMeta(x); return i; }

    public void openCategory(Player player, SettingCategory category) {
        SettingsMenu menu = new SettingsMenu(this, player, settings(player), category, 0);
        menus.put(player.getUniqueId(), menu);
        menu.open();
    }

    public void playClick(Player player, Setting setting) {
        PlayerSettings ps = settings(player);
        if (ps.get(Setting.AUDIO_MASTER) && ps.get(Setting.AUDIO_GUI) && ps.get(Setting.INTERFACE_CLICK_SOUNDS))
            player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.55f, 1.0f);
    }

    @EventHandler public void onJoin(PlayerJoinEvent e) { cache.put(e.getPlayer().getUniqueId(), store.load(e.getPlayer().getUniqueId())); }
    @EventHandler public void onQuit(PlayerQuitEvent e) { PlayerSettings ps=cache.remove(e.getPlayer().getUniqueId()); if(ps!=null) store.save(ps); menus.remove(e.getPlayer().getUniqueId()); }

    @EventHandler public void onClick(InventoryClickEvent e) {
        if (!(e.getWhoClicked() instanceof Player player)) return;
        String title = e.getView().title().toString();
        if (!title.contains("Settings+")) return;
        e.setCancelled(true);
        if (e.getRawSlot() >= e.getView().topInventory().getSize()) return;
        if (title.equals(Component.text("Settings+", NamedTextColor.WHITE).toString())) {
            int slot=e.getRawSlot();
            SettingCategory[] categories=SettingCategory.values();
            int index = slot >= 10 && slot <= 16 ? slot-10 : slot >= 19 && slot <= 20 ? slot-19+7 : -1;
            if (index >= 0 && index < categories.length) openCategory(player, categories[index]);
            else if (slot==22) player.closeInventory();
            return;
        }
        SettingsMenu menu=menus.get(player.getUniqueId());
        if(menu!=null) menu.click(e);
    }

    @EventHandler public void onClose(InventoryCloseEvent e) { menus.remove(e.getPlayer().getUniqueId()); }

    @Override public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) { sender.sendMessage("Only players can use this command."); return true; }
        if (!player.hasPermission("settingsplus.use")) { player.sendMessage(Component.text("You do not have permission to use Settings+.", NamedTextColor.RED)); return true; }
        openCategories(player); return true;
    }
}
