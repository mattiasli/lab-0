package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.legendofretro.Handler;
import com.mygdx.legendofretro.MyGdxGame;

/**
 * This class has methods for returning sprites and sprite arrays as TextureRegion and TextureRegion[] from
 * the Texture held in the TextureLoader object.
 */
public class TextureRegionCropper {
    private final Handler handler;

    public TextureRegionCropper(final Handler handler) {
        this.handler = handler;
    }

    public TextureRegion getSprite(int spriteGridX, int spriteGridY, int spriteGridWidth, int spriteGridHeight){
        return new TextureRegion(handler.getTextureLoader().getTexture(), spriteGridX * MyGdxGame.DEFAULT_SPRITE_WIDTH, spriteGridY * MyGdxGame.DEFAULT_SPRITE_HEIGHT,spriteGridWidth * MyGdxGame.DEFAULT_SPRITE_WIDTH, spriteGridHeight * MyGdxGame.DEFAULT_SPRITE_HEIGHT);
    }

    public TextureRegion[] getSpriteArray(int fromGridX, int toGridX, int yFrame, int spriteWidthInGrid, int spriteHeightInFrames){
        TextureRegion[] textureRegionArray = new TextureRegion[toGridX - fromGridX + 1];
        for (int i = fromGridX; i <= toGridX; i++) {
            textureRegionArray[i - fromGridX] = getSprite(i, yFrame, spriteWidthInGrid, spriteHeightInFrames);
        }
        return textureRegionArray;
    }
}
