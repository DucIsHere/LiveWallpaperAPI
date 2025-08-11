package com.livewallpaperapi.api;

import net.minecraft.client.texture.NativeImage;
import java.io.File;
import java.io.IOException;

public class ImageUtils {

    public static NativeImage loadImage(File file) throws IOException {
        return NativeImage.read(file);
    }

    public static NativeImage[] loadFrames(File folder, int frameCount) throws IOException {
        NativeImage[] frames = new NativeImage[frameCount];
        for (int i = 0; i < frameCount; i++) {
            File frameFile = new File(folder, String.format("frame_%04d.png", i + 1));
            if (frameFile.exists()) {
                frames[i] = loadImage(frameFile);
            } else {
                frames[i] = null;
            }
        }
        return frames;
    }
}
