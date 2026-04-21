package org.java.spring.best_of_the_year.classes;

public abstract class AbstractType {

    private int id;
    private String title;
    private float averageVote;

    public AbstractType(int id, String title, float averageVote) {
        this.id = id;
        this.title = title;
        this.averageVote = averageVote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getAverageVote() {
        return averageVote;
    }

    public void setAverageVote(float averageVote) {
        this.averageVote = averageVote;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f stars", title, averageVote);
    }

}
