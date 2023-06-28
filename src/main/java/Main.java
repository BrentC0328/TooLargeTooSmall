/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber;
        int userGuess = 0;
        int guessesCount = 0;


        String tooSmall = "Too low, try again.";
        String tooBig = "Too big. Try again.";
        String correctGuess = "You got it! Well done";
        

        randomNumber = random.nextInt(10) + 1;
        System.out.println(randomNumber);

        System.out.println("Welcome to the guessing game");
        System.out.println("How many guesses will it take you to find a random number between 1-10");

        while (userGuess != randomNumber){
            System.out.println("Type your guess under");
            userGuess = scanner.nextInt();


            if (userGuess > randomNumber) {
                System.out.println(tooBig);
                guessesCount++;

            } else if (userGuess < randomNumber) {
                System.out.println(tooSmall);
                guessesCount++;

            } else {

                System.out.println(correctGuess);
                System.out.println("You had " +guessesCount + " incorrect guesses" );

            }


            }



        }


    }

