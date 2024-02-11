/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 *  Description: Write a program that tests your ESP
 *  Due: 02/12/24
 *  Platform/Compiler: Eclipse IDE
 *  I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student.
 *  Print your Name here: Darina Diaz
 */
package main;

import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Describe yourself:");
        String description = scanner.nextLine();
        
        System.out.println("Due Date:");
        String dueDate = scanner.nextLine();
        
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        
        int correctTries = 0;
        Random random = new Random();
        
        for (int i = 1; i <= 10; i++) {
            String chosenColor = "";
            int randomNumber = random.nextInt(5);
            
            switch (randomNumber) {
                case 0:
                    chosenColor = "Red";
                    break;
                case 1:
                    chosenColor = "Green";
                    break;
                case 2:
                    chosenColor = "Blue";
                    break;
                case 3:
                    chosenColor = "Orange";
                    break;
                case 4:
                    chosenColor = "Yellow";
                    break;
            }
            
            System.out.println("Round " + i);
            System.out.println();
            System.out.println("I am thinking of a color. Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.println("Enter your guess:");
            
            while (true) {
                String guess = scanner.nextLine();
                System.out.println(); 

                
                if (!(guess.equalsIgnoreCase("Red") || guess.equalsIgnoreCase("Green") ||
                      guess.equalsIgnoreCase("Blue") || guess.equalsIgnoreCase("Orange") ||
                      guess.equalsIgnoreCase("Yellow"))) {
                    System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                    System.out.println("Enter your guess again:");
                } else {
                    if (guess.equalsIgnoreCase(chosenColor)) {
                        correctTries++;
                    }
                    break;
                }
            }
            
            System.out.println("I was thinking of " + chosenColor + ".");
        }
        
        System.out.println("Game Over");
        System.out.println("You guessed " + correctTries + " out of 10 colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);
        
        scanner.close();
    }
}