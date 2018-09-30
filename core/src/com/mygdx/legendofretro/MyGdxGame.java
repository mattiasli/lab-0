package com.mygdx.legendofretro;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
    public static final int DEFAULT_SPRITE_WIDTH = 16;
    public static final int DEFAULT_SPRITE_HEIGHT = 16;

	private SpriteBatch sb;
	private Handler handler;

	private boolean initialized;

	@Override
	public void create () {
		sb = new SpriteBatch();
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
	    handler.getStateManager().update();
    }

	@Override
	public void render () {
        if(!initialized) initialize();
	    update();

		handler.getCameraManager().setProjectionMatrix(sb);
		sb.begin();
		handler.getStateManager().render(sb);
        sb.end();
	}
	
	@Override
	public void dispose () {
		sb.dispose();
		handler.getTextureLoader().dispose();
	}

}
