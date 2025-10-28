package com.tnsif.assignmentFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1 - AirIndia");
        System.out.println("2 - KingFisher");
        System.out.println("3 - Indigo");
        
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter hours of travel: ");
        int hours = sc.nextInt();

        System.out.print("Enter cost per hour: ");
        double costPerHour = sc.nextDouble();

        Airfare flight;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        flight.display();
        sc.close();
    }
}