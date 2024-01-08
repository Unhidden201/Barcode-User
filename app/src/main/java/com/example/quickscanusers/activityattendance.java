package com.example.quickscanusers;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;



public class activityattendance extends AppCompatActivity {
    RecyclerView recyclerView;
    FloatingActionButton fab;


    Toolbar toolbar;

    EditText class_edt;
    EditText subject_edt;


    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityattendance);
        setToolbar();

           }

    private void setToolbar() {
        toolbar = findViewById(R.id.toolbar);
        TextView title = findViewById(R.id.title_toolbar);
        TextView subtitle = findViewById(R.id.subtitle_toolbar);
        ImageButton back = findViewById(R.id.back);

        title.setText("Attendance App");
        subtitle.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activityattendance.this,dashboardUser.class);
                startActivity(intent);
                finish();
            }
        });
    }






}