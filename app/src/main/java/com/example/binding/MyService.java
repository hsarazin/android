package com.example.binding;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {

    private final IBinder binder = new MonBinder();

    public class MonBinder extends Binder {
        MyService getService(){
            return MyService.this;
        }
    }

    public void onCreate(){}

    public void onDestroy(){}

    public int onStartCommand(Intent intent, int flags, int startId){
        return START_STICKY;
    }

    public IBinder onBind(Intent arg0){
        return binder;
    }
}
