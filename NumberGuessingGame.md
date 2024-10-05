# Number Guessing Game
**Description**

The Number Guessing Game is a simple console-based Java game. The program randomly generates a number between 1 and 100, and the user tries to guess the number. The program provides feedback on whether the guess is too high, too low, or correct. The game continues until the correct number is guessed, and it also tracks the number of attempts the user made.

**Features**

Random number generation between 1 and 100.
Feedback for user guesses: too high, too low, or correct.
Tracks and displays the number of attempts.
Interactive and beginner-friendly.

**Requirements**

To run this project, you need:

Java Development Kit (JDK) installed (version 8 or higher).
Any Java IDE (e.g., Eclipse, IntelliJ IDEA, or VSCode), or you can compile and run it using the command line.

**Code Explanation**

**1.Random Number Generation:**

The program uses the  **Random** class to generate a random number between 1 and 100:

```java
Random random = new Random();
int randomNumber = random.nextInt(100) + 1;
```
**2.User Input:**

The program uses a **Scanner** object to read the user's guesses:
```java
Scanner scanner = new Scanner(System.in);
```

**3.Looping:**

A **while** loop ensures that the program keeps running until the correct number is guessed:
```java
while (guess != randomNumber) {
    // Prompt for input and provide feedback
}
```

**4.Feedback:**

The program checks if the guess is higher or lower than the random number and provides feedback:
```java
if (guess > randomNumber) {
    System.out.println("Too high! Try again.");
} else if (guess < randomNumber) {
    System.out.println("Too low! Try again.");
}
```
**5.Termination:**

The game ends when the user correctly guesses the number. The program prints a congratulatory message along with the number of attempts.

# Example Output
```java
Welcome to the Number Guessing Game!
I have selected a number between 1 and 100. Can you guess what it is?
Enter your guess: 50
Too high! Try again.
Enter your guess: 25
Too low! Try again.
Enter your guess: 30
Congratulations! You've guessed the correct number: 30
It took you 3 attempts.
```
