package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Game {

    private int code;
    private String title;
    private List<String> genre;
    private String description;
    private String developer;
    private String releaseDate;
    private double price;
    private int soldCopies;
    private int nowPlaying;

    public Game(){
        this.code = -1;
        this.title = "";
        this.genre = new ArrayList<String>();
        this.description = "";
        this.developer = "";
        this.releaseDate = "";
        this.price = -1;
        this.soldCopies = 0;
        this.nowPlaying = 0;
    }

    public Game(int code, String title, List<String> genre, String description, String developer, String releaseDate, double price, int soldCopies, int nowPlaying) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.price = price;
        this.soldCopies = soldCopies;
        this.nowPlaying = nowPlaying;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoldCopies() {
        return soldCopies;
    }

    public void setSoldCopies(int soldCopies) {
        this.soldCopies = soldCopies;
    }

    public int getNowPlaying() {
        return nowPlaying;
    }

    public void setNowPlaying(int nowPlaying) {
        this.nowPlaying = nowPlaying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Game game = (Game) o;
        return code == game.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return  "\n\tCode: " + code +
                "\n\tTitle: " + title +
                "\n\tGenre: " + genre +
                "\n\tDescription: " + description +
                "\n\tDeveloper: " + developer +
                "\n\tRelease Date: " + releaseDate +
                "\n\tPrice: " + price +
                "\n\tSold Copies: " + soldCopies +
                "\n\tNow Playing: " + nowPlaying;
    }
}
