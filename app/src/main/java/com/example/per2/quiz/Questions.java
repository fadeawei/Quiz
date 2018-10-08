package com.example.per2.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Questions extends AppCompatActivity {
    private String question;
    private boolean answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }
}
