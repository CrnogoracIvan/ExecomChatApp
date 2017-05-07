package com.example.ivancrnogorac.chatapplication2017.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ivancrnogorac.chatapplication2017.R;
import com.example.ivancrnogorac.chatapplication2017.model.Conversation;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.ViewById;

/**
 * Created by Ivan Crnogorac on 5/7/2017.
 */

    @EViewGroup(R.layout.item_view_conversation)
    public class ConversationItemView extends LinearLayout{

//    @RootContext
//    public Context context;

    @ViewById
    TextView title;

    public ConversationItemView (Context context){
        super(context);
    }

    public void bind (Conversation conversation){
        title.setText(conversation.getTitle());
    }

        
    };

