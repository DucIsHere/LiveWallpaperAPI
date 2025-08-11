package com.livewallpaperapi.api;

import net.minecraft.client.texture.NativeImage;

import java.util.LinkedHashMap;
import java.util.Map;

public class WallpaperCache {
    private final Map<Integer, NativeImage> frameCache;
    private final int cacheSize;

    public WallpaperCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.frameCache = new LinkedHashMap<>() {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, NativeImage> eldest) {
                if (size() > WallpaperCache.this.cacheSize) {
                    eldest.getValue().close();
                    return true;
                }
                return false;
            }
        };
    }

    public void put(int frameIndex, NativeImage image) {
        frameCache.put(frameIndex, image);
    }

    public NativeImage get(int frameIndex) {
        return frameCache.get(frameIndex);
    }

    public void clear() {
        frameCache.values().forEach(NativeImage::close);
        frameCache.clear();
    }
}
