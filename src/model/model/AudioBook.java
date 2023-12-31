package model.model;

import java.io.Serializable;

public class AudioBook extends Item {
    private int duration;

    public AudioBook() {
    }

    public AudioBook(String title, String author, int yearPublished, Language language, int duration) {
        super(title, author, yearPublished, language);
        this.duration = duration;
    }

    public AudioBook(String title, String author, int yearPublished, int duration) {
        super(title, author, yearPublished, Language.POLISH);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Objects.AudioBook{" +
                "duration=" + duration +
                "} " + super.toString();
    }

}
