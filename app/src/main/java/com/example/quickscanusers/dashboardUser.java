package com.example.quickscanusers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class dashboardUser extends AppCompatActivity {

    private Button attendance,logout,scanner,record;
    FirebaseAuth auth;
    FirebaseUser user;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_user);

        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        attendance = findViewById(R.id.attendance);
        scanner = findViewById(R.id.scan);
        record = findViewById(R.id.record);
        logout = findViewById(R.id.logout);

        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboardUser.this,scan.class);
                startActivity(intent);
                finish();
            }
        });
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboardUser.this,recordAttendance.class);
                startActivity(intent);
                finish();
            }
        });
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboardUser.this,activityattendance.class);
                startActivity(intent);
                finish();
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(getApplicationContext(),"Account Logout",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}