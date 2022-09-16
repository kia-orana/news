package com.ins.news;

import android.app.Application;

import androidx.room.Room;

import com.facebook.stetho.Stetho;
import com.ins.news.database.NewsDatabase;

public class NewsApplication extends Application {

    private static NewsDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        db = Room.databaseBuilder(this, NewsDatabase.class, "news_db").build();
    }

    public static NewsDatabase getDatabase() {
        return db;
    }
}
