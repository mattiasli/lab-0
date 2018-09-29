package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureLoader {
    private Texture texture;
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
