package com.tnsif.assignmentthree;

public class SavingsAccount extends Account {
    private double interestRate = 0.03;

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited with interest: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}