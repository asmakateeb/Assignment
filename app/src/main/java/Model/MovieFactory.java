package Model;

public class MovieFactory {
    public IMovieData getModel(){

        return new MovieData();

    }
}
