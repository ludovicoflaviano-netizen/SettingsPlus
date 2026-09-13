package io.github.ludovicoflaviano.settingsplus;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public final class SettingsStore {
    private final File folder;

    public SettingsStore(File folder) {
        this.folder = folder;
        folder.mkdirs();
    }

    public PlayerSettings load(UUID uuid) {
        PlayerSettings settings = new PlayerSettings(uuid);
        File file = new File(folder, uuid + ".yml");
        if (!file.exists()) return settings;
        YamlConfiguration yaml = YamlConfiguration.loadConfiguration(file);
        for (Setting setting : Setting.values()) {
            if (yaml.contains(setting.name())) settings.set(setting, yaml.getBoolean(setting.name(), true));
        }
        return settings;
    }

    public void save(PlayerSettings settings) {
        YamlConfiguration yaml = new YamlConfiguration();
        settings.values().forEach((setting, value) -> yaml.set(setting.name(), value));
        try { yaml.save(new File(folder, settings.uuid() + ".yml")); }
        catch (IOException ex) { throw new IllegalStateException("Could not save Settings+ preferences", ex); }
    }
}
