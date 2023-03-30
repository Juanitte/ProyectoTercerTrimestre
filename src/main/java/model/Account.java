package model;

import java.util.Objects;

public class Account {

    protected String username;
    protected String birthDate;
    protected String address;
    protected String country;
    protected String email;

    public Account() {
        this.username = "";
        this.birthDate = "";
        this.address = "";
        this.country = "";
        this.email = "";
    }

    public Account(String username, String birthDate, String address, String country, String email) {
        this.username = username;
        this.birthDate = birthDate;
        this.address = address;
        this.country = country;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
