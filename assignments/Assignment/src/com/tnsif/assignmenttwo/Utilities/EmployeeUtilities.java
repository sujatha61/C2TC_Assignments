
package com.tnsif.assignmenttwo.Utilities;

import com.tnsif.assignmenttwo.Employee.*;

public class EmployeeUtilities {

    public void giveBonus(Employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.setSalary(newSalary);
        System.out.println("Bonus of " + amount + " added to " + emp.getName() + ". New salary: " + newSalary);
    }

    protected void showEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
}
