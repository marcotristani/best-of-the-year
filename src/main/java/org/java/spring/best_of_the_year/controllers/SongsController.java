package org.java.spring.best_of_the_year.controllers;

import java.util.ArrayList;
import org.java.spring.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class SongsController {

    private ArrayList<Song> getBestSongs(ArrayList<Song> songs) {

        ArrayList<Song> bestSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAverageVote() > 4f) {
                bestSongs.add(song);
            }
        }
        return bestSongs;
    }

    @GetMapping("/songs")
    public String songs(Model model) {

        ArrayList<Song> songs = new ArrayList<>();

        Song canzone1 = new Song(1, "la canzone del sole", 5.00f);
        Song canzone2 = new Song(2, "Viva la pappa", 3.00f);
        Song canzone3 = new Song(3, "Brividi", 4.2f);

        songs.add(canzone1);
        songs.add(canzone2);
        songs.add(canzone3);

        model.addAttribute("songs", getBestSongs(songs));
        return "songs";
    }

}
