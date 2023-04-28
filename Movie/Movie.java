package Movie;

public class Movie {

    private String movieName;
    private String directorName;
    private int releaseYear;
    private double rating;

    // Constructor
    public Movie(String movieName, String directorName, int releaseYear, double rating) {
        this.movieName = movieName;
        this.directorName = directorName;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getters and Setters
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    // Get Movie Details
    public String getMovieDetail() {
        return "Movie Name: " + movieName + ", Director Name: " + directorName + ", Release Year: " + releaseYear + ", Rating: " + rating;
    }
}
