public class Main {
    public static void main(String[] args) {
        RPSGame rpsGame = new RPSGame();
        SkateGame skateGame = new SkateGame();

       int RPSResult = rpsGame.playRSP();
        skateGame.setDifficulty();
    }
}
