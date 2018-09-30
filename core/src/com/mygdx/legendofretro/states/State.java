package com.mygdx.legendofretro.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.legendofretro.Handler;

/**
 * This abstract State class makes sure that all the States in the game such as GameState StartScreenState etc have an update() method
 * and a render() method, in short, this abstract class is made for guaranteeing uniformity.
 */
public abstract class State {

    protected final Handler handler;

    public State(final Handler handler) {
        this.handler = handler;
    }

    abstract public void update();

    abstract public void render(SpriteBatch sb);

    abstract public void tap(float x, float y, int count, int button);
}
