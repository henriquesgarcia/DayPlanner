package com.example.henrique.dayplanner.dal;

import android.app.Application;

import com.example.henrique.dayplanner.model.MyObjectBox;

import io.objectbox.BoxStore;

public class App extends Application {

    private BoxStore boxStore;

    @Override
    public void onCreate() {
        super.onCreate();
        boxStore = MyObjectBox.builder().androidContext(this).build();
    }

    public BoxStore getBoxStore() { return boxStore; }
}
