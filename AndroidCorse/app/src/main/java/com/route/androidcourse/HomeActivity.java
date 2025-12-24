package com.route.androidcourse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {
    private MaterialButton buttonCourse1, buttonCourse2, buttonCourse3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_home);
        buttonCourse1 = findViewById(R.id.buttonCourse1);
        buttonCourse2 = findViewById(R.id.buttonCourse2);
        buttonCourse3 = findViewById(R.id.buttonCourse3);
        buttonCourse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AndroidActivity.class);
                startActivity(intent);
            }
        });

        buttonCourse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, IosActivity.class);
                startActivity(intent);
            }
        });

        buttonCourse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FullStackActivity.class);
                startActivity(intent);
            }
        });
    }
}
