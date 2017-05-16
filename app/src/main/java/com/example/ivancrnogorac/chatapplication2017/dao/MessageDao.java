package com.example.ivancrnogorac.chatapplication2017.dao;

import com.example.ivancrnogorac.chatapplication2017.model.Conversation;
import com.example.ivancrnogorac.chatapplication2017.model.Message;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.androidannotations.annotations.EBean;

/**
 * Created by Ivan Crnogorac on 5/13/2017.
 */


@EBean
public class MessageDao {
    private static final String MESSAGE_TAG = "messages";
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private Conversation conversation;

    public void initFor(Conversation conversation){
        this.conversation = conversation;
        database.getReference(ConversationDao.CONVERSATION_TAG +"/"
                + conversation.getId()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void write (Message message){
        final DatabaseReference reference =
//                database.getReference(ConversationDao.CONVERSATION_TAG +"/"
//                        + conversation.getId() + "/" + MESSAGE_TAG).push();

        database.getReference(ConversationDao.CONVERSATION_TAG)
                .child(conversation.getId())
                .child(MESSAGE_TAG).push();
        message.setId(reference.getKey());
        reference.setValue(message);
    }
}
