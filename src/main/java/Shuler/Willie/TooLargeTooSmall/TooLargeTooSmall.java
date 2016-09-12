package Shuler.Willie.TooLargeTooSmall;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;
import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by willieshuler on 9/10/16.
 */
public class TooLargeTooSmall {

    public int generateRandomNumbers() {

        Random random = new Random();
        int numberSelected = random.nextInt(10);
        return numberSelected;
    }

    public int keepTrackofTries() {
        int numberofTries = 0;
        return numberofTries;
    }

    public int usersGuess() {
        Scanner userInput = new Scanner(System.in);
        int usersInput = userInput.nextInt();
        return usersInput;
    }

    public static void main(String[] args) {

        TooLargeTooSmall tooLargeTooSmall = new TooLargeTooSmall();
        int numberToGuess = tooLargeTooSmall.generateRandomNumbers();
        int count = tooLargeTooSmall.keepTrackofTries();
        boolean win = false;

        while (win == false) {
            System.out.print("Guess a number from 1-10: ");
            int usersGuess = tooLargeTooSmall.usersGuess();
            count++;

            if (usersGuess < numberToGuess) {
                System.out.println("I'm sorry, your guess is too low. Try again");

            } else if (usersGuess > numberToGuess) {
                System.out.println("I'm sorry, your guess is too high. Try again");

            } else if (usersGuess == numberToGuess) {

                System.out.println("Congratulations! You selected the correct number. It took you " + count +
                        " time(s).");
                win = true;
            }
        }
    }
}