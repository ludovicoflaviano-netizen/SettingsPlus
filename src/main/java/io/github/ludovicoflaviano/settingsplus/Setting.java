package io.github.ludovicoflaviano.settingsplus;

import org.bukkit.Material;

public enum Setting {
    // Chat
    CHAT_TIPS("Chat Tips", "Show helpful server tips in chat", SettingCategory.CHAT, Material.BOOK),
    CHAT_FORMATTING("Chat Formatting", "Show formatted chat", SettingCategory.CHAT, Material.NAME_TAG),
    CHAT_LINKS("Chat Links", "Allow clickable chat links", SettingCategory.CHAT, Material.PAPER),
    CHAT_MENTIONS("Mentions", "Notify when your name is mentioned", SettingCategory.CHAT, Material.BELL),
    CHAT_DEATH_MESSAGES("Death Messages", "Show death messages to you", SettingCategory.CHAT, Material.SKELETON_SKULL),
    CHAT_JOIN_MESSAGES("Join Messages", "Show player join messages", SettingCategory.CHAT, Material.OAK_DOOR),
    CHAT_QUIT_MESSAGES("Quit Messages", "Show player quit messages", SettingCategory.CHAT, Material.IRON_DOOR),
    CHAT_ADVANCEMENTS("Advancements", "Show advancement announcements", SettingCategory.CHAT, Material.ENCHANTED_BOOK),
    CHAT_COMMAND_FEEDBACK("Command Feedback", "Show command feedback", SettingCategory.CHAT, Material.COMMAND_BLOCK),
    CHAT_SYSTEM_MESSAGES("System Messages", "Show server system messages", SettingCategory.CHAT, Material.WRITABLE_BOOK),
    CHAT_PRIVATE_MESSAGES("Private Messages", "Allow private messages", SettingCategory.CHAT, Material.PAPER),
    CHAT_TRADE_MESSAGES("Trade Messages", "Show trade notifications", SettingCategory.CHAT, Material.EMERALD),
    CHAT_AUCTION_MESSAGES("Auction Messages", "Show auction notifications", SettingCategory.CHAT, Material.CHEST),
    CHAT_ECONOMY_MESSAGES("Economy Messages", "Show economy notifications", SettingCategory.CHAT, Material.GOLD_INGOT),
    CHAT_STAFF_MESSAGES("Staff Messages", "Show staff notices", SettingCategory.CHAT, Material.IRON_INGOT),
    CHAT_FRIEND_MESSAGES("Friend Messages", "Show friend notifications", SettingCategory.CHAT, Material.PLAYER_HEAD),
    CHAT_PARTY_MESSAGES("Party Messages", "Show party notifications", SettingCategory.CHAT, Material.CAKE),
    CHAT_CLAN_MESSAGES("Clan Messages", "Show clan notifications", SettingCategory.CHAT, Material.WHITE_BANNER),
    CHAT_GLOBAL_MESSAGES("Global Chat", "Show global chat", SettingCategory.CHAT, Material.GLOBE_BANNER_PATTERN),
    CHAT_LOCAL_MESSAGES("Local Chat", "Show local chat", SettingCategory.CHAT, Material.PAPER),

    // Visual
    VISUAL_PARTICLES("Particles", "Show personal particle effects", SettingCategory.VISUAL, Material.BLAZE_POWDER),
    VISUAL_PLAYER_PARTICLES("Player Particles", "Show other player particles", SettingCategory.VISUAL, Material.FIREWORK_STAR),
    VISUAL_WEATHER("Weather", "Show weather effects", SettingCategory.VISUAL, Material.WATER_BUCKET),
    VISUAL_SKY("Sky Effects", "Show sky-related effects", SettingCategory.VISUAL, Material.SUNFLOWER),
    VISUAL_ENTITY_GLOW("Entity Glow", "Show glowing entities", SettingCategory.VISUAL, Material.GLOWSTONE_DUST),
    VISUAL_ITEM_GLOW("Item Glow", "Show item glow effects", SettingCategory.VISUAL, Material.GLOW_INK_SAC),
    VISUAL_DAMAGE_INDICATORS("Damage Indicators", "Show damage indicator effects", SettingCategory.VISUAL, Material.IRON_SWORD),
    VISUAL_HIT_EFFECTS("Hit Effects", "Show hit effects", SettingCategory.VISUAL, Material.NETHER_STAR),
    VISUAL_BLOCK_BREAK("Block Break Effects", "Show block break effects", SettingCategory.VISUAL, Material.DIAMOND_PICKAXE),
    VISUAL_BLOCK_PLACE("Block Place Effects", "Show block placement effects", SettingCategory.VISUAL, Material.GRASS_BLOCK),
    VISUAL_FALLING_BLOCKS("Falling Blocks", "Show falling block entities", SettingCategory.VISUAL, Material.SAND),
    VISUAL_ARMOR_STANDS("Armor Stands", "Show armor stands", SettingCategory.VISUAL, Material.ARMOR_STAND),
    VISUAL_ITEM_FRAMES("Item Frames", "Show item frames", SettingCategory.VISUAL, Material.ITEM_FRAME),
    VISUAL_MAPS("Map Displays", "Show map display effects", SettingCategory.VISUAL, Material.FILLED_MAP),
    VISUAL_HOLOGRAMS("Holograms", "Show hologram-style plugin displays", SettingCategory.VISUAL, Material.ENDER_EYE),
    VISUAL_BOSSBARS("Boss Bars", "Show boss bars", SettingCategory.VISUAL, Material.DRAGON_HEAD),
    VISUAL_SCOREBOARD("Scoreboard", "Show personal scoreboard", SettingCategory.VISUAL, Material.WRITABLE_BOOK),
    VISUAL_TABLIST("Tab List", "Show player tab list", SettingCategory.VISUAL, Material.PLAYER_HEAD),
    VISUAL_NAMETAGS("Nametags", "Show player nametags", SettingCategory.VISUAL, Material.NAME_TAG),
    VISUAL_INVISIBLES("Invisible Players", "Show invisible players", SettingCategory.VISUAL, Material.POTION),

    // Audio
    AUDIO_MASTER("Master Sounds", "Receive plugin sounds", SettingCategory.AUDIO, Material.NOTE_BLOCK),
    AUDIO_GUI("GUI Sounds", "Play menu sounds", SettingCategory.AUDIO, Material.NOTE_BLOCK),
    AUDIO_TELEPORT("Teleport Sounds", "Receive teleport sounds", SettingCategory.AUDIO, Material.ENDER_PEARL),
    AUDIO_COMBAT("Combat Sounds", "Receive combat notification sounds", SettingCategory.AUDIO, Material.IRON_SWORD),
    AUDIO_CHAT("Chat Sounds", "Receive chat notification sounds", SettingCategory.AUDIO, Material.NOTE_BLOCK),
    AUDIO_MENTION("Mention Sounds", "Play a sound for mentions", SettingCategory.AUDIO, Material.BELL),
    AUDIO_FRIEND("Friend Sounds", "Play friend notification sounds", SettingCategory.AUDIO, Material.PLAYER_HEAD),
    AUDIO_PARTY("Party Sounds", "Play party notification sounds", SettingCategory.AUDIO, Material.CAKE),
    AUDIO_TRADE("Trade Sounds", "Play trade notification sounds", SettingCategory.AUDIO, Material.EMERALD),
    AUDIO_AUCTION("Auction Sounds", "Play auction notification sounds", SettingCategory.AUDIO, Material.CHEST),
    AUDIO_LEVELUP("Level-Up Sounds", "Play level-up notification sounds", SettingCategory.AUDIO, Material.EXPERIENCE_BOTTLE),
    AUDIO_RARE("Rare Event Sounds", "Play rare event sounds", SettingCategory.AUDIO, Material.NETHER_STAR),
    AUDIO_AMBIENT("Ambient Alerts", "Receive ambient plugin alerts", SettingCategory.AUDIO, Material.AMETHYST_SHARD),
    AUDIO_BUTTON_HOVER("Button Hover", "Play menu hover feedback", SettingCategory.AUDIO, Material.OAK_BUTTON),
    AUDIO_BUTTON_CLICK("Button Click", "Play menu click feedback", SettingCategory.AUDIO, Material.STONE_BUTTON),

    // Social
    SOCIAL_FRIEND_REQUESTS("Friend Requests", "Allow friend requests", SettingCategory.SOCIAL, Material.PLAYER_HEAD),
    SOCIAL_PARTY_INVITES("Party Invites", "Allow party invites", SettingCategory.SOCIAL, Material.CAKE),
    SOCIAL_TRADE_REQUESTS("Trade Requests", "Allow trade requests", SettingCategory.SOCIAL, Material.EMERALD),
    SOCIAL_DUEL_REQUESTS("Duel Requests", "Allow duel requests", SettingCategory.SOCIAL, Material.IRON_SWORD),
    SOCIAL_TELEPORT_REQUESTS("Teleport Requests", "Allow teleport requests", SettingCategory.SOCIAL, Material.ENDER_PEARL),
    SOCIAL_MENTIONS("Social Mentions", "Allow social mentions", SettingCategory.SOCIAL, Material.NAME_TAG),
    SOCIAL_DIRECT_MESSAGES("Direct Messages", "Allow direct messages", SettingCategory.SOCIAL, Material.PAPER),
    SOCIAL_SHOW_LOCATION("Show Location", "Allow plugin systems to show your location", SettingCategory.SOCIAL, Material.COMPASS),
    SOCIAL_SHOW_BALANCE("Show Balance", "Allow plugin systems to show your balance", SettingCategory.SOCIAL, Material.GOLD_INGOT),
    SOCIAL_SHOW_PLAYTIME("Show Playtime", "Allow plugin systems to show your playtime", SettingCategory.SOCIAL, Material.CLOCK),
    SOCIAL_SHOW_STATS("Show Stats", "Allow plugin systems to show your stats", SettingCategory.SOCIAL, Material.BOOK),
    SOCIAL_FRIEND_ONLINE("Friend Online Alerts", "Notify when friends join", SettingCategory.SOCIAL, Material.LIME_DYE),
    SOCIAL_FRIEND_OFFLINE("Friend Offline Alerts", "Notify when friends leave", SettingCategory.SOCIAL, Material.GRAY_DYE),
    SOCIAL_PARTY_ONLINE("Party Online Alerts", "Notify about party members", SettingCategory.SOCIAL, Material.CAKE),
    SOCIAL_CLAN_ALERTS("Clan Alerts", "Receive clan alerts", SettingCategory.SOCIAL, Material.WHITE_BANNER),

    // Gameplay preferences
    GAMEPLAY_AUTO_PICKUP("Auto Pickup Alerts", "Notify about automatic pickups", SettingCategory.GAMEPLAY, Material.HOPPER),
    GAMEPLAY_AUTO_SELL("Auto Sell Alerts", "Notify about automatic selling", SettingCategory.GAMEPLAY, Material.EMERALD),
    GAMEPLAY_AUTO_CLAIM("Auto Claim Alerts", "Notify about automatic claims", SettingCategory.GAMEPLAY, Material.CHEST),
    GAMEPLAY_TELEPORT_COUNTDOWN("Teleport Countdown", "Show teleport countdowns", SettingCategory.GAMEPLAY, Material.CLOCK),
    GAMEPLAY_CANCEL_ON_MOVE("Cancel Teleport on Move", "Cancel plugin teleports when you move", SettingCategory.GAMEPLAY, Material.LEATHER_BOOTS),
    GAMEPLAY_COMBAT_TIMER("Combat Timer", "Show your combat timer when provided", SettingCategory.GAMEPLAY, Material.IRON_SWORD),
    GAMEPLAY_DEATH_SCREEN("Death Screen", "Show plugin death UI when provided", SettingCategory.GAMEPLAY, Material.SKELETON_SKULL),
    GAMEPLAY_RESPAWN_NOTICE("Respawn Notice", "Show respawn notices", SettingCategory.GAMEPLAY, Material.TOTEM_OF_UNDYING),
    GAMEPLAY_SPAWN_NOTICE("Spawn Notice", "Show spawn notices", SettingCategory.GAMEPLAY, Material.COMPASS),
    GAMEPLAY_HOME_NOTICE("Home Notice", "Show home teleport notices", SettingCategory.GAMEPLAY, Material.RED_BED),
    GAMEPLAY_WARP_NOTICE("Warp Notice", "Show warp notices", SettingCategory.GAMEPLAY, Material.ENDER_EYE),
    GAMEPLAY_BACK_NOTICE("Back Notice", "Show back teleport notices", SettingCategory.GAMEPLAY, Material.RECOVERY_COMPASS),
    GAMEPLAY_RANDOM_TELEPORT_NOTICE("Random Teleport Notice", "Show random teleport notices", SettingCategory.GAMEPLAY, Material.ENDER_PEARL),
    GAMEPLAY_KIT_NOTICE("Kit Notice", "Show kit notices", SettingCategory.GAMEPLAY, Material.CHEST),
    GAMEPLAY_REWARD_NOTICE("Reward Notice", "Show reward notices", SettingCategory.GAMEPLAY, Material.DIAMOND),
    GAMEPLAY_QUEST_NOTICE("Quest Notice", "Show quest notices", SettingCategory.GAMEPLAY, Material.WRITABLE_BOOK),
    GAMEPLAY_MISSION_NOTICE("Mission Notice", "Show mission notices", SettingCategory.GAMEPLAY, Material.FILLED_MAP),
    GAMEPLAY_EVENT_NOTICE("Event Notice", "Show event notices", SettingCategory.GAMEPLAY, Material.FIREWORK_ROCKET),
    GAMEPLAY_STREAK_NOTICE("Streak Notice", "Show streak notices", SettingCategory.GAMEPLAY, Material.BLAZE_POWDER),
    GAMEPLAY_MILESTONE_NOTICE("Milestone Notice", "Show milestone notices", SettingCategory.GAMEPLAY, Material.AMETHYST_SHARD),

    // Interface
    INTERFACE_OPEN_ON_JOIN("Open on Join", "Open settings UI when requested by the server", SettingCategory.INTERFACE, Material.CHEST),
    INTERFACE_COMPACT_GUI("Compact GUI", "Use a compact settings layout", SettingCategory.INTERFACE, Material.BARREL),
    INTERFACE_SHOW_DESCRIPTIONS("Descriptions", "Show setting descriptions", SettingCategory.INTERFACE, Material.BOOK),
    INTERFACE_SHOW_STATUS("Status Labels", "Show ON/OFF status labels", SettingCategory.INTERFACE, Material.LIME_DYE),
    INTERFACE_CLICK_SOUNDS("Click Sounds", "Play click sounds in Settings+", SettingCategory.INTERFACE, Material.NOTE_BLOCK),
    INTERFACE_PAGE_SOUNDS("Page Sounds", "Play sounds when changing pages", SettingCategory.INTERFACE, Material.PAPER),
    INTERFACE_CONFIRM_RESET("Confirm Reset", "Confirm reset-all actions", SettingCategory.INTERFACE, Material.BARRIER),
    INTERFACE_RETURN_BUTTON("Return Button", "Show category return buttons", SettingCategory.INTERFACE, Material.ARROW),
    INTERFACE_CLOSE_BUTTON("Close Button", "Show the close button", SettingCategory.INTERFACE, Material.BARRIER),
    INTERFACE_NAVIGATION("Navigation", "Show navigation controls", SettingCategory.INTERFACE, Material.COMPASS),
    INTERFACE_CATEGORY_ICONS("Category Icons", "Show category icons", SettingCategory.INTERFACE, Material.BOOK),
    INTERFACE_PAGE_COUNTER("Page Counter", "Show current page information", SettingCategory.INTERFACE, Material.PAPER),
    INTERFACE_RESET_BUTTON("Reset Button", "Show reset button", SettingCategory.INTERFACE, Material.BARRIER),
    INTERFACE_SEARCH_BUTTON("Search Button", "Show the settings search control", SettingCategory.INTERFACE, Material.SPYGLASS),
    INTERFACE_FAVORITES("Favorites", "Enable favorite settings", SettingCategory.INTERFACE, Material.NETHER_STAR),

    // Performance / visual load
    PERFORMANCE_LOW_PARTICLES("Low Particles", "Reduce plugin particle density", SettingCategory.PERFORMANCE, Material.REDSTONE),
    PERFORMANCE_LOW_SOUNDS("Low Sounds", "Reduce plugin sound frequency", SettingCategory.PERFORMANCE, Material.NOTE_BLOCK),
    PERFORMANCE_NO_HOLOGRAMS("Hide Holograms", "Hide plugin hologram displays", SettingCategory.PERFORMANCE, Material.ENDER_EYE),
    PERFORMANCE_NO_GLOW("Hide Glow", "Hide plugin glow effects", SettingCategory.PERFORMANCE, Material.GLOWSTONE_DUST),
    PERFORMANCE_NO_FIREWORKS("Hide Fireworks", "Hide plugin firework effects", SettingCategory.PERFORMANCE, Material.FIREWORK_ROCKET),
    PERFORMANCE_NO_LIGHTNING("Hide Lightning", "Hide plugin lightning effects", SettingCategory.PERFORMANCE, Material.LIGHTNING_ROD),
    PERFORMANCE_NO_WEATHER("Hide Weather", "Hide plugin weather effects", SettingCategory.PERFORMANCE, Material.WATER_BUCKET),
    PERFORMANCE_NO_AMBIENT("Hide Ambient", "Hide ambient plugin effects", SettingCategory.PERFORMANCE, Material.AMETHYST_SHARD),
    PERFORMANCE_NO_ARMOR_STANDS("Hide Armor Stands", "Hide plugin armor stand displays", SettingCategory.PERFORMANCE, Material.ARMOR_STAND),
    PERFORMANCE_NO_ITEM_FRAMES("Hide Item Frames", "Hide plugin item frame displays", SettingCategory.PERFORMANCE, Material.ITEM_FRAME),
    PERFORMANCE_NO_NPCS("Hide NPCs", "Hide plugin NPC displays", SettingCategory.PERFORMANCE, Material.VILLAGER_SPAWN_EGG),
    PERFORMANCE_NO_GUARDIANS("Hide Displays", "Hide plugin display entities", SettingCategory.PERFORMANCE, Material.ARMOR_STAND),
    PERFORMANCE_NO_DAMAGE("Hide Damage FX", "Hide plugin damage effects", SettingCategory.PERFORMANCE, Material.IRON_SWORD),
    PERFORMANCE_NO_HITMARKS("Hide Hitmarks", "Hide plugin hitmark effects", SettingCategory.PERFORMANCE, Material.TARGET),
    PERFORMANCE_NO_BOSSBAR("Hide Boss Bars", "Hide plugin boss bars", SettingCategory.PERFORMANCE, Material.DRAGON_HEAD),
    PERFORMANCE_NO_SCOREBOARD("Hide Scoreboard", "Hide plugin scoreboards", SettingCategory.PERFORMANCE, Material.WRITABLE_BOOK),
    PERFORMANCE_NO_TAB("Hide Tab", "Hide plugin tab additions", SettingCategory.PERFORMANCE, Material.PLAYER_HEAD),
    PERFORMANCE_NO_NAMETAGS("Hide Nametags", "Hide plugin nametag additions", SettingCategory.PERFORMANCE, Material.NAME_TAG),
    PERFORMANCE_NO_ACTIONBAR("Hide Action Bar", "Hide plugin action-bar messages", SettingCategory.PERFORMANCE, Material.PAPER),
    PERFORMANCE_NO_TITLE("Hide Titles", "Hide plugin titles", SettingCategory.PERFORMANCE, Material.PAPER),
    PERFORMANCE_NO_SUBTITLE("Hide Subtitles", "Hide plugin subtitles", SettingCategory.PERFORMANCE, Material.PAPER),

    // Notifications
    NOTIFY_TELEPORT("Teleport Notifications", "Notify about teleports", SettingCategory.NOTIFICATIONS, Material.ENDER_PEARL),
    NOTIFY_HOME("Home Notifications", "Notify about homes", SettingCategory.NOTIFICATIONS, Material.RED_BED),
    NOTIFY_WARP("Warp Notifications", "Notify about warps", SettingCategory.NOTIFICATIONS, Material.ENDER_EYE),
    NOTIFY_SERVER("Server Notifications", "Receive server notices", SettingCategory.NOTIFICATIONS, Material.BELL),
    NOTIFY_UPDATES("Update Notifications", "Notify about plugin updates", SettingCategory.NOTIFICATIONS, Material.PAPER),
    NOTIFY_MAINTENANCE("Maintenance Notifications", "Receive maintenance notices", SettingCategory.NOTIFICATIONS, Material.ANVIL),
    NOTIFY_VOTE("Vote Notifications", "Receive vote notices", SettingCategory.NOTIFICATIONS, Material.EMERALD),
    NOTIFY_REWARD("Reward Notifications", "Receive reward notices", SettingCategory.NOTIFICATIONS, Material.DIAMOND),
    NOTIFY_LEVEL("Level Notifications", "Receive level-up notices", SettingCategory.NOTIFICATIONS, Material.EXPERIENCE_BOTTLE),
    NOTIFY_ACHIEVEMENT("Achievement Notifications", "Receive achievement notices", SettingCategory.NOTIFICATIONS, Material.ENCHANTED_BOOK),
    NOTIFY_QUEST("Quest Notifications", "Receive quest notices", SettingCategory.NOTIFICATIONS, Material.WRITABLE_BOOK),
    NOTIFY_EVENT("Event Notifications", "Receive event notices", SettingCategory.NOTIFICATIONS, Material.FIREWORK_ROCKET),
    NOTIFY_AFK("AFK Notifications", "Receive AFK status notices", SettingCategory.NOTIFICATIONS, Material.CLOCK),
    NOTIFY_COMBAT("Combat Notifications", "Receive combat status notices", SettingCategory.NOTIFICATIONS, Material.IRON_SWORD),
    NOTIFY_ECONOMY("Economy Notifications", "Receive economy notices", SettingCategory.NOTIFICATIONS, Material.GOLD_INGOT),
    NOTIFY_TRADE("Trade Notifications", "Receive trade notices", SettingCategory.NOTIFICATIONS, Material.EMERALD),
    NOTIFY_AUCTION("Auction Notifications", "Receive auction notices", SettingCategory.NOTIFICATIONS, Material.CHEST),
    NOTIFY_FRIEND("Friend Notifications", "Receive friend notices", SettingCategory.NOTIFICATIONS, Material.PLAYER_HEAD),
    NOTIFY_PARTY("Party Notifications", "Receive party notices", SettingCategory.NOTIFICATIONS, Material.CAKE),
    NOTIFY_CLAN("Clan Notifications", "Receive clan notices", SettingCategory.NOTIFICATIONS, Material.WHITE_BANNER),
    NOTIFY_PING("Ping Notifications", "Receive ping-related notices", SettingCategory.NOTIFICATIONS, Material.REDSTONE_TORCH);

    private final String displayName;
    private final String description;
    private final SettingCategory category;
    private final Material icon;

    Setting(String displayName, String description, SettingCategory category, Material icon) {
        this.displayName = displayName;
        this.description = description;
        this.category = category;
        this.icon = icon;
    }

    public String displayName() { return displayName; }
    public String description() { return description; }
    public SettingCategory category() { return category; }
    public Material icon() { return icon; }
}
