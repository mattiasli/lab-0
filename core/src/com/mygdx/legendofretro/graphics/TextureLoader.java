package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * This class loads and initializes a sprite sheet in the form of a Texture field which are made available through a getter.
 * The class also has a dispose() method for disposing the Texture.
 */
public class TextureLoader {
    private final Texture texture;

    public TextureLoader() {
        texture = new Texture(Gdx.files.internal("spritesheet.png"));
    }

    public void dispose(){
        texture.dispose();
    }

    public Texture getTexture() {
        return texture;
    }
}
