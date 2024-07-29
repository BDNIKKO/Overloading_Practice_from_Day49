package org.example;

public class TvShow {
    private String name;
    private int seasons;
    private String genre;

    public TvShow() {
        this.name = "Unknown";
        this.seasons = 0;
        this.genre = "Unknown";
    }

    public TvShow(String name) {
        this.name = name;
        this.seasons = 0;
        this.genre = "Unknown";
    }

    public TvShow(String name, int seasons) {
        this.name = name;
        this.seasons = seasons;
        this.genre = "Unknown";
    }

    // Constructor with name, seasons, and genre
    public TvShow(String name, int seasons, String genre) {
        this.name = name;
        this.seasons = seasons;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "TvShow [name=" + name + ", seasons=" + seasons + ", genre=" + genre + "]";
    }
}
