package se.distansakademin.rest_ez;


import org.junit.jupiter.api.Test;
import se.distansakademin.rest_ez.models.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BankAccountTests {

    @Test
    public void testGetAccountBalance(){
        // Arrange
        BankAccount bankAccount = new BankAccount(1000);

        // Act
        int expected = 1000;
        int actual = bankAccount.getBalance();

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testDepositBalanceToAccount()   {
        // Arrange
        BankAccount bankAccount = new BankAccount(1000);

        // Act
        int expected = 2000;
        bankAccount.deposit(1000);
        int actual = bankAccount.getBalance();

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testWithdrawBalanceFromAccount() throws Exception {
        // Arrange
        BankAccount bankAccount = new BankAccount(1000);

        // Act
        int expected = 0;
        bankAccount.withdraw(1000);
        int actual = bankAccount.getBalance();

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testWithdrawTooHighAmount(){
        // Arrange
        BankAccount bankAccount = new BankAccount(1000);

        // Act
        Exception exception = assertThrows(Exception.class, () -> {
            bankAccount.withdraw(2000);
        });

        String expectedMessage = "Not enough money!";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);

        int expectedBalance = 1000;
        int actualBalance = bankAccount.getBalance();
        assertEquals(expectedBalance, actualBalance);
    }

}
