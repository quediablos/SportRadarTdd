package com.sportradar.scoreboard;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

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

    private ScoreBoard initScoreBoardBig() {

        ScoreBoard scoreBoard = new ScoreBoard();
        int game0 = scoreBoard.startGame(TEAM_MEXICO,TEAM_CANADA);
        int game1 = scoreBoard.startGame(TEAM_SPAIN, TEAM_BRAZIL);
        int game2 = scoreBoard.startGame(TEAM_GERMANY, TEAM_FRANCE);
        int game3 = scoreBoard.startGame(TEAM_URUGUAY,TEAM_ITALY);
        int game4 = scoreBoard.startGame(TEAM_ARGENTINA,TEAM_AUSTRALIA);

        scoreBoard.updateScore(game0,0,5);
        scoreBoard.updateScore(game1,10,2);
        scoreBoard.updateScore(game2,2,2);
        scoreBoard.updateScore(game3,6,6);
        scoreBoard.updateScore(game4,3,1);

        return scoreBoard;
    }

    @Test
    public void startGame_addedTeamExists() {

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

    @Test
    public void updateScore_newScoreIsStored() {

        ScoreBoard scoreBoard = new ScoreBoard();

        int gameId = scoreBoard.startGame(TEAM_MEXICO,TEAM_CANADA);

        scoreBoard.updateScore(gameId,2,1);

        Assert.assertTrue(scoreBoard.getGames().get(0).getHome().getScore() == 2);

    }

    @Test(expected = GameDoesNotExistException.class)
    public void updateScore_errorWhenGameDoesNotExist() {

        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.updateScore(5,2,1);

    }

    @Test
    public void getSummary_orderedByTotalScoreAndGameId() {

        ScoreBoard scoreBoard = initScoreBoardBig();

        List<Game> games = scoreBoard.getSummary();

        Assert.assertTrue(games.get(0).getHome().getName().equals(TEAM_URUGUAY));
        Assert.assertTrue(games.get(4).getHome().getName().equals(TEAM_GERMANY));
    }
}
