package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vendor {

    private boolean isStudio;
    private String name;
    private String description;
    private List<Game> games;
    private int soldCopies;

    public Vendor(){
        this.isStudio = false;
        this.name = "";
        this.description = "";
        this.games = new ArrayList<Game>();
        this.soldCopies = 0;
    }

    public Vendor(boolean isStudio, String name, String description, List<Game> games, int soldCopies) {
        this.isStudio = isStudio;
        this.name = name;
        this.description = description;
        this.games = games;
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
        Vendor vendor = (Vendor) o;
        return Objects.equals(name, vendor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return  "\n\tName: " + name +
                "\n\tDescription: " + description +
                "\n\tGames: " + games +
                "\n\tSold Copies: " + soldCopies;
    }
}
