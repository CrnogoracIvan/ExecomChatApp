package com.example.ivancrnogorac.chatapplication2017.dao;

import com.example.ivancrnogorac.chatapplication2017.model.Conversation;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Crnogorac on 5/7/2017.
 */

@EBean
public class ConversationDao {

    private List<Conversation> conversations = new ArrayList<>();

    @AfterInject
    void init (){
        for (int i = 0; i < 10; i++) {
            conversations.add(new Conversation(null,"Fun chat " + i));
        }
    }

    public List<Conversation> getConversations() {
        return conversations;
    }
}
