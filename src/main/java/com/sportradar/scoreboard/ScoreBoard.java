package com.sportradar.scoreboard;

import java.util.LinkedList;
import java.util.List;

public class ScoreBoard {

    private List<Game> games = new LinkedList<>();

    private int nextGameId = 0;

    public int startGame(String home, String away) {

        //Check if either of the teams already have a match on the scoreboard.
        games.stream().filter(game -> game.getHome().getName().equals(home) ||
                        game.getHome().getName().equals(away) ||
                        game.getAway().getName().equals(home) ||
                        game.getAway().getName().equals(away))
                .findFirst()
                .ifPresent(game -> { throw new TeamAlreadyExistsException(); });

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
