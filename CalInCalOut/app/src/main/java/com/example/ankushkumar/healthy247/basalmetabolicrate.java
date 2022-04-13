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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class basalmetabolicrate extends AppCompatActivity {

    private FrameLayout mBmiFrame;
    private BottomNavigationView mBmiNav;

    private EditText ht;
    private EditText wt;
    private EditText ag;
    private Button calculate;
    private TextView ans;
    private RadioGroup radiog;
    private RadioButton radiob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basalmetabolicrate);


        mBmiFrame = (FrameLayout) findViewById(R.id.bmi_frame);
        mBmiNav = (BottomNavigationView) findViewById(R.id.bmi_nav);

        mBmiNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1 = new Intent(basalmetabolicrate.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.nav_exercise:
                        Intent intent2 = new Intent(basalmetabolicrate.this, Exercise.class);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_bmi:
                        Intent intent3 = new Intent(basalmetabolicrate.this, BMI.class);
                        startActivity(intent3);
                        return true;
                    case R.id.nav_profile:
                        Intent intent4 = new Intent(basalmetabolicrate.this, Profile.class);
                        startActivity(intent4);
                        return true;


                    default:return false;

                }


            }
        });



        ht = (EditText) findViewById(R.id.height_input);
        wt = (EditText) findViewById(R.id.weight_input);
        ag = (EditText) findViewById(R.id.age_input);
        calculate = (Button) findViewById(R.id.calculateBmi);
        ans = (TextView) findViewById(R.id.bmiAnswer);
        radiog = (RadioGroup) findViewById(R.id.rgroup);




        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if values in height and weight edittext is not integer or is in form "65 65", then there is error. the app stops working
                //otherwise the bmi is working absolutely fine


                int radioid = radiog.getCheckedRadioButtonId();
                radiob = findViewById(radioid);

                float h = Float.parseFloat(ht.getText().toString());
                float w = Float.parseFloat(wt.getText().toString());
                float a = Float.parseFloat(ag.getText().toString());




                if(radiob.getText().equals("Male")) {

                    if(h <= 272 && h >= 57 && w <= 635 && w >= 2.13 && a >= 15 && a <= 80){
                        double ret = 88.362 + (13.397*w) + (4.799*h) - (5.677*a);
                        ans.setText("BMR is: " + ret + " calories/day");
                    } else {

                        //just need some work in this else case. age when input in not valid. that case also i need to consider
                        if(!(h <= 272 && h >= 57) && !(w <= 635 && w >= 2.13) && !(a >= 15 && a <= 80)) {
                            ans.setText("valid height, weight and age input not entered");
                        } else if (!(w <= 635 && w >= 2.13) ){
                            ans.setText("valid weight input not entered");
                        } else {
                            ans.setText("valid height input not entered");
                        }
                    }






                } else {
                    if(h <= 272 && h >= 57 && w <= 635 && w >= 2.13 && a >= 15 && a <= 80){
                        double ret = 447.593 + (9.247*w) + (3.098*h) - (4.330*a);
                        ans.setText("BMR is: " + ret + " calories/day");
                    } else {
                        //just need some work in this else case. age when input in not valid. that case also i need to consider
                        if(!(h <= 272 && h >= 57) && !(w <= 635 && w >= 2.13)) {
                            ans.setText("valid height and weight input not entered");
                        } else if (!(w <= 635 && w >= 2.13)){
                            ans.setText("valid weight input not entered");
                        } else {
                            ans.setText("valid height input not entered");
                        }
                    }


                }



            }
        });

    }
}
