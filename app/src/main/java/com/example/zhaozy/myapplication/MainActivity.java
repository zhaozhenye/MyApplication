package com.example.zhaozy.myapplication;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View textview = findViewById(R.id.textview);
        findViewById(R.id.btn_t).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewCompat.setTranslationY(textview, -200);
                ViewCompat.setTranslationX(textview, -200);
            }
        });
    }
}
