package com.bridgelabz.wageComputation;

import java.util.Scanner;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the  companyChoice " + "\nSelect 1 for HCL " + "\nSelect 2 for HCL " + "\nSelect 3 for HCL ");
        int companyChoice = scan.nextInt();
        switch (companyChoice) {
            case 1 -> new EmployeeMonthlyWage("HCL", 100, 20, 25);
            case 2 -> new EmployeeMonthlyWage("Infosys", 150, 30, 28);
            case 3 -> new EmployeeMonthlyWage("IBM", 160, 30, 30);
            default -> System.out.println("select the proper company number");
        }

    }
}
