import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private String genre;
    private int releaseYear;

    public Movie(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

interface MovieTest {
    boolean test(Movie movie);
}

public class NetflixMovies {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Sci-Fi", 2010));
        movies.add(new Movie("The Shawshank Redemption", "Drama", 1994));
        movies.add(new Movie("The Dark Knight", "Action", 2008));
        movies.add(new Movie("Pulp Fiction", "Crime", 1994));
        movies.add(new Movie("The Matrix", "Sci-Fi", 1999));

        MovieTest isSciFiTest = movie -> movie.getGenre().equalsIgnoreCase("Sci-Fi");
        MovieTest isOldMovieTest = movie -> movie.getReleaseYear() < 2000;

        System.out.println("Sci-Fi Movies:");
        filterAndPrintMovies(movies, isSciFiTest);

        System.out.println("\nOld Movies (Released before 2000):");
        filterAndPrintMovies(movies, isOldMovieTest);
    }

    private static void filterAndPrintMovies(List<Movie> movies, MovieTest condition) {
        for (Movie movie : movies) {
            if (condition.test(movie)) {
                System.out.println(movie);
            }
        }
    }
}
