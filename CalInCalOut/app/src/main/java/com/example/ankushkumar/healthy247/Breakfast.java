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


import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static android.R.attr.fragment;








public class
Breakfast extends AppCompatActivity {
    public static String food_in = "";


    private FrameLayout mBreakfastFrame;
    private BottomNavigationView mBreakfastNav;


    public static String input;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);




        mBreakfastFrame = (FrameLayout) findViewById(R.id.breakfast_frame);
        mBreakfastNav = (BottomNavigationView) findViewById(R.id.breakfast_nav);

        mBreakfastNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_nutrition:
                        Intent intent1 = new Intent(Breakfast.this, MainActivity.class);
                        startActivity(intent1);
                        return true;
                    case R.id.nav_exercise:
                        Intent intent2 = new Intent(Breakfast.this, Exercise.class);
                        startActivity(intent2);
                        return true;
                    case R.id.nav_bmi:
                        Intent intent3 = new Intent(Breakfast.this, BMI.class);
                        startActivity(intent3);
                        return true;
                    case R.id.nav_profile:
                        Intent intent4 = new Intent(Breakfast.this, Profile.class);
                        startActivity(intent4);
                        return true;


                    default:return false;

                }


            }
        });
























        /*
        private String makeHttpRequest(URL ur l) throw IOException {
             String jsonResponse = "";
             if(url == null) {
                 return jsonResponse;
             }

             HttpURLConnection urlConnection = null;
             InputStream inputStream = null;

             try{
                 urlConnection = (HttpURLConnection) url.openConnection();
                 urlConnection.setRequestMethod("GET");
                 urlConnection.setReadTimeout(10000);
                 urlConnection.setConnectTimeout(15000);
                 urlConnection.connect();
             }
             return jsonResponse;
        }


        /*
        URL url;
        HttpURLConnection urlConnection = null;
        try {
            url = new URL("http://www.mysite.se/index.asp?data=99");

            urlConnection = (HttpURLConnection) url
                    .openConnection();

            InputStream in = urlConnection.getInputStream();

            InputStreamReader isw = new InputStreamReader(in);

            int data = isw.read();
            while (data != -1) {
                char current = (char) data;
                data = isw.read();
                //System.out.println("ure aage re");
                System.out.print(current);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

        */
















        /*
        public void open_b_searched_value(View v) {
            EditText searched = (EditText) findViewById(R.id.breakfast_search_space);
            food_in = searched.getText().toString().trim();
            ConnectivityManager connMgr = (ConnectivityManager)
                    getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                Toast.makeText(this, "No Internet",
                        Toast.LENGTH_SHORT).show();
            }

            else if(Breakfast.food_in.equals("")){
                Toast.makeText(this, "No Input",
                        Toast.LENGTH_SHORT).show();
            }
            else{
                input = Breakfast.food_in;

            /*
            Intent intent = new Intent(this, BreakfastSearch.class);
            startActivity(intent);


            }}
            */






    }

}
