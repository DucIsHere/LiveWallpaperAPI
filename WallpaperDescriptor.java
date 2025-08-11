package com.livewallpaperapi.api;

import java.io.File;

public class WallpaperDescriptor {
    public final File folder;
    public final WallpaperConfig config;

    public WallpaperDescriptor(File folder, WallpaperConfig config) {
        this.folder = folder;
        this.config = config;
    }
}
