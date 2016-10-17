package com.baidu.trackshow;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

import cn.jpush.android.api.JPushInterface;

public class TrackApplication extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    public static void showMessage(String message) {
        Looper.prepare();
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        Looper.loop();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
