public class MethodChallenge {
    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScore("Tim", playerPosition);

        playerPosition = calculateHighScorePosition(1000);
        displayHighScore("Bob", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScore("Percy", playerPosition);

        playerPosition = calculateHighScorePosition(100);
        displayHighScore("Gilbert", playerPosition);

        playerPosition = calculateHighScorePosition(25);
        displayHighScore("James", playerPosition);
    }

    public static void displayHighScore(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) return 1;
        else if (playerScore >= 500) return 2;
        else if (playerScore >= 100) return 3;
        else return 4;
    }
}
