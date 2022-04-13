package com.example.ankushkumar.healthy247;

import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.FrameLayout;

public class plank extends AppCompatActivity {


    private FrameLayout mExerciseFrame;
    private BottomNavigationView mExerciseNav;

    private Chronometer chronometer;
    private boolean running;
    private long pauseOffset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plank);
        mExerciseFrame = (FrameLayout) findViewById(R.id.exercise_frame);
        mExerciseNav = (BottomNavigationView) findViewById(R.id.exercise_nav);

        mExerciseNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1;
                        intent1 = new Intent(plank.this, MainActivity.class);
                        startActivity(intent1);
                        return  true;

                    case R.id.nav_exercise:
                        Intent intent2;
                        intent2 = new Intent(plank.this, Exercise.class);
                        startActivity(intent2);
                        return  true;

                    case R.id.nav_bmi:
                        Intent intent3;
                        intent3 = new Intent(plank.this, BMI.class);
                        startActivity(intent3);
                        return  true;

                    case R.id.nav_profile:
                        Intent intent4;
                        intent4 = new Intent(plank.this, Profile.class);
                        startActivity(intent4);
                        return  true;

                    default: return false;
                }
            }
        });

        chronometer = findViewById(R.id.chronometer);


    }


    public void startChronometer(View v) {
        if(!running) {
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            chronometer.start();
            running = true;
        }

    }


    public void stopChronometer(View v) {
        if(running) {
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }


    }


    public void resetChronometer(View v) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
        running = false;
        chronometer.stop();
    }
}
