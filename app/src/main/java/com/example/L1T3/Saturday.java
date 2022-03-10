package com.example.L1T3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Objects;

public class Saturday extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setLogo(R.drawable.classs);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        textView = findViewById(R.id.textid);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){

            String DayName = bundle.getString("name");
            showDetails(DayName);

        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    void showDetails(String DayName){

        if (DayName.equals("sat11")){

            textView.setText(R.string.sat11);
        }if (DayName.equals("sun22")){

            textView.setText(R.string.sun22);
        }if (DayName.equals("mon33")){

            textView.setText(R.string.mon33);
        }if (DayName.equals("Tue44")){

            textView.setText(R.string.tue44);
        }if (DayName.equals("wed55")){

            textView.setText(R.string.wed55);
        }if (DayName.equals("Thu66")){

            textView.setText(R.string.thu66);
        }if (DayName.equals("fri77")){

            textView.setText(R.string.fri77);
        }

    }
}