package com.example.coachingapp.Models;

import java.util.List;

public class User_Goal_3 {

    public String Goal_3;
    public String Goal_4;
    public List<String> answers;

    public User_Goal_3(){

    }

    public User_Goal_3(String goal_3, String goal_4, List<String> answers) {
        Goal_3 = goal_3;
        Goal_4 = goal_4;
        this.answers = answers;
    }

    public String getGoal_3() {
        return Goal_3;
    }

    public void setGoal_3(String goal_3) {
        Goal_3 = goal_3;
    }

    public String getGoal_4() {
        return Goal_4;
    }

    public void setGoal_4(String goal_4) {
        Goal_4 = goal_4;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
