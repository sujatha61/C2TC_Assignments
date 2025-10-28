package com.tnsif.assignmentone;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student();

        // Create Commission object
        Commission c = new Commission();

        // Accept details and calculate commission
        c.acceptDetails();
        c.calculateCommission();

	}

}