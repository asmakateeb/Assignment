package Model;

public class Movie {
    private String title;
    private String year;
    private String gene;

    public Movie(String title, String year, String gene) {
        this.title = title;
        this.year = year;
        this.gene = gene;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }
}

