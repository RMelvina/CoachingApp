package com.example.coachingapp.Models;


import java.util.List;

public class Goals_Road_Map {

    public String rd_map_one;
    public String rd_map_two;
    public String rd_map_three;
    public String rd_map_four;
    public String re_map_five;


   public List<String> answers;

    public Goals_Road_Map() {
    }

    public String getRd_map_one() {
        return rd_map_one;
    }

    public void setRd_map_one(String rd_map_one) {
        this.rd_map_one = rd_map_one;
    }

    public String getRd_map_two() {
        return rd_map_two;
    }

    public void setRd_map_two(String rd_map_two) {
        this.rd_map_two = rd_map_two;
    }

    public String getRd_map_three() {
        return rd_map_three;
    }

    public void setRd_map_three(String rd_map_three) {
        this.rd_map_three = rd_map_three;
    }

    public String getRd_map_four() {
        return rd_map_four;
    }

    public void setRd_map_four(String rd_map_four) {
        this.rd_map_four = rd_map_four;
    }

    public String getRe_map_five() {
        return re_map_five;
    }

    public void setRe_map_five(String re_map_five) {
        this.re_map_five = re_map_five;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public Goals_Road_Map(String rd_map_one, String rd_map_two, String rd_map_three, String rd_map_four, String re_map_five, List<String> answers) {
        this.rd_map_one = rd_map_one;
        this.rd_map_two = rd_map_two;
        this.rd_map_three = rd_map_three;
        this.rd_map_four = rd_map_four;
        this.re_map_five = re_map_five;
        this.answers = answers;




    }
}


