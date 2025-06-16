import java.util.Random; // Hazel
import java.util.Scanner;

public class NumberGuessingGamedraft {

    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        String playAgain;
        
        System.out.println(" ====== Welcome to the Number Guessing Game ======  ");
        System.out.println("------------------------------------------------------");
        System.out.print("Enter your player name: ");
        String playerName = scanner.nextLine();
        System.out.println("-----------------------------------------------------------");
        
        do { // Omela
            Random random = new Random(); 
            int randomNumber = random.nextInt(50) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 10;

            System.out.println("Hello, " + playerName + "! Select a number between 1 and 50.");
            System.out.println("You have " + maxAttempts + " attempts to guess it correctly. Good luck!!!!");
            System.out.println("-----------------------------------------------------------"); 

            while (attempts < maxAttempts) { 
                System.out.print("(" + (maxAttempts - attempts) + " attempts left) Enter your guess: ");
                guess = scanner.nextInt();
                scanner.nextLine(); 
                attempts++;

                if (guess < randomNumber) {   
                    System.out.println("------------------------");
                    System.out.println("Too Cold!");
                    System.out.println("------------------------");
                } else if (guess > randomNumber) {
                    System.out.println("------------------------"); 
                    System.out.println("Too Hot!");
                    System.out.println("------------------------"); 
                } else { // Jayvee
                    System.out.println("--------------------------------------------------");
                    System.out.println("Congratulations, " + playerName + "! You guessed the number in " + attempts + " attempts.");
                    System.out.println("-------------------------------------------------");
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Sorry, " + playerName + ". You lose the game. The final number was " + randomNumber + ".");
                System.out.println("----------------------------------------------------------");
            }

            System.out.println("---------------------------------------");
            System.out.println("      Thanks for playing, " + playerName + "! ");
            System.out.println("---------------------------------------");
            System.out.println("-----------------------------------------------");
            System.out.println("        Do you want to try again? (Yes/No)   ");
            System.out.println("-----------------------------------------------");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("Yes"));
        
        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }
}
