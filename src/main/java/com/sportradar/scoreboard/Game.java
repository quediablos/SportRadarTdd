package com.sportradar.scoreboard;

public class Game {

    private Team home;
    private Team away;

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }


    public void incrementScore(String teamName){
        Team team = home.getName().equals(teamName) ? getHome() : getAway();
        team.incrementScore();
    }

    public void setScore(String teamName, int score){
        Team team = home.getName().equals(teamName) ? getHome() : getAway();
        team.setScore(score);
    }

    public int getTotalScore() {
        return home.getScore() + away.getScore();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;
        return home.getName().equals(game.home.getName()) && away.getName().equals(game.away.getName());
    }
}


