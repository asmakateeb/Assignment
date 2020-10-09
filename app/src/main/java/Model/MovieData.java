package Model;

import java.util.ArrayList;
import java.util.List;

public class MovieData implements IMovieData {


    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieData() {
        movies.add(new Movie("The life of David", "2016"
                , "action"));
        movies.add(new Movie("Mean girl", "2000",
                "comedy"));
        movies.add(new Movie("Americian Beauty", "1999",
                "Drama"));

    }

    @Override
    public List<Movie> selectMovietitle(String title) {

        ArrayList<Movie> data = new ArrayList<>();
        for(Movie m : movies){
            if(m.getTitle().equals(data)){
                data.add(m);
            }
        }
        return data;

    }

    @Override
    public List<Movie> selectMovieyear(String year) {
        ArrayList<Movie> data = new ArrayList<>();
        for(Movie m : movies){
            if(m.getYear().equals(data)){
                data.add(m);
            }
        }
        return data;

    }



    @Override
    public List<Movie> selectMoviegene(String gene) {
        ArrayList<Movie> data = new ArrayList<>();
        for(Movie movie : movies){
            if(movie.getGene().equals(data));
                data.add(movie);
            }

        return data;

    }

    @Override
    public String[] getTitle() {
        String []title=new String[]{"The life of David","Mean girl","Americian Beauty"};
        return title;
    }

    @Override
    public String[] getYear() {
        String [] year =new String []{"2016","2000","1999"};
        return year;
    }

    @Override
    public String[] getGene() {
        String[]gene=new String[]{"Action","Comedy","Drama"};
        return gene;
    }



}
