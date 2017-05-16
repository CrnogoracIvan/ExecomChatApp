package com.example.ivancrnogorac.chatapplication2017.eventBus;

import com.squareup.otto.Bus;

import org.androidannotations.annotations.EBean;

/**
 * Created by Ivan Crnogorac on 5/13/2017.
 */

@EBean(scope = EBean.Scope.Singleton)
public class OttoBus extends Bus {

}