package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Developer extends Account {

    private boolean isStudio;
    private String description;
    private List<Game> games;
    private int soldCopies;

    public Developer(){
        super();
        this.isStudio = false;
        this.description = "";
        this.games = new ArrayList<Game>();
        this.soldCopies = 0;
    }

    public Developer(String username, String birthDate, String address, String country, String email, boolean isStudio, String description, List<Game> games, int soldCopies) {
        super(username, birthDate, address, country, email);
        this.isStudio = isStudio;
        this.description = description;
        this.games = games;
        this.soldCopies = soldCopies;
    }

    public boolean isStudio() {
        return isStudio;
    }

    public void setStudio(boolean studio) {
        isStudio = studio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public int getSoldCopies() {
        return soldCopies;
    }

    public void setSoldCopies(int soldCopies) {
        this.soldCopies = soldCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Developer vendor = (Developer) o;
        return Objects.equals(username, vendor.username);
    }

    @Override
    public String toString() {
        return  "\n\tName: " + username +
                "\n\tDescription: " + description +
                "\n\tGames: " + games +
                "\n\tSold Copies: " + soldCopies;
    }
}
