package com.example.todoapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        //creating the object for the thread
        Thread thread =new Thread(){

            public void run(){
                try {
                    sleep(3000);

                }catch (Exception e){
                    e.printStackTrace();
                }finally {

                    Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();

    }
}