package com.tnsif.assignmentfive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter stage event name(Music Concert,Dance Show,Drama,Magic Show,Stand-up Comedy,Cultural Fest), customer name, and number of seats (comma separated):");
        String input = sc.nextLine();  // e.g., Magic show,Lunu,43
        String[] parts = input.split(",");
        TicketBooking ticket = new TicketBooking(parts[0], parts[1], Integer.parseInt(parts[2]));

        System.out.println("\nChoose payment method:");
        System.out.println("1. Cash");
        System.out.println("2. Wallet");
        System.out.println("3. Credit Card");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to pay in cash: ");
                int amount = sc.nextInt();
                ticket.makePayment(amount);
                break;

            case 2:
                System.out.print("Enter wallet amount: ");
                int walletAmount = sc.nextInt();
                System.out.print("Enter wallet number: ");
                String walletNumber = sc.next();
                ticket.makePayment(walletAmount, walletNumber);
                break;

            case 3:
                sc.nextLine(); // Consume leftover newline
                System.out.print("Enter card holder name: ");
                String holderName = sc.nextLine();
                System.out.print("Enter amount: ");
                int cardAmount = sc.nextInt();
                System.out.print("Enter card type: ");
                String cardType = sc.next();
                System.out.print("Enter CCV number: ");
                String ccv = sc.next();
                ticket.makePayment(holderName, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}