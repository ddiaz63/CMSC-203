package movie;

import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean wantAnotherMovie = true;
        
        while (wantAnotherMovie) {
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();

            System.out.print("Enter the movie's rating: ");
            String rating = scanner.nextLine();

            System.out.print("Enter the number of tickets sold: ");
            int ticketsSold = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            
            Movie movie = new Movie(title, rating, ticketsSold);
            System.out.println(movie);
            
            System.out.print("Do you want to add another movie? (yes/no): ");
            String input = scanner.nextLine();
            wantAnotherMovie = input.equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}

class Movie {
    private String title;
    private String rating;
    private int ticketsSold;

    public Movie(String title, String rating, int ticketsSold) {
        this.title = title;
        this.rating = rating;
        this.ticketsSold = ticketsSold;
    }

    @Override
    public String toString() {
        return "Movie Information:\n" +
                "Title: " + title + "\n" +
                "Rating: " + rating + "\n" +
                "Tickets Sold: " + ticketsSold + "\n";
    }
}
