package io.github.ludovicoflaviano.settingsplus;

public enum SettingCategory {
    CHAT("Chat", "Chat and messaging"),
    VISUAL("Visual", "Particles, UI and visibility"),
    AUDIO("Audio", "Sounds and notifications"),
    SOCIAL("Social", "Social and privacy controls"),
    GAMEPLAY("Gameplay", "Personal gameplay preferences"),
    INTERFACE("Interface", "Settings menu and HUD"),
    PERFORMANCE("Performance", "Client-facing visual load"),
    NOTIFICATIONS("Notifications", "Personal alerts");

    private final String title;
    private final String description;

    SettingCategory(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String title() { return title; }
    public String description() { return description; }
}
