package edu.cs.birzeit.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import Model.IMovieData;
import Model.Movie;
import Model.MovieFactory;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Spinner spinner1;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinnertitle);
        spinner1=findViewById(R.id.spinnerYear);
        spinner2=findViewById(R.id.spenergene);
        populateSpinner();
        populateSpinner1();
        populateSpinner2();


    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovieData title = factory.getModel();

        String[] moviestitle = title.getTitle();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, moviestitle);

        spinner.setAdapter(adapter);



    }
    private void populateSpinner1(){
        MovieFactory factory = new MovieFactory();
        IMovieData year = factory.getModel();

        String[] moviesyear= year.getYear();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, moviesyear);

        spinner1.setAdapter(adapter);
    }
    private void populateSpinner2(){
        MovieFactory factory = new MovieFactory();
        IMovieData gene = factory.getModel();

        String[] moviesgene = gene.getGene();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, moviesgene);

        spinner2.setAdapter(adapter);
    }




    public void btnSelectMoviesOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieData year = factory.getModel();

        String item  = "";

        item = spinner.getSelectedItem().toString();

        List <Movie> movies= year.selectMovietitle(item);
        String str="";

        for (Movie m:movies) {
            str += m.getTitle() + "\n";

        }
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();


    }
    }
