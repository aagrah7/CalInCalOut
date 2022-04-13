package com.example.ankushkumar.healthy247;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class Profile extends AppCompatActivity {

    private FrameLayout mProfileFrame;
    private BottomNavigationView mProfileNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProfileFrame = (FrameLayout) findViewById(R.id.profile_frame);
        mProfileNav = (BottomNavigationView) findViewById(R.id.profile_nav);

        mProfileNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1 = new Intent(Profile.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.nav_exercise:
                        Intent intent2 = new Intent(Profile.this, Exercise.class);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_bmi:
                        Intent intent3 = new Intent(Profile.this, BMI.class);
                        startActivity(intent3);
                        return true;
                    case R.id.nav_profile:
                        return true;


                    default:return false;

                }


            }
        });

    }
}
