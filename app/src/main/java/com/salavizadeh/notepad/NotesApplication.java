package com.salavizadeh.notepad;

import android.app.Application;

import com.salavizadeh.notepad.data.DataStore;

public class NotesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataStore.init(this);
    }
}
