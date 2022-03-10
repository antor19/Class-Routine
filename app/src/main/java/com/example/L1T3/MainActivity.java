package com.example.L1T3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button satbutton = findViewById(R.id.sat1);
        Button sunbutton = findViewById(R.id.sun2);
        Button monbutton = findViewById(R.id.Mon3);
        Button Tuebutton = findViewById(R.id.Tue4);
        Button wedbutton = findViewById(R.id.Wed5);
        Button Thubutton = findViewById(R.id.Thu6);
        Button Fributton = findViewById(R.id.Fri7);

        satbutton.setOnClickListener(this);
        sunbutton.setOnClickListener(this);
        monbutton.setOnClickListener(this);
        Tuebutton.setOnClickListener(this);
        wedbutton.setOnClickListener(this);
        Thubutton.setOnClickListener(this);
        Fributton.setOnClickListener(this);

    }

    @Override
    public void onClick(@NonNull View view) {
        Intent intent;
        if(view.getId()==R.id.sat1){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","sat11");
            startActivity(intent);
        }if(view.getId()==R.id.sun2){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","sun22");
            startActivity(intent);
        }if(view.getId()==R.id.Mon3){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","mon33");
            startActivity(intent);
        }if(view.getId()==R.id.Tue4){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","Tue44");
            startActivity(intent);
        }if(view.getId()==R.id.Wed5){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","wed55");
            startActivity(intent);
        }if(view.getId()==R.id.Thu6){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","Thu66");
            startActivity(intent);
        }if(view.getId()==R.id.Fri7){

            intent = new Intent(MainActivity.this,Saturday.class);
            intent.putExtra("name","fri77");
            startActivity(intent);
        }

    }

}