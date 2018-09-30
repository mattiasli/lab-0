package com.mygdx.legendofretro.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.legendofretro.Handler;

public class InputManager implements GestureDetector.GestureListener {

    private final Handler handler;

    public InputManager(Handler handler) {
        this.handler = handler;
    }

    public void initialize(){
        Gdx.input.setInputProcessor(new GestureDetector(this));
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        handler.getStateManager().tap(x, y, count, button);
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        return false;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
        handler.getCameraManager().setZoom(handler.getCameraManager().getReferenceZoom() * (initialDistance / distance));
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        return false;
    }

    @Override
    public void pinchStop() {
        handler.getCameraManager().setReferenceZoom(handler.getCameraManager().getZoom());
    }
}
