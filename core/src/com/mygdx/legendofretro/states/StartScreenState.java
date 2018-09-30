package com.mygdx.legendofretro.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.legendofretro.Handler;

/**
 * The State subclass which shows the start screen.
 */
public class StartScreenState extends State {
    public StartScreenState(Handler handler) {
        super(handler);
    }

    @Override
    public void update() {

    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void tap(float x, float y, int count, int button) {
        handler.getStateManager().setCurrentState(handler.getStateManager().getGameState());
    }
}
