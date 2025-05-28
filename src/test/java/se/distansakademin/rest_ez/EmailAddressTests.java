package se.distansakademin.rest_ez;

import org.junit.jupiter.api.Test;
import se.distansakademin.rest_ez.models.EmailAddress;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailAddressTests {

    // Omvandla förnamn, efternamn och domän till en email-adress
    // allt ska bli lower case

    // in: "Linus" "Rudbeck" "distansakademin.se"
    // out: "linus.rudbeck@distansakademin.se"

    @Test
    public void testCreateEmailAddress(){
        // Arrange (förberedelser)
        EmailAddress emailAddress = new EmailAddress("Linus", "Rudbeck", "distansakademin.se");

        // Act (kör huvudkod & ta emot svar)
        String expected = "linus.rudbeck@distansakademin.se";
        String actual = emailAddress.getFullEmail();

        // Assert (kontrollera svar)
        assertEquals(expected, actual);
    }

}
