package com.example.ivancrnogorac.chatapplication2017.model;

/**
 * Created by Ivan Crnogorac on 5/7/2017.
 */

public abstract class BaseModel {
    private String id;

    public BaseModel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
