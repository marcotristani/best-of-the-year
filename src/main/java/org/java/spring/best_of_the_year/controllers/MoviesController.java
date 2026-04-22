package org.java.spring.best_of_the_year.controllers;

import java.util.ArrayList;

import org.java.spring.best_of_the_year.classes.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class MoviesController {

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

        // creo array dove andare a mettere i film
        ArrayList<Movie> movies = new ArrayList<>();

        // creo i film
        Movie film1 = new Movie(1, "la bella e la bestia", 4.5f);
        Movie film2 = new Movie(2, "principessa kitty", 2.5f);
        Movie film3 = new Movie(3, "aladino", 5f);

        movies.add(film1);
        movies.add(film2);
        movies.add(film3);

        model.addAttribute("movies", getBestMovies(movies));

        return "movies";
    }

}
