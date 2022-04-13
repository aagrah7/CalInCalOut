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

public class MainActivity extends AppCompatActivity {

    private FrameLayout mNutritionFrame;
    private BottomNavigationView mNutritionNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNutritionFrame = (FrameLayout) findViewById(R.id.nutrition_frame);
        mNutritionNav = (BottomNavigationView) findViewById(R.id.nutrition_nav);

        mNutritionNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.nav_exercise:
                        Intent intent2 = new Intent(MainActivity.this, Exercise.class);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_bmi:
                        Intent intent3 = new Intent(MainActivity.this, BMI.class);
                        startActivity(intent3);
                        return true;
                    case R.id.nav_profile:
                        Intent intent4 = new Intent(MainActivity.this, Profile.class);
                        startActivity(intent4);
                        return true;


                        default:return false;

                }


            }
        });


        Button bbreakfast = (Button) findViewById(R.id.breakfast);
        Button blunch = (Button) findViewById(R.id.lunch);
        Button bdinner = (Button) findViewById(R.id.dinner);
        Button bmorning = (Button) findViewById(R.id.morning_snack);
        Button bafternoon = (Button) findViewById(R.id.afternoon_snack);
        Button bevening = (Button) findViewById(R.id.evening_snack);
        Button bmymeal = (Button) findViewById(R.id.my_meal_button);

        bbreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Breakfast.class);
                startActivity(intent);
            }
        });

        blunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lunch.class);
                startActivity(intent);
            }
        });
        bdinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dinner.class);
                startActivity(intent);
            }
        });
        bmorning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MorningSnack.class);
                startActivity(intent);
            }
        });
        bafternoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AfternoonSnack.class);
                startActivity(intent);
            }
        });
        bevening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EveningSnack.class);
                startActivity(intent);
            }
        });

        bmymeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyMeal.class);
                startActivity(intent);
            }
        });
    }
}
