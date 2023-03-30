package model;

import java.util.List;
import java.util.Objects;

public class User extends Account {

    private String name;
    private String surname;
    private double money;
    private List<Game> games;
    private boolean isDev;

    public User(){
        this.name = "";
        this.surname = "";
        this.money = 0;
        this.isDev = false;
    }

    public User(String username, String birthDate, String address, String country, String email, String name, String surname, double money, List<Game> games, boolean isDev) {
        super(username, birthDate, address, country, email);
        this.name = name;
        this.surname = surname;
        this.money = money;
        this.games = games;
        this.isDev = isDev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public boolean getIsDev() {
        return this.isDev;
    }

    public void setIsDev(boolean isDev) {
        this.isDev = isDev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public String toString() {
            return  "\n\tName: " + name +
                    "\n\tSurname: " + surname +
                    "\n\tUsername: " + username +
                    "\n\tBirth Date: " + birthDate +
                    "\n\tAddress: " + address +
                    "\n\tCountry: " + country +
                    "\n\tMoney: " + money +
                    "\nGames:\n\t" + games.toString() + "\n\t";
    }
}
