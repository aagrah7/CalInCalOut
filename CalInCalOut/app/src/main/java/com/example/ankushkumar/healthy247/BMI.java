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

public class BMI extends AppCompatActivity {

    private FrameLayout mBmiFrame;
    private BottomNavigationView mBmiNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        mBmiFrame = (FrameLayout) findViewById(R.id.bmi_frame);
        mBmiNav = (BottomNavigationView) findViewById(R.id.bmi_nav);

        mBmiNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1 = new Intent(BMI.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.nav_exercise:
                        Intent intent2 = new Intent(BMI.this, Exercise.class);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_bmi:

                        return true;
                    case R.id.nav_profile:
                        Intent intent4 = new Intent(BMI.this, Profile.class);
                        startActivity(intent4);
                        return true;


                    default:return false;

                }


            }
        });


        Button bbmi = (Button) findViewById(R.id.bmi);
        Button bbmr = (Button) findViewById(R.id.bmr);

        bbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI.this, bodymassindex.class);
                startActivity(intent);
            }
        });

        bbmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BMI.this, basalmetabolicrate.class);
                startActivity(intent);
            }
        });


    }
}
