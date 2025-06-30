import java.util.Scanner;

/**
 * MovieDriver_Task1.java
 * CMSC203 Lab 1 - Task 1 Driver to test Movie class
 * Author: Jason Martin
 * Date: 2025-06-30
 *
 * This program reads information for one movie and prints it.
 */

public class MovieDriver_Task1 {

    public static void main(String[] args) {
        // Create Scanner to read user input
        Scanner keyboard = new Scanner(System.in);

        // Create a new Movie object
        Movie movie = new Movie();

        // Prompt user and read movie title
        System.out.print("Enter the title of a movie: ");
        String title = keyboard.nextLine();
        movie.setTitle(title);

        // Prompt user and read movie rating
        System.out.print("Enter the movie's rating: ");
        String rating = keyboard.nextLine();
        movie.setRating(rating);

        // Prompt user and read number of tickets sold
        System.out.print("Enter the number of tickets sold at the theater: ");
        int tickets = keyboard.nextInt();
        movie.setSoldTickets(tickets);

        // Print out movie information using toString()
        System.out.println("\n" + movie.toString());

        keyboard.close();
    }
}