package com.tnsif.assignmentthree;

public abstract class Account extends Bank {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        super(); 
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}