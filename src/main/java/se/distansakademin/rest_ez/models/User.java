package se.distansakademin.rest_ez.models;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class User {
    private final String firstName, lastName, companyName, country;
    private final Calendar birthDate;

    public User(String firstName, String lastName, String companyName, String country, Calendar birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.country = country;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        String email = firstName + "." + lastName + "@" + companyName + "." + country;
        return email.toLowerCase();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        Calendar now = Calendar.getInstance();

        int years = now.get(YEAR) - birthDate.get(YEAR);

        if (birthDate.get(MONTH) > now.get(MONTH)
                || (birthDate.get(MONTH) == now.get(MONTH) && birthDate.get(DATE) > now.get(DATE))) {
            years--;
        }

        return years;
    }

    public void addPassword(String somePassword) {

    }

    public String getPassword() {
        return null;
    }
}
