package com.BridgelLabs;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        int employee = (int) ((Math.random() * 10) % 2);
        System.out.println(employee);
        if (employee == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
