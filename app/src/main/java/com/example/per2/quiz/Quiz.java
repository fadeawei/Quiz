package com.example.per2.quiz;

import java.util.List;

public class Quiz {
    private int count = 0;
    private List<Question> question;
    private int score;

    @Override
    public String toString() {
        return "Quiz{" +
                "count=" + count +
                ", question=" + question +
                ", score=" + score +
                '}';
    }

    public Quiz(List<Question> question) {
        this.question = question;
        this.score = 0;
    }

    public List<Question> getQuestions() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public int getScore() {
        return score;
    }

    public void setScore() {
        score++;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static final int TOTALCOUNT = 10;




}
