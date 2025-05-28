package se.distansakademin.rest_ez.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.CancellationException;

import static java.util.Calendar.*;
import static java.util.concurrent.TimeUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTests {

    // Skapa (testdrivet) en User-class med firstname, lastname,
    // company, country & birthdate med följande metoder
    //    - Get email (fname.lname@company.country)
    //    - Get full name ("Firstname Lastname")
    //    - Get age (24 apr 1994 -> 31)

    User user;

    @BeforeEach
    public void setup() {
        String firstName = "Test";
        String lastName = "User";
        String companyName = "TestCompany";
        String country = "SE";

        Calendar now = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar(now.get(YEAR) - 50, now.get(MONTH), now.get(DAY_OF_MONTH));

        user = new User(firstName, lastName, companyName, country, calendar);
    }


    // in: user
    // out: "test.user@testcompany.se"
    @Test
    public void testGetEmail() {
        // Arrange
        // done in setup()

        // Act
        String expected = "test.user@testcompany.se";
        String actual = user.getEmail();

        // Assert
        assertEquals(expected, actual);
    }


    // in: user
    // out: "Test user"
    @Test
    public void testGetFullName() {
        // Arrange
        // done in setup()

        // Act
        String expected = "Test User";
        String actual = user.getFullName();

        // Assert
        assertEquals(expected, actual);
    }


    // in: user
    // out: 31
    @Test
    public void testGetAge() {
        // Arrange
        // done in setup()

        // Act
        int expected = 50;
        int actual = user.getAge();

        // Assert
        assertEquals(expected, actual);
    }


    // in: user som fyller 50 imorgon
    // out: 49
    @Test
    public void testGetAge_birthdayIsTomorrow() {
        // Arrange
        Calendar now = Calendar.getInstance();
        int year = now.get(YEAR) - 50;
        int month = now.get(MONTH);
        int dayOfMonth = now.get(DAY_OF_MONTH);
        Calendar birthDate = new GregorianCalendar(year, month, dayOfMonth);
        birthDate.add(HOUR, 24);
        User user = new User("", "", "", "", birthDate);

        // Act
        int expected = 49;
        int actual = user.getAge();

        // Assert
        assertEquals(expected, actual);
    }
}
