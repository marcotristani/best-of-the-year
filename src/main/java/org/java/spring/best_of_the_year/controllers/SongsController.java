package org.java.spring.best_of_the_year.controllers;

import org.java.spring.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class SongsController {

    @GetMapping("/songs")
    public String song(Model model) {

        Song canzone1 = new Song(1, "la canzone del sole", 5.00f);

        model.addAttribute("song", canzone1);
        return "songs";
    }

}
