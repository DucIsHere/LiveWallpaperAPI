package com.ducishere.delta;

public class LiveWallpaperAPI {

    private static WallpaperManager manager;

    public static void init(WallpaperManager wm) {
        manager = wm;
    }

    public static void setWallpaper(WallpaperDescriptor descriptor) {
        if (manager != null) {
            manager.setWallpaper(descriptor);
        }
    }

    public static void stopWallpaper() {
        if (manager != null) {
            manager.clearWallpaper();
        }
    }
}
