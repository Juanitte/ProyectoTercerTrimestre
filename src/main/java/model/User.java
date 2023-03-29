package model;

import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private String username;
    private int age;
    private String address;
    private String country;
    private double money;
    private List<Game> games;

    public User(){
        this.name = "";
        this.surname = "";
        this.username = "";
        this.age = -1;
        this.address = "";
        this.country = "";
        this.money = 0;
    }

    public User(String dni, String name, String surname, String username, int age, String address, String country, double money, List<Game> games) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.age = age;
        this.address = address;
        this.country = country;
        this.money = money;
        this.games = games;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return  "\n\tName: " + name +
                "\n\tSurname: " + surname +
                "\n\tUsername: " + username +
                "\n\tAge: " + age +
                "\n\tAddress: " + address +
                "\n\tCountry: " + country +
                "\n\tMoney: " + money +
                "\nGames:\n\t" + games.toString() + "\n\t";
    }
}
