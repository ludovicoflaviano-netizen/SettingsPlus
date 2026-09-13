package io.github.ludovicoflaviano.settingsplus;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class SettingsMenu {
    private final SettingsPlus plugin;
    private final Player player;
    private final PlayerSettings settings;
    private final SettingCategory category;
    private final int page;

    public SettingsMenu(SettingsPlus plugin, Player player, PlayerSettings settings, SettingCategory category, int page) {
        this.plugin = plugin; this.player = player; this.settings = settings; this.category = category; this.page = page;
    }

    public SettingCategory category() { return category; }

    public void open() {
        plugin.rememberMenu(player, this);
        Inventory inv = Bukkit.createInventory(null, 54, Component.text("Settings+  •  " + category.title(), NamedTextColor.WHITE));
        List<Setting> list = java.util.Arrays.stream(Setting.values()).filter(s -> s.category() == category).toList();
        int maxPage = Math.max(1, (list.size() + 44) / 45);
        int safePage = Math.min(Math.max(page, 0), maxPage - 1);
        int start = safePage * 45;
        for (int i = 0; i < 45 && start + i < list.size(); i++) inv.setItem(i, settingItem(list.get(start + i)));
        for (int i = 45; i < 54; i++) inv.setItem(i, filler());
        inv.setItem(45, button(Material.ARROW, "Previous", safePage > 0));
        inv.setItem(49, button(Material.BARRIER, "Close", true));
        inv.setItem(53, button(Material.ARROW, "Next", safePage + 1 < maxPage));
        inv.setItem(47, button(Material.NETHER_STAR, "Reset category", true));
        inv.setItem(51, button(Material.COMPASS, "Categories", true));
        player.openInventory(inv);
    }

    private ItemStack settingItem(Setting setting) {
        ItemStack item = new ItemStack(setting.icon());
        ItemMeta meta = item.getItemMeta();
        boolean enabled = settings.get(setting);
        meta.displayName(Component.text(setting.displayName(), enabled ? NamedTextColor.GREEN : NamedTextColor.RED));
        List<Component> lore = new ArrayList<>();
        lore.add(Component.text(setting.description(), NamedTextColor.GRAY));
        lore.add(Component.empty());
        lore.add(Component.text(enabled ? "● ON" : "○ OFF", enabled ? NamedTextColor.GREEN : NamedTextColor.RED));
        lore.add(Component.text("Click to toggle", NamedTextColor.DARK_GRAY));
        meta.lore(lore);
        item.setItemMeta(meta);
        return item;
    }

    private ItemStack button(Material material, String name, boolean enabled) {
        ItemStack item = new ItemStack(enabled ? material : Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text(name, enabled ? NamedTextColor.WHITE : NamedTextColor.DARK_GRAY));
        item.setItemMeta(meta);
        return item;
    }

    private ItemStack filler() { return new ItemStack(Material.GRAY_STAINED_GLASS_PANE); }

    public void click(InventoryClickEvent event) {
        int slot = event.getRawSlot();
        List<Setting> list = java.util.Arrays.stream(Setting.values()).filter(s -> s.category() == category).toList();
        int maxPage = Math.max(1, (list.size() + 44) / 45);
        if (slot < 45) {
            int index = page * 45 + slot;
            if (index < list.size()) {
                Setting setting = list.get(index);
                settings.toggle(setting);
                plugin.store().save(settings);
                plugin.playClick(player, setting);
                open();
            }
        } else if (slot == 45 && page > 0) plugin.openCategory(player, category, page - 1);
        else if (slot == 53 && page + 1 < maxPage) plugin.openCategory(player, category, page + 1);
        else if (slot == 49) player.closeInventory();
        else if (slot == 47) {
            for (Setting s : list) settings.set(s, true);
            plugin.store().save(settings);
            open();
        } else if (slot == 51) plugin.openCategories(player);
    }
}
