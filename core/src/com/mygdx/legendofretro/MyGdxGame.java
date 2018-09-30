package com.mygdx.legendofretro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
    public static final int DEFAULT_SPRITE_WIDTH = 16;
    public static final int DEFAULT_SPRITE_HEIGHT = 16;

	private SpriteBatch batch;
	private Handler handler;

	private boolean initialized;

	@Override
	public void create () {
		batch = new SpriteBatch();
		handler = new Handler();
		initialized = false;
	}

	private void initialize(){
        initialized = true;
	    handler.initialize();
    }

	private void update(){
	    handler.getAnimatedSpriteManager().update();
	    handler.getCameraManager().update();
    }

	@Override
	public void render () {
        if(!initialized) initialize();
	    update();

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		handler.getCameraManager().setProjectionMatrix(batch);
		batch.begin();

		batch.draw(handler.getTextureLoader().getTexture(), 800, 400);
		batch.draw(handler.getStillSpriteManager().getPlayerDown(), 700, 400);
        batch.draw(handler.getStillSpriteManager().getPalaceA(), 770, 500);
        batch.draw(handler.getAnimatedSpriteManager().getIceFlower().getCurrentSprite(), 700, 500);
        batch.draw(handler.getAnimatedSpriteManager().getPlayerDown().getCurrentSprite(), 755, 500);

        batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		handler.getTextureLoader().dispose();
	}

}
