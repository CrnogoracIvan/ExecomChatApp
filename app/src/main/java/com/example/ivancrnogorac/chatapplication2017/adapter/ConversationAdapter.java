package com.example.ivancrnogorac.chatapplication2017.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.ivancrnogorac.chatapplication2017.dao.ConversationDao;
import com.example.ivancrnogorac.chatapplication2017.model.BaseModel;
import com.example.ivancrnogorac.chatapplication2017.model.Conversation;
import com.example.ivancrnogorac.chatapplication2017.view.ConversationItemView;
import com.example.ivancrnogorac.chatapplication2017.view.ConversationItemView_;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EView;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Crnogorac on 5/7/2017.
 */
@EBean
public class ConversationAdapter extends BaseAdapter {

    private List<Conversation> conversations = new ArrayList<>();
    @Bean
    ConversationDao conversationDao;
    @AfterInject
    void init(){
        setConversations(conversationDao.getConversations());
    }


    @RootContext
    Context context;

    @Override
    public int getCount() {
        return conversations.size();
    }

    @Override
    public Conversation getItem(int position) {
        return conversations.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        final ConversationItemView conversationItemView;
        if (convertView == null) {
            conversationItemView = ConversationItemView_.build(context);
        } else {
            conversationItemView = (ConversationItemView) convertView;
        }

        conversationItemView.bind(getItem(position));

        return conversationItemView;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
        notifyDataSetChanged();

    }
}