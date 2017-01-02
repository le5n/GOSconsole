import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkateGame {
    void setDifficulty() {
        Scanner in = new Scanner(System.in);
        System.out.print("choose difficulty (1-10): ");
        int difficulty = in.nextInt();

        chooseTricks(difficulty);
    }

    private List<Tricks> chooseTricks(int difficulty) {
        Tricks[] allTricks = Tricks.values();
        List<Tricks> filteredTricks = new ArrayList<>();
        for (Tricks trick : allTricks) {
            if (trick.getDifficulty() <= difficulty) {
                filteredTricks.add(trick);
            }
        }
        System.out.println(filteredTricks);
        return filteredTricks;
    }
}
