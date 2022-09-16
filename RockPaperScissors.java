import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose: [r]ock, [p]aper, [s]cissors: ");
        String playerMove = scanner.nextLine();

        if (playerMove.equals("r") || playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        }  else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        Random rdm = new Random();

        int computerRandomNumber = rdm.nextInt(4);

        String computerMove = "";

        switch (computerRandomNumber) {
            case 1: computerMove = "rock";
                break;
            case 2: computerMove = "paper";
                break;
            case 3: computerMove = "scissors";
                break;
            default:
                System.out.printf("Invalid Input. Try Again...");
                break;
        }
        System.out.printf("The computer chose: %s\n", computerMove);

        if (playerMove.equals(ROCK) && computerMove.equals("scissors")
                || playerMove.equals(PAPER) && computerMove.equals("rock")
                || playerMove.equals(SCISSORS) && computerMove.equals("paper")) {
            System.out.println("You win.");
        } else if (playerMove.equals(SCISSORS) && computerMove.equals("rock")
                || playerMove.equals(ROCK) && computerMove.equals("paper")
                || playerMove.equals(PAPER) && computerMove.equals("scissors")) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }
    }
}