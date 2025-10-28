
package com.tnsif.assignmentthree;



public class BankingMain {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Pavithra", 5000);
        CheckingAccount c1 = new CheckingAccount("Ganesan", 3000);

        Transaction t = new Transaction();

        System.out.println("\n--- Savings Account ---");
        t.performTransaction(s1, 2000, "deposit");
        t.performTransaction(s1, 1000, "withdraw");

        System.out.println("\n--- Checking Account ---");
        t.performTransaction(c1, 500, "deposit");
        t.performTransaction(c1, 4000, "withdraw");

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}
