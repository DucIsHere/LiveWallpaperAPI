package com.livewallpaperapi.api;

public class WallpaperConfig {
    public boolean animated = false;
    public int frameCount = 1;
    public int fps = 30;
    public int cacheWindow = 8;

    public WallpaperConfig() {
    }

    public WallpaperConfig(boolean animated, int frameCount, int fps, int cacheWindow) {
        this.animated = animated;
        this.frameCount = frameCount;
        this.fps = fps;
        this.cacheWindow = cacheWindow;
    }
}
