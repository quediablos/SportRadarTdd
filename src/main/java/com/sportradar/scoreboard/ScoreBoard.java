package com.sportradar.scoreboard;

import java.util.LinkedList;
import java.util.List;

public class ScoreBoard {

    private List<Game> games = new LinkedList<>();

    public int startGame(String home, String away) {

        return 0;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
