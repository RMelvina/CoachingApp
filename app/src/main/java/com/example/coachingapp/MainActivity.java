package com.example.coachingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button splashScreenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();
    }

    public void button_start(View view) {
        Intent intent = new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }

    public void start() {
        splashScreenButton = (Button) findViewById(R.id.btn_start);
        Animation button_fade_in_ani = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in);
        splashScreenButton.startAnimation(button_fade_in_ani);
    }
}