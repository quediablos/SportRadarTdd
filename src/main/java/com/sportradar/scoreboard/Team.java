package com.sportradar.scoreboard;

public class Team {

    private String name;
    private int score;

    public Team(String teamName, int score){
        this.name = teamName;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int incrementScore() {
        return ++score;
    }


}
