package com.tnsif.assignmentone.commision;

import java.util.Scanner;

class Commission {
    String name, address, phone;
    double sales_amount;
    void acceptDetails() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Name: ");
			name = sc.nextLine();

			System.out.print("Enter Address: ");
			address = sc.nextLine();

			System.out.print("Enter Phone: ");
			phone = sc.nextLine();

			System.out.print("Enter Sales Amount: ");
			sales_amount = sc.nextDouble();
		}
    }
    void calculateCommission() {
        double commission;

        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Employee Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Address    : " + address);
        System.out.println("Phone      : " + phone);
        System.out.println("Sales Amt  : " + sales_amount);
        System.out.println("Commission : " + commission);
    }
}