import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    private static final int AMOUNT = 3;

    void play() {
        Scanner in = new Scanner(System.in);
        int i;
        do {
            System.out.print("Enter the element: ");
            String element = in.nextLine();
            i = getResult(element);
        }
        while (i == 0);
        System.out.println(i);
    }

  private int getResult(String userElement) {
        RPSElements inputElement = convertInputElement(userElement);
        RPSElements generatedElement = getElement();
        System.out.println(generatedElement);
        if (inputElement == generatedElement) {
            return 0;
        }

        switch (inputElement) {
            case ROCK:
                return (generatedElement == RPSElements.SCISSORS ? 1 : -1);
            case PAPER:
                return (generatedElement == RPSElements.ROCK ? 1 : -1);
            case SCISSORS:
                return (generatedElement == RPSElements.PAPER ? 1 : -1);
        }
        return 0;
    }

    private RPSElements convertInputElement(String element) {
        RPSElements converted = null;
        char firstLetter = element.toLowerCase().charAt(0);
        switch (firstLetter) {
            case 'r':
                converted = RPSElements.ROCK;
                break;
            case 'p':
                converted = RPSElements.PAPER;
                break;
            case 's':
                converted = RPSElements.SCISSORS;
                break;
        }
        return converted;
    }

    private RPSElements getElement() {
        Random random = new Random();
        RPSElements[] elements = new RPSElements[]{RPSElements.PAPER, RPSElements.ROCK, RPSElements.SCISSORS};
        return elements[random.nextInt(AMOUNT)];
    }
}
