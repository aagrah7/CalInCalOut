package com.example.ankushkumar.healthy247;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

public class bodymassindex extends AppCompatActivity {

    private FrameLayout mBmiFrame;
    private BottomNavigationView mBmiNav;

    private EditText ht;
    private EditText wt;
    private Button calculate;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodymassindex);


        mBmiFrame = (FrameLayout) findViewById(R.id.bmi_frame);
        mBmiNav = (BottomNavigationView) findViewById(R.id.bmi_nav);

        mBmiNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1 = new Intent(bodymassindex.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.nav_exercise:
                        Intent intent2 = new Intent(bodymassindex.this, Exercise.class);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_bmi:
                        Intent intent3 = new Intent(bodymassindex.this, BMI.class);
                        startActivity(intent3);
                        return true;
                    case R.id.nav_profile:
                        Intent intent4 = new Intent(bodymassindex.this, Profile.class);
                        startActivity(intent4);
                        return true;


                    default:return false;

                }


            }
        });




        ht = (EditText) findViewById(R.id.height_input);
        wt = (EditText) findViewById(R.id.weight_input);
        calculate = (Button) findViewById(R.id.calculateBmi);
        ans = (TextView) findViewById(R.id.bmiAnswer);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if values in height and weight edittext is not integer or is in form "65 65", then there is error. the app stops working
                //otherwise the bmi is working absolutely fine

                float h = Float.parseFloat(ht.getText().toString());
                float w = Float.parseFloat(wt.getText().toString());


                if(h <= 272 && h >= 57 && w <= 635 && w >= 2.13){
                    float a = w*10000/(h*h);

                    if(a < 18.5) {
                        ans.setText("You are Underweight " + "BMI: " + String.valueOf(a));
                    } else if (a <= 24.9) {
                        ans.setText("You are Healthy " + "BMI: " + String.valueOf(a));
                    } else if (a <= 29.9) {
                        ans.setText("You are Overweight " + "BMI: " + String.valueOf(a));
                    } else if (a <= 34.9) {
                        ans.setText("You are Obese " + "BMI: " + String.valueOf(a));
                    } else {
                        ans.setText("You are Extremely Obese " + "BMI: " + String.valueOf(a));
                    }
                } else {
                    if(!(h <= 272 && h >= 57) && !(w <= 635 && w >= 2.13)) {
                        ans.setText("valid height and weight input not entered");
                    } else if (!(w <= 635 && w >= 2.13)){
                        ans.setText("valid weight input not entered");
                    } else {
                        ans.setText("valid height input not entered");
                    }

                }



            }
        });

    }
}
