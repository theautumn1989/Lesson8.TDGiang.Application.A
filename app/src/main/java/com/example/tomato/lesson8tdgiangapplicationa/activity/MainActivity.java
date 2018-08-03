package com.example.tomato.lesson8tdgiangapplicationa.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tomato.lesson8tdgiangapplicationa.R;

public class MainActivity extends AppCompatActivity {

    public static TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        tvResult = findViewById(R.id.tv_result);
    }
}
