public class App {
    public static void main(String[] args) throws Exception {
        int newScore = calculateScore("Narayan", 500);
        System.out.println("new score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore(int score) { // Method Overloading
        System.out.println("Unnamed Player Scored " + score + " Points");
        return score * 1000;
    }

    public static int calculateScore() { // Method Overloading
        System.out.println("No player name , no player score.");
        return 0;
    }
}
