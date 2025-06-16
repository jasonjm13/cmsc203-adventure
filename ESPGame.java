/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: This program tests the user's ESP skills by asking them to guess a randomly selected color
 *              from a displayed list. It reads color names from a file and interacts with the user via console.
 * Due: [06/16/2025]
 * Platform/compiler: Eclipse IDE / Java 17
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Jason Martin
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner fileScanner = null;
        final String FILE_NAME = "colors.txt";
        final int TOTAL_COLORS = 16;

        System.out.println("Welcome to ESP - extrasensory perception!");

        String playAgain = "Yes";
        int lastCorrectGuesses = 0; // store for output later

        while (playAgain.equalsIgnoreCase("Yes")) {
            int option = 0;

            // Menu and option validation
            while (option < 1 || option > 4) {
                System.out.println("\nWould you please choose one of the 4 options from the menu:");
                System.out.println("1 - Display 16 colors");
                System.out.println("2 - Display 10 colors");
                System.out.println("3 - Display 5 colors");
                System.out.println("4 - Exit the program");
                System.out.print("Enter the option: ");

                if (input.hasNextInt()) {
                    option = input.nextInt();
                    input.nextLine(); // clear newline
                } else {
                    input.nextLine();
                    System.out.println("Invalid input. Please enter a number 1-4.");
                }
            }

            if (option == 4) break;

            int colorsToUse = (option == 1) ? 16 : (option == 2) ? 10 : 5;

            try {
                fileScanner = new Scanner(new File(FILE_NAME));

                System.out.println("There are colors from the file:");
                int count = 1;
                String color1 = "", color2 = "", color3 = "", color4 = "", color5 = "",
                       color6 = "", color7 = "", color8 = "", color9 = "", color10 = "",
                       color11 = "", color12 = "", color13 = "", color14 = "", color15 = "", color16 = "";

                while (fileScanner.hasNextLine() && count <= colorsToUse) {
                    String color = fileScanner.nextLine();
                    System.out.println(count + " " + color);
                    switch (count) {
                        case 1: color1 = color; break;
                        case 2: color2 = color; break;
                        case 3: color3 = color; break;
                        case 4: color4 = color; break;
                        case 5: color5 = color; break;
                        case 6: color6 = color; break;
                        case 7: color7 = color; break;
                        case 8: color8 = color; break;
                        case 9: color9 = color; break;
                        case 10: color10 = color; break;
                        case 11: color11 = color; break;
                        case 12: color12 = color; break;
                        case 13: color13 = color; break;
                        case 14: color14 = color; break;
                        case 15: color15 = color; break;
                        case 16: color16 = color; break;
                    }
                    count++;
                }

                Random rand = new Random();
                int correctGuesses = 0;

                for (int round = 1; round <= 3; round++) {
                    System.out.println("\nRound " + round);
                    System.out.println("I am thinking of a color.");
                    System.out.println("Is it one of the list of colors above?");
                    System.out.print("Enter your guess: ");
                    String guess = input.nextLine();

                    int selected = rand.nextInt(colorsToUse) + 1;
                    String selectedColor = "";
                    switch (selected) {
                        case 1: selectedColor = color1; break;
                        case 2: selectedColor = color2; break;
                        case 3: selectedColor = color3; break;
                        case 4: selectedColor = color4; break;
                        case 5: selectedColor = color5; break;
                        case 6: selectedColor = color6; break;
                        case 7: selectedColor = color7; break;
                        case 8: selectedColor = color8; break;
                        case 9: selectedColor = color9; break;
                        case 10: selectedColor = color10; break;
                        case 11: selectedColor = color11; break;
                        case 12: selectedColor = color12; break;
                        case 13: selectedColor = color13; break;
                        case 14: selectedColor = color14; break;
                        case 15: selectedColor = color15; break;
                        case 16: selectedColor = color16; break;
              }

                    if (guess.equalsIgnoreCase(selectedColor)) {
                        correctGuesses++;
                    }

                    System.out.println("I was thinking of " + selectedColor + ".");
                }

                System.out.println("\nGame Over");
                System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
                lastCorrectGuesses = correctGuesses;

            } catch (FileNotFoundException e) {
                System.out.println("Error: colors.txt not found.");
            } finally {
                if (fileScanner != null) fileScanner.close();
            }

            System.out.print("Would you like to continue the game? Type Yes/No: ");
            playAgain = input.nextLine();
        }

        // User info
        System.out.print("\nEnter your name: ");
        String username = input.nextLine();
        System.out.print("Describe yourself: ");
        String description = input.nextLine();
        System.out.print("Due Date (MM/DD): ");
        String dueDate = input.nextLine();

        System.out.println("\nGame Over");
        System.out.println("You guessed " + lastCorrectGuesses + " out of 3 colors correctly.");
        System.out.println("Due Date: " + dueDate);
        System.out.println("Username: " + username);
        System.out.println("User Description: " + description);
        System.out.println("Date: " + dueDate);

        try {
            PrintWriter writer = new PrintWriter("EspGameResults.txt");
            writer.println("Game Over");
            writer.println("You guessed " + lastCorrectGuesses + " out of 3 colors correctly.");
            writer.println("Due Date: " + dueDate);
            writer.println("Username: " + username);
            writer.println("User Description: " + description);
            writer.println("Date: " + dueDate);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to EspGameResults.txt");
        }

        input.close();
    }
    }