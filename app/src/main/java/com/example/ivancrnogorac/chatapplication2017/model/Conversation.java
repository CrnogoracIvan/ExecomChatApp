package com.example.ivancrnogorac.chatapplication2017.model;

/**
 * Created by Ivan Crnogorac on 5/7/2017.
 */

public class Conversation extends BaseModel {

    private String title;

    public Conversation(String id, String title) {
        super(id);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conversation{");
        sb.append("title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
