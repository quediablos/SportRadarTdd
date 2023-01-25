package com.sportradar.scoreboard;

import org.junit.Assert;
import org.junit.Test;

public class ScoreBoardTest {

    @Test
    public void startGame_success() {

        ScoreBoard scoreBoard = initScoreBoardSingle();

        Assert.assertTrue(scoreBoard.getGames().get(0).getHome().getName().equals(TEAM_MEXICO));

    }
}
