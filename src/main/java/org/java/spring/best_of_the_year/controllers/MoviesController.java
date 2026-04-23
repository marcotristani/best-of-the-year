package org.java.spring.best_of_the_year.controllers;

import java.util.ArrayList;

import org.java.spring.best_of_the_year.classes.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class MoviesController {

    // creo array dove andare a mettere i film
    private ArrayList<Movie> movies = new ArrayList<>();

    // creo i film
    private Movie film1 = new Movie(1, "la bella e la bestia", 4.5f);
    private Movie film2 = new Movie(2, "principessa kitty", 4.5f);
    private Movie film3 = new Movie(3, "aladino", 5f);

    {
        movies.add(film1);
        movies.add(film2);
        movies.add(film3);
    };

    private ArrayList<Movie> getBestMovies(ArrayList<Movie> movies) {

        ArrayList<Movie> bestMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getAverageVote() > 4f) {
                bestMovies.add(movie);
            }
        }
        return bestMovies;
    }

    @GetMapping("/movies")
    public String movies(Model model) {

        model.addAttribute("movies", getBestMovies(this.movies));

        return "movies";
    }

    @GetMapping("/movies/{id}")
    public String movieDetail(Model model, @PathVariable("id") int id) {

        Boolean thereIs = false;
        for (Movie movie : movies) {
            if (id == movie.getId()) {
                model.addAttribute("element", movie);
                thereIs = true;

            }
        }
        if (thereIs) {
            return "detail";
        } else {
            return "notFound";
        }
    }
}
