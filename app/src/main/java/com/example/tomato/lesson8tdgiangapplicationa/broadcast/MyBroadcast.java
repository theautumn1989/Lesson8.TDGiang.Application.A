package com.example.tomato.lesson8tdgiangapplicationa.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tomato.lesson8tdgiangapplicationa.activity.MainActivity;

public class MyBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.example.tomato.lesson8tdgiangsendbroadcast.CALL_A")) {

            Bundle bundle = intent.getExtras();
            String text = bundle.getString("hello_A");

            MainActivity.tvResult.setText(text);
            Toast.makeText(context, text, Toast.LENGTH_LONG).show();

        }
    }
}
