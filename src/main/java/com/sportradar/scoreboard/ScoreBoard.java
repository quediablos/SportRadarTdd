package com.sportradar.scoreboard;

import java.util.LinkedList;
import java.util.List;

public class ScoreBoard {

    private List<Game> games = new LinkedList<>();

    private int nextGameId = 0;

    public int startGame(String home, String away) {

        Team homeTeam = new Team(home, 0);
        Team awayTeam = new Team(away, 0);

        Game game = new Game(homeTeam, awayTeam);
        game.setId(nextGameId++);

        games.add(game);

        return game.getId();
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
