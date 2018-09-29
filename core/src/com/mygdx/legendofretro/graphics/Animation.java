package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


/**
 *  The instance of this class holds an Animated sequence in the form of an TextureRegion array called spriteArray. It also has a field
 *  secondsPerSprite which decides how many seconds each sprite of the animation should be played.
 *  Both spriteArray and secondsPerSprite is passed to the constructor and set as final.
 *  The class also holds a method update() which updates the currentSprite, in other words, it makes sure that the animation play forward. The currentSprite may
 *  then be accessed throughout the code by the getCurrentSprite() method.
 */
public class Animation {
    private final TextureRegion[] spriteArray;
    private TextureRegion currentSprite;
    private final float secondsPerSprite;
    private float currentSpriteTime;
    private int currentIndex;


    public Animation(final TextureRegion[] spriteArray, final float secondsPerSprite) {
        this.spriteArray = spriteArray;
        this.secondsPerSprite = secondsPerSprite;
        currentSpriteTime = 0;
        currentIndex = 0;
    }

    /**
     * This method updates the currentSprite. That is, if the currentSprite has been played it's secondsPerSprite time or longer, the currentSprite will be set
     * to the next index in the spriteArray, or if it was already in the last index, set it back to the first index.
     */
    public void update(){
        currentSpriteTime = currentSpriteTime + Gdx.graphics.getRawDeltaTime();
        if(currentSpriteTime >= secondsPerSprite){
            currentSpriteTime = 0;
            currentIndex++;
        }
        if(currentIndex == spriteArray.length) currentIndex = 0;
        currentSprite = spriteArray[currentIndex];
    }

    public TextureRegion getCurrentSprite() {
        return currentSprite;
    }
}
