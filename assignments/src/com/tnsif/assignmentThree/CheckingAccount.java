package com.tnsif.assignmentThree;

public class CheckingAccount extends Account {
    private double overdraftLimit = 2000;

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    public double getBalance() {
        return balance;
    }
}