package com.sportradar.scoreboard;

import org.junit.Assert;
import org.junit.Test;

public class ScoreBoardTest {

    private static final String TEAM_MEXICO = "Mexico";
    private static final String TEAM_CANADA = "Canada";
    private static final String TEAM_URUGUAY = "Uruguay";
    private static final String TEAM_GERMANY = "Germany";
    private static final String TEAM_ITALY = "Italy";
    private static final String TEAM_SPAIN = "Spain";
    private static final String TEAM_BRAZIL = "Brazil";
    private static final String TEAM_AUSTRALIA = "Australia";
    private static final String TEAM_ARGENTINA = "Argentina";
    private static final String TEAM_FRANCE = "France";

    private ScoreBoard initScoreBoardSingle() {

        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.startGame(TEAM_MEXICO,TEAM_CANADA);

        return scoreBoard;
    }

    @Test
    public void startGame_success() {

        ScoreBoard scoreBoard = initScoreBoardSingle();

        Assert.assertTrue(scoreBoard.getGames().get(0).getHome().getName().equals(TEAM_MEXICO));
    }

    @Test
    public void startGame_scoreIsZeroZero() {

        ScoreBoard scoreBoard = initScoreBoardSingle();

        Assert.assertTrue(scoreBoard.getGames().get(0).getHome().getScore() == 0);

    }

    @Test(expected = TeamAlreadyExistsException.class)
    public void startGame_errorWhenSameTeamAdded() {

        ScoreBoard scoreBoard = initScoreBoardSingle();
        scoreBoard.startGame(TEAM_MEXICO,TEAM_CANADA);
    }

    @Test
    public void finishGame_finishedGameDoesNotExistAnymore() {

        ScoreBoard scoreBoard = new ScoreBoard();

        int gameId = scoreBoard.startGame(TEAM_MEXICO,TEAM_CANADA);

        scoreBoard.finishGame(gameId);

        Assert.assertTrue(scoreBoard.getGames().isEmpty());
    }

    @Test(expected = GameDoesNotExistException.class)
    public void finishGame_errorWhenGameDoesNotExist() {

        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.finishGame(5);
    }
}
