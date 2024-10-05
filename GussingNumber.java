import java.util.Scanner;
import java.util.Random;

public class GussingNumber {
    
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc=new Scanner(System.in);

        // Create a Random object to generate random numbers
        Random random=new Random();

         // Generate a random number between 1 and 100
        int RandomNumber=random.nextInt(100)+1;

        // Declare a variable to store the user's guess
        int guess=0;

        // Keep track of the number of attempts
        int attempt=0;

        // Welcome message
        System.out.println("WELCOME TO  THE GUESSING NUMBER GAME");
        System.out.println("i have selected numbers between 1-100,please can u guess the what is it?");

        // Start the guessing loop
        while(guess!=RandomNumber)
        {
            // Prompt the user for their guess
            System.out.print("Enter Guessing number: ");
            guess=sc.nextInt();// Read user's guess

            // Increment the attempt counter
            attempt++;

             // Check if the guess is too high, too low, or correct
            if(guess>RandomNumber)
            {
                System.out.println("Too High, Try agian please");
            }
            else if(guess<RandomNumber)
            {
                System.out.println("Too low, Try agian please"); 
            }
            else
            {
                System.out.println("Congratulations! You've guessed the correct number "+guess);
                System.out.println("it tooks you "+ attempt+"attempts");
            }
        }
    }
}
