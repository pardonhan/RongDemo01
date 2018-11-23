package com.hanfl.rong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rongConnect("wcCpJd63MbB6LtzYSP5aFnYixIkMWv8/T2RKra0Iw17IGmBX7sG0NM7u5j2YHjFYvTjK30Xf9NC1XgQS/66iIA==");
    }

    private void rongConnect(String token) {
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                Log.e(TAG, "reToken Incorrect");
            }

            @Override
            public void onSuccess(String s) {
                // connectResultId = s;
                NLog.e("connect", "onSuccess userid:" + s);
               /* editor.putString(SealConst.SEALTALK_LOGIN_ID, s);
                editor.apply();
                SealUserInfoManager.getInstance().openDB();
                request(SYNC_USER_INFO, true);*/
            }

            @Override
            public void onError(RongIMClient.ErrorCode e) {
                Log.e(TAG, "onError: " + e);
            }
        });
    }
}
