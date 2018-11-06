package com.example.per2.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayScoreActivity extends AppCompatActivity {
    private TextView score;
    private Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_score);
        wirewidgets();
        Toast.makeText(DisplayScoreActivity.this, "GOOD JOB?", Toast.LENGTH_LONG).show();
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restart = new Intent(DisplayScoreActivity.this , QuizActvity.class );
                startActivity(restart);
            }
        });



    }

    private void wirewidgets() {
        score = findViewById(R.id.textview_displayscoreactivity_score);
        score.setText(getIntent().getStringExtra(QuizActvity.YEET));
        restart = findViewById(R.id.button_displayscore_restart);
    }
}
