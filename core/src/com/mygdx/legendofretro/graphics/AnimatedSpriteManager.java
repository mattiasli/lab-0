package com.mygdx.legendofretro.graphics;

import com.mygdx.legendofretro.Handler;

/**
 *  This class instantiates and manages all the Animation objects necessary throughout the code. More specifically, it instantiates all Animation objects,
 *  then calls their update() methods making sure the animations are actually playing. These Animation objects are then made available throughout the code
 *  by getter methods.
 */
public class AnimatedSpriteManager {
    private final Handler handler;
    private Animation playerLeft, playerUp, playerRight, playerDown;
    private Animation iceFlower;
    private Animation womanLeft, womanUp, womanRight, womanDown;

    public AnimatedSpriteManager(final Handler handler) {
        this.handler = handler;
        playerLeft = null;
        playerUp = null;
        playerRight = null;
        playerDown = null;
        iceFlower = null;
        womanLeft = null;
        womanUp = null;
        womanRight = null;
        womanDown = null;
    }

    public void initialize(){
        playerLeft = new Animation(handler.getTextureRegionCropper().getSpriteArray(0, 1, 0, 1, 1),0.2f);
        playerUp = new Animation(handler.getTextureRegionCropper().getSpriteArray(2, 3, 0, 1, 1),0.2f);
        playerRight = new Animation(handler.getTextureRegionCropper().getSpriteArray(4, 5, 0, 1, 1),0.2f);
        playerDown = new Animation(handler.getTextureRegionCropper().getSpriteArray(6, 7, 0, 1, 1),0.2f);
        iceFlower = new Animation(handler.getTextureRegionCropper().getSpriteArray(0, 2, 4, 1, 1),0.6f);
        womanLeft = new Animation(handler.getTextureRegionCropper().getSpriteArray(0, 1, 9, 1, 1),0.6f);
        womanUp = new Animation(handler.getTextureRegionCropper().getSpriteArray(2, 3, 9, 1, 1),0.6f);
        womanRight = new Animation(handler.getTextureRegionCropper().getSpriteArray(4, 5, 9, 1, 1),0.6f);
        womanDown = new Animation(handler.getTextureRegionCropper().getSpriteArray(6, 7, 9, 1, 1),0.6f);
    }

    public void update(){
        playerLeft.update();
        playerUp.update();
        playerRight.update();
        playerDown.update();
        iceFlower.update();
        womanLeft.update();
        womanUp.update();
        womanRight.update();
        womanDown.update();
    }

    public Animation getPlayerLeft() {
        return playerLeft;
    }

    public Animation getPlayerUp() {
        return playerUp;
    }

    public Animation getPlayerRight() {
        return playerRight;
    }

    public Animation getPlayerDown() {
        return playerDown;
    }

    public Animation getIceFlower() {
        return iceFlower;
    }

    public Animation getWomanLeft() {
        return womanLeft;
    }

    public Animation getWomanUp() {
        return womanUp;
    }

    public Animation getWomanRight() {
        return womanRight;
    }

    public Animation getWomanDown() {
        return womanDown;
    }
}
