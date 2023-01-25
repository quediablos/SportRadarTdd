
<h1>Development Chronology</h1>



<table>
  <tr>
    <th>Test Case</th>
    <th>Test Result</th>
    <th>Next Action</th>
  </tr>
  <tr>
    <td>startGame_addedTeamExists()</td>
    <td>Fails with compilation error.</td>
    <td>ScoreBoard.startGame() is implemented empty.</td>
  </tr>
  <tr>
    <td>startGame_addedTeamExists()</td>
    <td>Fails with runtime error. Scoreboard does not store the game at all.</td>
    <td>Adding game with 0-0 score feature is added.</td>
  </tr>
  <tr>
    <td>startGame_addedTeamExists()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>

  <tr>
    <td>startGame_scoreIsZeroZero()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>
  <tr>
    <td>startGame_errorWhenSameTeamAdded()</td>
    <td>Fails, not raising any errors</td>
    <td>Duplicate team check logic is added.</td>
  </tr>
<tr>
    <td>startGame_errorWhenSameTeamAdded()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>
<tr>
    <td>finishGame_finishedGameDoesNotExistAnymore()</td>
    <td>Fails with compilation error.</td>
    <td>ScoreBoard.finishGame() is implemented empty.</td>
  </tr>
<tr>
    <td>finishGame_finishedGameDoesNotExistAnymore()</td>
    <td>Fails because the game still exists on the scoreboard.</td>
    <td>Removing the game feature is implemented.</td>
  </tr>
<tr>
    <td>finishGame_finishedGameDoesNotExistAnymore()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>
<tr>
    <td>finishGame_errorWhenGameDoesNotExist()</td>
    <td>Fails, no exception is raised.</td>
    <td>Raising exception when the game is not found is implemented.</td>
  </tr>
<tr>
    <td>finishGame_errorWhenGameDoesNotExist()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>
<tr>
    <td>updateScore_newScoreIsStored()</td>
    <td>Fails with compilation error.</td>
    <td>Empty method is implemented.</td>
  </tr>
<tr>
    <td>updateScore_newScoreIsStored()</td>
    <td>Fails, the score is not changed.</td>
    <td>Score update feature is added. </td>
  </tr>
<tr>
    <td>updateScore_snewScoreIsStored()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>
<tr>
    <td>updateScore_errorWhenGameDoesNotExist()</td>
    <td>Fails, no exception is raised although the game does not exist.</td>
    <td>Raising error when the game is not found feature is implemented.</td>
  </tr>
<tr>
    <td>updateScore_errorWhenGameDoesNotExist()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>
<tr>
    <td>getSummary_orderedByTotalScoreAndGameId()</td>
    <td>Fails with compilation error.</td>
    <td>Empty method is implemented. </td>
  </tr>
<tr>
    <td>getSummary_orderedByTotalScoreAndGameId()</td>
    <td>Fails with empty list.</td>
    <td>Returning all the games non-ordered implemented.</td>
  </tr>
<tr>
    <td>getSummary_orderedByTotalScoreAndGameId()</td>
    <td>Fails with wrong order. </td>
    <td>Ordering games by total score and adding order is implemented.</td>
  </tr>
<tr>
    <td>getSummary_orderedByTotalScoreAndGameId()</td>
    <td>Succeeds.</td>
    <td>N/A</td>
  </tr>

</table>
