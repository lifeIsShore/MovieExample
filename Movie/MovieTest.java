package Movie;

public class MovieTest { public static void main(String[] args) {
    // Create an array of 5 movie objects
    Movie[] movies = new Movie[5];

    // Initialize the first movie object
    movies[0] = new Movie("The Shawshank Redemption", "Frank Darabont", 1994, 9.3);

    // Print the details of the first movie object
    System.out.println("Details of the first movie:");
    System.out.println(movies[0].getMovieDetail());

    // Change the rating of the first movie object
    movies[0].setRating(9.5);

    // Print the details of the first movie object again
    System.out.println("Details of the first movie after changing the rating:");
    System.out.println(movies[0].getMovieDetail());
}
}
