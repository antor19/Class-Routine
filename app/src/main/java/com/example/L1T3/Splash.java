package com.example.L1T3;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar();

        setContentView(R.layout.activity_splash);

       Objects.requireNonNull(getSupportActionBar()).hide();


       Thread thread=new Thread(() -> {

           try {
               sleep(3000);

               Intent i=new Intent(Splash.this,MainActivity.class);
               startActivity(i);
               finish();

           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       });
       thread.start();



    }
}