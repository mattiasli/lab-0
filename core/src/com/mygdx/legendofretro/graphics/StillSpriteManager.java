package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.legendofretro.Handler;

/**
 * This class holds still sprites in the form of TextureRegion fields which it initializes in its initialize() method.
 * The TextureRegion fields are then made available throughout the code by getters.
 */
public class StillSpriteManager {
    private final Handler handler;

    private TextureRegion playerLeft, playerUp, playerRight, playerDown;
    private TextureRegion dirt;
    private TextureRegion rock, leftEdgeRock, upperLeftCornerRock, upperEdgeRock, upperRightCornerRock, rightEdgeRock, lowerRightCornerRock, lowerEdgeRock, lowerLeftCornerRock, loneRock;
    private TextureRegion redDirt;
    private TextureRegion redRock, leftEdgeRedRock, upperLeftCornerRedRock, upperEdgeRedRock, upperRightCornerRedRock, rightEdgeRedRock, lowerRightCornerRedRock, lowerEdgeRedRock, lowerLeftCornerRedRock, loneRedRock;

    private TextureRegion ghoulDirt;
    private TextureRegion ghoulRock, leftEdgeGhoulRock, upperLeftCornerGhoulRock, upperEdgeGhoulRock, upperRightCornerGhoulRock, rightEdgeGhoulRock, lowerRightCornerGhoulRock, lowerEdgeGhoulRock, lowerLeftCornerGhoulRock, loneGhoulRock;

    private TextureRegion water, leftEdgeWater, upperLeftCornerWater, upperEdgeWater, upperRightCornerWater, rightEdgeWater, lowerRightCornerWater, lowerEdgeWater, lowerLeftCornerWater, loneWater;
    private TextureRegion lantern;
    private TextureRegion smallHouseA, smallHouseB, smallHouseC, smallHouseD;
    private TextureRegion doorHouseA, doorHouseB, doorHouseC, doorHouseD;
    private TextureRegion palaceA, palaceB;
    private TextureRegion smallTree;
    private TextureRegion tallTree;

    public StillSpriteManager(final Handler handler) {
        this.handler = handler;

        playerLeft = null;
        playerUp = null;
        playerRight = null;
        playerDown = null;
        dirt = null;
        rock = null;
        leftEdgeRock = null;
        upperLeftCornerRock = null;
        upperEdgeRock = null;
        upperRightCornerRock = null;
        rightEdgeRock = null;
        lowerRightCornerRock = null;
        lowerEdgeRock = null;
        lowerLeftCornerRock = null;
        loneRock = null;
        redDirt = null;
        redRock = null;
        leftEdgeRedRock = null;
        upperLeftCornerRedRock = null;
        upperEdgeRedRock = null;
        upperRightCornerRedRock = null;
        rightEdgeRedRock = null;
        lowerRightCornerRedRock = null;
        lowerEdgeRedRock = null;
        lowerLeftCornerRedRock = null;
        loneRedRock = null;

        ghoulDirt = null;
        ghoulRock = null;
        leftEdgeGhoulRock = null;
        upperLeftCornerGhoulRock = null;
        upperEdgeGhoulRock = null;
        upperRightCornerGhoulRock = null;
        rightEdgeGhoulRock = null;
        lowerRightCornerGhoulRock = null;
        lowerEdgeGhoulRock = null;
        lowerLeftCornerGhoulRock = null;
        loneGhoulRock = null;

        water = null;
        leftEdgeWater = null;
        upperLeftCornerWater = null;
        upperEdgeWater = null;
        upperRightCornerWater = null;
        rightEdgeWater = null;
        lowerRightCornerWater = null;
        lowerEdgeWater = null;
        lowerLeftCornerWater = null;
        loneWater = null;
        lantern = null;
        smallHouseA = null;
        smallHouseB = null;
        smallHouseC = null;
        smallHouseD = null;
        doorHouseA = null;
        doorHouseB = null;
        doorHouseC = null;
        doorHouseD = null;
        palaceA = null;
        palaceB = null;
        smallTree = null;
        tallTree = null;
    }

    public void initialize(){
        TextureRegionCropper textureRegionCropper = handler.getTextureRegionCropper();

        playerLeft = textureRegionCropper.getSprite(1,0,1,1);
        playerUp = textureRegionCropper.getSprite(3,0,1,1);
        playerRight = textureRegionCropper.getSprite(5,0,1,1);
        playerDown = textureRegionCropper.getSprite(7,0,1,1);
        dirt = textureRegionCropper.getSprite(10,2,1,1);
        rock = textureRegionCropper.getSprite(0,2,1,1);
        leftEdgeRock = textureRegionCropper.getSprite(1,2,1,1);
        upperLeftCornerRock = textureRegionCropper.getSprite(2,2,1,1);
        upperEdgeRock = textureRegionCropper.getSprite(3,2,1,1);
        upperRightCornerRock = textureRegionCropper.getSprite(4,2,1,1);
        rightEdgeRock = textureRegionCropper.getSprite(5,2,1,1);
        lowerRightCornerRock = textureRegionCropper.getSprite(6,2,1,1);
        lowerEdgeRock = textureRegionCropper.getSprite(7,2,1,1);
        lowerLeftCornerRock = textureRegionCropper.getSprite(8,2,1,1);
        loneRock = textureRegionCropper.getSprite(9,2,1,1);
        redDirt = textureRegionCropper.getSprite(10,1,1,1);
        redRock = textureRegionCropper.getSprite(0,1,1,1);
        leftEdgeRedRock = textureRegionCropper.getSprite(1,1,1,1);
        upperLeftCornerRedRock = textureRegionCropper.getSprite(2,1,1,1);
        upperEdgeRedRock = textureRegionCropper.getSprite(3,1,1,1);
        upperRightCornerRedRock = textureRegionCropper.getSprite(4,1,1,1);
        rightEdgeRedRock = textureRegionCropper.getSprite(5,1,1,1);
        lowerRightCornerRedRock = textureRegionCropper.getSprite(6,1,1,1);
        lowerEdgeRedRock = textureRegionCropper.getSprite(7,1,1,1);
        lowerLeftCornerRedRock = textureRegionCropper.getSprite(8,1,1,1);
        loneRedRock = textureRegionCropper.getSprite(9,1,1,1);

        ghoulDirt = textureRegionCropper.getSprite(10,3,1,1);
        ghoulRock = textureRegionCropper.getSprite(0,3,1,1);
        leftEdgeGhoulRock = textureRegionCropper.getSprite(1,3,1,1);
        upperLeftCornerGhoulRock = textureRegionCropper.getSprite(2,3,1,1);
        upperEdgeGhoulRock = textureRegionCropper.getSprite(3,3,1,1);
        upperRightCornerGhoulRock = textureRegionCropper.getSprite(4,3,1,1);
        rightEdgeGhoulRock = textureRegionCropper.getSprite(5,3,1,1);
        lowerRightCornerGhoulRock = textureRegionCropper.getSprite(6,3,1,1);
        lowerEdgeGhoulRock = textureRegionCropper.getSprite(7,3,1,1);
        lowerLeftCornerGhoulRock = textureRegionCropper.getSprite(8,3,1,1);
        loneGhoulRock = textureRegionCropper.getSprite(9,3,1,1);

        water = textureRegionCropper.getSprite(1,7,1,1);
        leftEdgeWater = textureRegionCropper.getSprite(2,7,1,1);
        upperLeftCornerWater = textureRegionCropper.getSprite(3,7,1,1);
        upperEdgeWater = textureRegionCropper.getSprite(4,7,1,1);
        upperRightCornerWater = textureRegionCropper.getSprite(5,7,1,1);
        rightEdgeWater = textureRegionCropper.getSprite(6,7,1,1);
        lowerRightCornerWater = textureRegionCropper.getSprite(7,7,1,1);
        lowerEdgeWater = textureRegionCropper.getSprite(8,7,1,1);
        lowerLeftCornerWater = textureRegionCropper.getSprite(9,7,1,1);
        loneWater = textureRegionCropper.getSprite(10,7,1,1);
        lantern = textureRegionCropper.getSprite(4,4,1,1);
        smallHouseA = textureRegionCropper.getSprite(0,5,3,2);
        smallHouseB = textureRegionCropper.getSprite(3,5,3,2);
        smallHouseC = textureRegionCropper.getSprite(6,5,3,2);
        smallHouseD = textureRegionCropper.getSprite(9,5,3,2);
        doorHouseA = textureRegionCropper.getSprite(2*6,5,4,2);
        doorHouseB = textureRegionCropper.getSprite(4*4,5,4,2);
        doorHouseC = textureRegionCropper.getSprite(4*5,5,4,2);
        doorHouseD = textureRegionCropper.getSprite(4*6,5,4,2);
        palaceA = textureRegionCropper.getSprite(2*6,1,6,4);
        palaceB = textureRegionCropper.getSprite(3*6,1,6,4);
        smallTree = textureRegionCropper.getSprite(3,4,1,1);
        tallTree = textureRegionCropper.getSprite(0,7,1,2);
    }

    public TextureRegion getPlayerLeft() {
        return playerLeft;
    }

    public TextureRegion getPlayerUp() {
        return playerUp;
    }

    public TextureRegion getPlayerRight() {
        return playerRight;
    }

    public TextureRegion getPlayerDown() {
        return playerDown;
    }

    public TextureRegion getDirt() {
        return dirt;
    }

    public TextureRegion getRock() {
        return rock;
    }

    public TextureRegion getLeftEdgeRock() {
        return leftEdgeRock;
    }

    public TextureRegion getUpperLeftCornerRock() {
        return upperLeftCornerRock;
    }

    public TextureRegion getUpperEdgeRock() {
        return upperEdgeRock;
    }

    public TextureRegion getUpperRightCornerRock() {
        return upperRightCornerRock;
    }

    public TextureRegion getRightEdgeRock() {
        return rightEdgeRock;
    }

    public TextureRegion getLowerRightCornerRock() {
        return lowerRightCornerRock;
    }

    public TextureRegion getLowerEdgeRock() {
        return lowerEdgeRock;
    }

    public TextureRegion getLowerLeftCornerRock() {
        return lowerLeftCornerRock;
    }

    public TextureRegion getLoneRock() {
        return loneRock;
    }

    public TextureRegion getRedDirt() {
        return redDirt;
    }

    public TextureRegion getRedRock() {
        return redRock;
    }

    public TextureRegion getLeftEdgeRedRock() {
        return leftEdgeRedRock;
    }

    public TextureRegion getUpperLeftCornerRedRock() {
        return upperLeftCornerRedRock;
    }

    public TextureRegion getUpperEdgeRedRock() {
        return upperEdgeRedRock;
    }

    public TextureRegion getUpperRightCornerRedRock() {
        return upperRightCornerRedRock;
    }

    public TextureRegion getRightEdgeRedRock() {
        return rightEdgeRedRock;
    }

    public TextureRegion getLowerRightCornerRedRock() {
        return lowerRightCornerRedRock;
    }

    public TextureRegion getLowerEdgeRedRock() {
        return lowerEdgeRedRock;
    }

    public TextureRegion getLowerLeftCornerRedRock() {
        return lowerLeftCornerRedRock;
    }

    public TextureRegion getLoneRedRock() {
        return loneRedRock;
    }

    public TextureRegion getGhoulDirt() {
        return ghoulDirt;
    }

    public TextureRegion getGhoulRock() {
        return ghoulRock;
    }

    public TextureRegion getLeftEdgeGhoulRock() {
        return leftEdgeGhoulRock;
    }

    public TextureRegion getUpperLeftCornerGhoulRock() {
        return upperLeftCornerGhoulRock;
    }

    public TextureRegion getUpperEdgeGhoulRock() {
        return upperEdgeGhoulRock;
    }

    public TextureRegion getUpperRightCornerGhoulRock() {
        return upperRightCornerGhoulRock;
    }

    public TextureRegion getRightEdgeGhoulRock() {
        return rightEdgeGhoulRock;
    }

    public TextureRegion getLowerRightCornerGhoulRock() {
        return lowerRightCornerGhoulRock;
    }

    public TextureRegion getLowerEdgeGhoulRock() {
        return lowerEdgeGhoulRock;
    }

    public TextureRegion getLowerLeftCornerGhoulRock() {
        return lowerLeftCornerGhoulRock;
    }

    public TextureRegion getLoneGhoulRock() {
        return loneGhoulRock;
    }

    public TextureRegion getWater() {
        return water;
    }

    public TextureRegion getLeftEdgeWater() {
        return leftEdgeWater;
    }

    public TextureRegion getUpperLeftCornerWater() {
        return upperLeftCornerWater;
    }

    public TextureRegion getUpperEdgeWater() {
        return upperEdgeWater;
    }

    public TextureRegion getUpperRightCornerWater() {
        return upperRightCornerWater;
    }

    public TextureRegion getRightEdgeWater() {
        return rightEdgeWater;
    }

    public TextureRegion getLowerRightCornerWater() {
        return lowerRightCornerWater;
    }

    public TextureRegion getLowerEdgeWater() {
        return lowerEdgeWater;
    }

    public TextureRegion getLowerLeftCornerWater() {
        return lowerLeftCornerWater;
    }

    public TextureRegion getLoneWater() {
        return loneWater;
    }

    public TextureRegion getLantern() {
        return lantern;
    }

    public TextureRegion getSmallHouseA() {
        return smallHouseA;
    }

    public TextureRegion getSmallHouseB() {
        return smallHouseB;
    }

    public TextureRegion getSmallHouseC() {
        return smallHouseC;
    }

    public TextureRegion getSmallHouseD() {
        return smallHouseD;
    }

    public TextureRegion getDoorHouseA() {
        return doorHouseA;
    }

    public TextureRegion getDoorHouseB() {
        return doorHouseB;
    }

    public TextureRegion getDoorHouseC() {
        return doorHouseC;
    }

    public TextureRegion getDoorHouseD() {
        return doorHouseD;
    }

    public TextureRegion getPalaceA() {
        return palaceA;
    }

    public TextureRegion getPalaceB() {
        return palaceB;
    }

    public TextureRegion getSmallTree() {
        return smallTree;
    }

    public TextureRegion getTallTree() {
        return tallTree;
    }
}
