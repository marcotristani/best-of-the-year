package org.java.spring.best_of_the_year.classes;

import java.io.Serializable;

public class Movie extends AbstractType implements Serializable {

    public Movie() {
        super(0, "senza nome", 0.0f);
    }

    public Movie(int id, String title, float averageVote) {
        super(id, title, averageVote);
    }

}
