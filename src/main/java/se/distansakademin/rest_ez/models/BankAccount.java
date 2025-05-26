package se.distansakademin.rest_ez.models;

public class BankAccount {

    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws Exception {

        if(amount > balance){
            throw new Exception("Not enough money!");
        }

        balance -= amount;
    }
}
