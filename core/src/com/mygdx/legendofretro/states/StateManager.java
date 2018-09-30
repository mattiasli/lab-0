package com.mygdx.legendofretro.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.legendofretro.Handler;

/**
 * The instance of this class manages the various states in the game. The instantiated class holds all the states in
 * its private fields and has methods for updating and rendering the state currently running. It also has methods for getting
 * and setting the currently running state currentState.
 */
public class StateManager {

    private final Handler handler;
    private State currentState;


    public StateManager(final Handler handler) {
        this.handler = handler;
        currentState = null;
    }

    public void initialize(){
    }

    public void update(){
        currentState.update();
    }

    public void render(SpriteBatch sb){
        currentState.render(sb);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
