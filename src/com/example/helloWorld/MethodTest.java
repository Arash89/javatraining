package com.example.helloWorld;

public class MethodTest {
    public String displayHighScorePosition(String playerName, int positionInTable) {
        return playerName + " manage to get into position " + positionInTable + " on the high score table.";
    }

    public int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore <= 1000) {
            return 2;
        } else if (playerScore <= 500 && playerScore > 100) {
            return 3;
        }
        return 4;
    }

    public void printResult(String playerName, int playerScore) {
        System.out.println(displayHighScorePosition(playerName, calculateHighScorePosition(playerScore)));
    }

    public void run() {
        printResult("Nelin", 1500);
        printResult("Amiroo", 1000);
        printResult("Arash", 500);
    }
}
