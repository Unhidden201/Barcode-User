package com.example.quickscanusers;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.quickscanusers.Login;
import com.example.quickscanusers.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {  //having a SplashScreen
            @Override
            public void run(){
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();

            }
        },3000);
    }
}
