package com.example.ivancrnogorac.chatapplication2017.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

import com.example.ivancrnogorac.chatapplication2017.R;
import com.example.ivancrnogorac.chatapplication2017.fragment.CreateMessageFragment;
import com.example.ivancrnogorac.chatapplication2017.model.Conversation;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.FragmentByTag;

import static com.example.ivancrnogorac.chatapplication2017.R.id.recyclerView;

@EActivity (R.layout.activity_conversation)
public class ConversationActivity extends AppCompatActivity {

    @Extra
    Conversation conversation;

    @FragmentByTag
    CreateMessageFragment createMessageFragment;

    @AfterViews
    void init (){
        createMessageFragment.initFor(conversation);
       // initRecyclerView();

    }

//    private void initRecyclerView(){
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true));
//    }
}
