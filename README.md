# Settings+

Settings+ is a Paper 1.21.11 plugin that gives every player a persistent personal-settings menu using the native Bukkit/Paper inventory UI.

## Features
- 120+ individual toggles across Chat, Visual, Audio, Social, Gameplay, Interface, Performance and Notifications.
- Persistent per-player YAML settings.
- Native 54-slot inventory GUI with category navigation, pagination, ON/OFF indicators and reset controls.
- `/settings`, `/setting`, `/options`, and `/preferences` aliases.
- No client mod or resource pack required.
- Java 21 and Paper 1.21.11.

## Build

```bash
./gradlew build
```

The shaded plugin JAR is created in `build/libs/`.

## Install
Copy the non-`plain` JAR to your Paper server's `plugins` folder and restart the server.

## Important behavior
Settings+ stores personal preferences and provides the UI. Some toggles are preference flags intended for integrations with other server systems (for example friends, economy, auctions, clans, and custom holograms). The plugin does not pretend to control systems that are not installed.
