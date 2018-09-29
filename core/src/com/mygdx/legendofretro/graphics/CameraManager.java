package com.mygdx.legendofretro.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 *  This class instantiates an OrthographicCamera object and makes the necessary initializations. It also has a field referenceZoom
 *  which holds the level of zoom that was set after the last completed zooming gesture.
 *  The OrthographicCamera object, it's level of zoom and the referenceZoom field may all be accessed through getters and setters except for the
 *  OrthographicCamera object which is final and thus doesn't have a setter.
 */
public class CameraManager {
    private final OrthographicCamera orthographicCamera;
    private float referenceZoom;

    public CameraManager() {
        orthographicCamera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        orthographicCamera.position.set(Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2, 0);
        referenceZoom = 0.25f;
        orthographicCamera.zoom = referenceZoom;
    }

    public OrthographicCamera getOrthographicCamera() {
        return orthographicCamera;
    }

    public float getZoom(){
        return orthographicCamera.zoom;
    }

    public float getReferenceZoom() {
        return referenceZoom;
    }

    public void setZoom(float zoom){
        orthographicCamera.zoom = zoom;
    }
    
    public void setReferenceZoom(float currentZoom) {
        this.referenceZoom = currentZoom;
    }
}
