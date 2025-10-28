package com.tnsif.assignmentfour;

public class Indigo implements Airfare {
    private Integer hours;
    private Double costPerHour;

    public Indigo() {}

    public Indigo(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public Double calculateAmount() {
        return (hours * costPerHour) * 8;
    }

    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}