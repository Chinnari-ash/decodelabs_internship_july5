import java.util.Random;
import java.util.Scanner;

public class Number_guessesing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;

            System.out.println("\nGuess the number (1-100)");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("?? Correct! You guessed in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessed) {
                System.out.println("? Out of attempts! The number was: " + targetNumber);
            }

            System.out.println("Current Score: " + score);
            System.out.print("Play again? (yes/no): ");
            String choice = sc.next();

            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("\nFinal Score: " + score);
        System.out.println("Thank you for playing!");
        sc.close();
    }
}