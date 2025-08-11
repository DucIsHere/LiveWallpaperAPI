package com.livewallpaperapi.api;

import net.fabricmc.api.ClientModInitializer;

public class LiveWallpaperAPIMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        WallpaperManager wm = new WallpaperManager();
        LiveWallpaperAPI.init(wm);
    }
}
