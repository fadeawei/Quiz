package com.example.per2.quiz;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.Properties;

public class Quiz extends AppCompatActivity {
    String jsonString;
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        InputStream JsonFileInputStream = getResources().openRawResource(R.raw.questions);
        jsonString = readJsoninString(JsonFileInputStream, this);
        Log.d(TAG, "onCreate: " + jsonString);

        Gson gson = new Gson();


    }

    public static String readJsoninString(InputStream JsonFile, Context c) {
        try {
                int size = JsonFile.available();
                byte[] buffer = new byte[size];
                JsonFile.read(buffer);
                JsonFile.close();
                String text = new String(buffer);

                return text;

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


}
