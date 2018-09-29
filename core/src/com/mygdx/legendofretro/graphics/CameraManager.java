package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class CameraManager {
    private OrthographicCamera orthographicCamera;
    private float currentZoom;

    public CameraManager() {
        orthographicCamera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        orthographicCamera.position.set(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2, 0);
        currentZoom = 0.25f;
        orthographicCamera.zoom = currentZoom;
    }

    public OrthographicCamera getOrthographicCamera() {
        return orthographicCamera;
    }

    public float getCurrentZoom() {
        return currentZoom;
    }

    public void setCurrentZoom(float currentZoom) {
        this.currentZoom = currentZoom;
    }
}
