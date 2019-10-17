package com.example.coachingapp.Models;

import java.util.List;

public class Issues_13 {
    public String question_13;
    public String question_14;

    public List<String> answers;

    public Issues_13(){

    }

    public Issues_13(String question_13, String question_14, List<String> answers) {
        this.question_13 = question_13;
        this.question_14 = question_14;
        this.answers = answers;
    }

    public String getQuestion_13() {
        return question_13;
    }

    public void setQuestion_13(String question_13) {
        this.question_13 = question_13;
    }

    public String getQuestion_14() {
        return question_14;
    }

    public void setQuestion_14(String question_14) {
        this.question_14 = question_14;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
