package com.hanfl.rong;

import android.support.multidex.MultiDexApplication;

import io.rong.imkit.RongIM;

public class App extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
        NLog.setDebug(true);//Seal Module Log 开关
    }
}
