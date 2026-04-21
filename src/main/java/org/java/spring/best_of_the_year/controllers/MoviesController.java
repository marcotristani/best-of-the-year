package org.java.spring.best_of_the_year.controllers;

import org.java.spring.best_of_the_year.classes.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class MoviesController {

    @GetMapping("/movies")
    public String movies(Model model) {

        Movie film1 = new Movie(1, "la bella e la bestia", 4.5f);

        model.addAttribute("movie", film1);

        return "movies";
    }

}
