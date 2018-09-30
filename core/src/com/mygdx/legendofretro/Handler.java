package com.mygdx.legendofretro;

import com.mygdx.legendofretro.graphics.AnimatedSpriteManager;
import com.mygdx.legendofretro.camera.CameraManager;
import com.mygdx.legendofretro.graphics.StillSpriteManager;
import com.mygdx.legendofretro.graphics.TextureLoader;
import com.mygdx.legendofretro.graphics.TextureRegionCropper;

public class Handler {
    private final CameraManager cameraManager;
    private final TextureLoader textureLoader;
    private final TextureRegionCropper textureRegionCropper;
    private final StillSpriteManager stillSpriteManager;
    private final AnimatedSpriteManager animatedSpriteManager;
    private final InputManager inputManager;

    public Handler() {
        cameraManager = new CameraManager();
        textureLoader = new TextureLoader();
        textureRegionCropper = new TextureRegionCropper(this);
        stillSpriteManager = new StillSpriteManager(this);
        animatedSpriteManager = new AnimatedSpriteManager(this);
        inputManager = new InputManager(this);
    }

    public void initialize(){
        stillSpriteManager.initialize();
        animatedSpriteManager.initialize();
        inputManager.initialize();
    }

    public CameraManager getCameraManager() {
        return cameraManager;
    }

    public TextureLoader getTextureLoader() {
        return textureLoader;
    }

    public TextureRegionCropper getTextureRegionCropper() {
        return textureRegionCropper;
    }

    public StillSpriteManager getStillSpriteManager() {
        return stillSpriteManager;
    }

    public AnimatedSpriteManager getAnimatedSpriteManager() {
        return animatedSpriteManager;
    }

    public InputManager getInputManager() {
        return inputManager;
    }
}
