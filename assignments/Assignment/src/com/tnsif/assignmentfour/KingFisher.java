package com.tnsif.assignmentfour;

public class KingFisher implements Airfare {
    private Integer hours;
    private Double costPerHour;

    public KingFisher() {}

    public KingFisher(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public Double calculateAmount() {
        return (hours * costPerHour) * 4;
    }

    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}