package com.example.ankushkumar.healthy247;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class Exercise extends AppCompatActivity {


    private FrameLayout mExerciseFrame;
    private BottomNavigationView mExerciseNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        mExerciseFrame = (FrameLayout) findViewById(R.id.exercise_frame);
        mExerciseNav = (BottomNavigationView) findViewById(R.id.exercise_nav);

        mExerciseNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1;
                        intent1 = new Intent(Exercise.this, MainActivity.class);
                        startActivity(intent1);
                        return  true;

                    case R.id.nav_exercise:

                        return  true;

                    case R.id.nav_bmi:
                        Intent intent3;
                        intent3 = new Intent(Exercise.this, BMI.class);
                        startActivity(intent3);
                        return  true;

                    case R.id.nav_profile:
                        Intent intent4;
                        intent4 = new Intent(Exercise.this, Profile.class);
                        startActivity(intent4);
                        return  true;

                        default: return false;
                }
            }
        });


        Button bpushup = (Button) findViewById(R.id.pushup);
        Button bpedometer = (Button) findViewById(R.id.stepswalked);
        Button bmeditation = (Button) findViewById(R.id.meditation);
        Button bplank = (Button) findViewById(R.id.plank);


/*
        bpushup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise.this, Pushup.class);
                startActivity(intent);
            }
        });

        bpedometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise.this, Pedometer.class);
                startActivity(intent);
            }
        });
*/

        bmeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise.this, Meditation.class);
                startActivity(intent);
            }
        });

        bplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise.this, plank.class);
                startActivity(intent);
            }
        });



    }
}
