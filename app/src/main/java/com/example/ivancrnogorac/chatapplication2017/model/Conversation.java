package com.example.ivancrnogorac.chatapplication2017.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Ivan Crnogorac on 5/7/2017.
 */

public class Conversation extends BaseModel implements Serializable{

    private String title;

    private Map<String, Message> messages;
    public Conversation() {
    }

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
    

    public Map<String, Message> getMessages() {
        return messages;
    }

    public void setMessages(Map<String, Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Conversation{");
        sb.append("title='").append(title).append('\'');
        sb.append(", messages=").append(messages);
        sb.append('}');
        return sb.toString();
    }
}
