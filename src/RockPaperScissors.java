
import java.sql.SQLOutput;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playerA, playerB;
        char playAgain = 'Y';

        do {
            do {
                System.out.println("Please enter your choice: R, P, or S");
                playerA = input.next().charAt(0);

                if (playerA != 'R' && playerA != 'P' && playerA != 'S') {
                    System.out.println("Invalid choice.");
                }
            } while (playerA != 'R' && playerA != 'P' && playerA != 'S');

            do {
                System.out.println("Please enter your choice: R, P, or S");
                playerB = input.next().charAt(0);

                if (playerB != 'R' && playerB != 'P' && playerB != 'S') {
                    System.out.println("Invalid choice.");
                }
            } while (playerB != 'R' && playerB != 'P' && playerB != 'S');

            String moveA = getMove(playerA);
            String moveB = getMove(playerB);

            System.out.println("\n" + moveA + " VS " + moveB);

            if (playerA == playerB) {
                System.out.println(getMove(playerA) + " VS " + getMove(playerB) + "TIE");
            } else if (
                    (playerA == 'R' && playerB == 'S') ||
                            (playerA == 'P' && playerB == 'R') ||
                            (playerA == 'S' && playerB == 'P')
            ) {
                if (playerA == 'R') {
                    System.out.println("Rock breaks Scissors");
                } else if (playerA == 'P') {
                    System.out.println("Paper covers Rock");
                } else {
                    System.out.println("Scissors cuts Paper");
                }
                System.out.println("player A wins!!!");

            } else {
                if (playerB == 'R') {
                    System.out.println("Rock breaks Scissors");
                } else if (playerB == 'P') {
                    System.out.println("Paper covers Rock");
                } else {
                    System.out.println("Scissors cuts Paper");
                }
                System.out.println("player B wins!!!");
            }

            System.out.println("\nPlay Again?  (Y/N):");
            playAgain = input.next().charAt(0);

        }while (playAgain == 'Y');

        System.out.println("Thanks for playing!");
        input.close();
    }

    public static String getMove(char player) {
        switch (player) {
            case 'R':
                return "Rock";
            case 'P':
                return "Paper";
            case 'S':
                return "Scissors";
            default:
                return "unknown";

        }
    }
}

