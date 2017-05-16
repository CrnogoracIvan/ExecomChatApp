package com.example.ivancrnogorac.chatapplication2017.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ivan Crnogorac on 5/13/2017.
 */

public class Message extends BaseModel implements Serializable {

    private String text;

    private Date timeStamp;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
        this.timeStamp = new Date();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("text='").append(text).append('\'');
        sb.append(", timeStamp=").append(timeStamp);
        sb.append('}');
        return sb.toString();
    }
}
