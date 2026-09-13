package io.github.ludovicoflaviano.settingsplus;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public final class PlayerSettings {
    private final UUID uuid;
    private final Map<Setting, Boolean> values = new EnumMap<>(Setting.class);

    public PlayerSettings(UUID uuid) {
        this.uuid = uuid;
        for (Setting setting : Setting.values()) values.put(setting, true);
    }

    public UUID uuid() { return uuid; }
    public boolean get(Setting setting) { return values.getOrDefault(setting, true); }
    public void set(Setting setting, boolean value) { values.put(setting, value); }
    public void toggle(Setting setting) { set(setting, !get(setting)); }
    public void reset() { for (Setting setting : Setting.values()) set(setting, true); }
    public Map<Setting, Boolean> values() { return values; }
    public String serialize() {
        return values.entrySet().stream().map(e -> e.getKey().name() + ":" + e.getValue()).collect(Collectors.joining(","));
    }
}
