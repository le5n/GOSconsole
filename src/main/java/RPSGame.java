import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    private static final int AMOUNT = 3;

    int playRSP() {
        Scanner in = new Scanner(System.in);
        int result;
        do {
            System.out.print("Enter the element: ");
            String element = in.nextLine();
            result = getResult(element);
            System.out.println(writeResult(result));
        }
        while (result == 0);

        return result;
    }


    private int getResult(String userElement) {
        RPSElements inputElement = convertInputElement(userElement);
        RPSElements generatedElement = getElement();
        System.out.println("Computer played: " + generatedElement);

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

    String writeResult(int result) {
        switch (result) {
            case 1:
                return "you play first";
            case 0:
                return "no one wins, go on with RPS";
            case -1:
                return "you play second";
        }
        return "smt is wrong";
    }
}
