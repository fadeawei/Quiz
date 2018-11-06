package com.example.per2.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Question {
    private String question;
    private boolean answer;

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }

    public Question(String q, Boolean a){
        question = q;
        answer = a;
    }

    public Question() {
    }

    public String getQuestion(){
        return question;
    }

    public boolean getAnswer(){
        return answer;
    }

}