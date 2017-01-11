package skate;

import RPS.RPSGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SkateGame {
    Tricks[] allTricks = Tricks.values();
    List<Tricks> filteredTricks = new ArrayList<>();

    public void setDifficulty() {
        Scanner in = new Scanner(System.in);
        System.out.print("choose difficulty (1-10): ");
        int difficulty = in.nextInt();

        chooseTricks(difficulty);
    }

    private List<Tricks> chooseTricks(int difficulty) {
        for (Tricks trick : allTricks) {
            if (trick.getDifficulty() <= difficulty) {
                filteredTricks.add(trick);
            }
        }
        System.out.println(filteredTricks);
        return filteredTricks;
    }

    public void playSkate() {
        int userLetters = 0;
        int computerLetters = 0;
        Random random = new Random();

        if (RPSGame.isComputerFirst()) {
            System.out.println(filteredTricks.get(random.nextInt(filteredTricks.size())));
            System.out.println("enter 'try' to try this one");
        } else {
            System.out.println("computer is not first, enter the trick");
        }

        while (userLetters < 5 || computerLetters < 5) {

        }
    }
}
