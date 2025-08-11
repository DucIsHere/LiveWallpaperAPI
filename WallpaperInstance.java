package com.livewallpaperapi.api;

import net.minecraft.client.MinecraftClient;

public class WallpaperManager {
    private WallpaperInstance currentWallpaper;

    public void setWallpaper(WallpaperDescriptor descriptor) {
        clearWallpaper();
        currentWallpaper = new WallpaperInstance(descriptor);
    }

    public void clearWallpaper() {
        if (currentWallpaper != null) {
            currentWallpaper.close();
            currentWallpaper = null;
        }
    }

    public void tick() {
        if (currentWallpaper != null) {
            currentWallpaper.tick();
        }
    }

    public void render() {
        if (currentWallpaper != null && currentWallpaper.getCurrentFrame() != null) {
            // TODO: render the frame as background
        }
    }
}
