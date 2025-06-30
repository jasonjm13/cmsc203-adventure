import java.util.Scanner;

/**
 * MovieDriver_Task2.java
 * CMSC203 Lab 1 - Task 2 Driver to test Movie class with loop
 * Author: Jason Martin
 * Date: 2025-06-30
 *
 * This program reads and prints information for multiple movies
 * until the user chooses to stop.
 */

public class MovieDriver_Task2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String continueInput;

        do {
            Movie movie = new Movie();

            // Prompt for movie title
            System.out.print("Enter the title of a movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title);

            // Prompt for movie rating
            System.out.print("Enter the movie's rating: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating);

            // Prompt for tickets sold
            System.out.print("Enter the number of tickets sold at the theater: ");
            int tickets = keyboard.nextInt();
            movie.setSoldTickets(tickets);

            // Print movie info
            System.out.println("\n" + movie.toString());

            keyboard.nextLine(); // consume leftover newline

            // Ask if user wants to continue
            System.out.print("Do you want to continue? (yes/no): ");
            continueInput = keyboard.nextLine().trim().toLowerCase();

        } while (continueInput.equals("yes"));

        keyboard.close();
    }
}
