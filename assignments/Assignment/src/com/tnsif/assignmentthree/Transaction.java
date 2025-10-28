package com.tnsif.assignmentthree;

public class Transaction {
    private final double transactionFee = 50.0;

    public final void performTransaction(Account account, double amount, String type) {
        System.out.println("Transaction initiated...");

        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount + transactionFee);
        } else {
            System.out.println("Invalid transaction type!");
            return;
        }

        System.out.println("Transaction Fee: " + transactionFee);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}