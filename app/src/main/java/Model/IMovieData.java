package Model;

import java.util.List;

public interface IMovieData {

    List<Movie> selectMovietitle(String title);
    List<Movie> selectMovieyear(String year);
    List<Movie> selectMoviegene(String gene);


    String[] getTitle();
    String [] getYear ();
    String[] getGene();



}
