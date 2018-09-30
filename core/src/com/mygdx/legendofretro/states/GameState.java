package com.mygdx.legendofretro.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.legendofretro.Handler;

/**
 * The State subclass in which the game is played.
 */
public class GameState extends State {

    public GameState(Handler handler) {
        super(handler);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.draw(handler.getTextureLoader().getTexture(), 800, 400);
        sb.draw(handler.getStillSpriteManager().getPlayerDown(), 700, 400);
        sb.draw(handler.getStillSpriteManager().getPalaceA(), 770, 500);
        sb.draw(handler.getAnimatedSpriteManager().getIceFlower().getCurrentSprite(), 700, 500);
        sb.draw(handler.getAnimatedSpriteManager().getPlayerDown().getCurrentSprite(), 755, 500);
    }

    @Override
    public void tap(float x, float y, int count, int button) {

    }
}
