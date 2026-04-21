package org.java.spring.best_of_the_year.classes;

import java.io.Serializable;

public class Song extends AbstractType implements Serializable {

    public Song() {
        super(0, "senza nome", 0.0f);
    }

    public Song(int id, String title, float averageVote) {
        super(id, title, averageVote);
    }

}