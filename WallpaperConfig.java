package com.livewallpaperapi.api;

public class WallpaperConfig {
    public static final boolean ANIMATION_ENABLED = true;
    public static final int FRAME_COUNT = 578
    public static final int FPS = 60;
    public static final String WALLPAPER_PATH = "wallpapers/elaina";

    public WallpaperConfig() {
    }

    public WallpaperConfig(boolean animated, int frameCount, int fps, int cacheWindow) {
        this.animated = animated;
        this.frameCount = frameCount;
        this.fps = fps;
        this.cacheWindow = cacheWindow;
    }
}
