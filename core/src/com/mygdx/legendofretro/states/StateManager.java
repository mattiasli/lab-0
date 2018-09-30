package com.mygdx.legendofretro.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.legendofretro.Handler;

/**
 * The instance of this class manages the various states in the game. The instantiated class holds all the State objects references in
 * its private fields and has methods for updating and rendering the state currently running. It also has methods for getting
 * and setting the currently running state currentState.
 */
public class StateManager {

    private final Handler handler;
    private State currentState, startScreenState, gameState;


    public StateManager(final Handler handler) {
        this.handler = handler;
        currentState = null;
        startScreenState = null;
        gameState = null;
    }

    public void initialize(){
        startScreenState = new StartScreenState(handler);
        gameState = new GameState(handler);
        currentState = startScreenState;
    }

    public void update(){
        currentState.update();
    }

    public void render(SpriteBatch sb){
        currentState.render(sb);
    }

    public void tap(float x, float y, int count, int button){
        currentState.tap(x, y, count, button);
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getGameState() {
        return gameState;
    }
}
