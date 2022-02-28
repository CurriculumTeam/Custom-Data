package com.example.m4l3a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customdatatype d[] = new customdatatype[6];
        d[0] = new customdatatype("Ankit","Male","ankitjadli26@gmail.com","Delhi","9857423658");
        d[1] = new customdatatype("Aashna","Female","aashnasharma22@gmail.com","Delhi","8956147552");
        d[2] = new customdatatype("Shubhangi","Female","shubhangi11@gmail.com","Delhi","9856324785");
        d[3] = new customdatatype("Atul","Male","atulsingh666@gmail.com","Delhi","9257415836");
        d[4] = new customdatatype("Utkarsh","Male","utkarshanand123@gmail.com","Delhi","8423365521");
        d[5] = new customdatatype("Vernit","Male","vernit.garg@gmail.com","Delhi","9999865742");



        submit = (Button) findViewById(R.id.button);
        Random randomNumber = new Random();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberGenerated = randomNumber.nextInt(6 - 0) + 0;
                Log.i("Person we got : ", " Name : "+d[numberGenerated].username+
                        " Gender : "+d[numberGenerated].usergender+" State : "+d[numberGenerated].userstate+
                        " Phone : "+d[numberGenerated].userphone);
            }
        });

    }
}