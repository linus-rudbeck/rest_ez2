package se.distansakademin.rest_ez.models;

public class EmailAddress {

    String firstName;
    String lastName;
    String domain;

    public EmailAddress(String firstName, String lastName, String domain){
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName.toLowerCase();
        this.domain = domain.toLowerCase();
    }


    public String getFullEmail() {
        return firstName+"."+lastName+"@"+domain;
    }
}
