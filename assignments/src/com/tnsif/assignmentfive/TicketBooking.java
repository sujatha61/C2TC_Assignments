package com.tnsif.assignmentfive;

import java.text.DecimalFormat;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;

    // Default constructor
    public TicketBooking() {}

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() { return stageEvent; }
    public void setStageEvent(String stageEvent) { this.stageEvent = stageEvent; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }

    public int getNoOfSeats() { return noOfSeats; }
    public void setNoOfSeats(int noOfSeats) { this.noOfSeats = noOfSeats; }

    // Overloaded methods for different payment modes
    public void makePayment(int amount) {
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.println("Amount " + df.format((double) amount) + " paid in cash");
    }

    public void makePayment(int amount, String walletNumber) {
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.println("Amount " + df.format((double) amount) + 
                           " paid using wallet number " + walletNumber);
    }

    public void makePayment(String holderName, int amount, 
                            String creditCardType, String ccvNumber) {
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Stage event: " + stageEvent);
        System.out.println("Customer: " + customer);
        System.out.println("Number of seats: " + noOfSeats);
        System.out.println("Holder name: " + holderName);
        System.out.println("Amount " + df.format((double) amount) + 
                           " paid using " + creditCardType + 
                           " card CCV " + ccvNumber);
    }
}