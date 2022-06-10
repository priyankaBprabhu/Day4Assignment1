package com.bridgelabz.wageComputation;

public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeMonthlyWage[] employeeMonthlyWage = {new EmployeeMonthlyWage("Hcl", 120, 15, 25),
                new EmployeeMonthlyWage("BL", 100, 20, 25),
                new EmployeeMonthlyWage("Infosys", 140, 30, 28)};

        for(int i = 0; i < employeeMonthlyWage.length; i++) {
            employeeMonthlyWage[i].display();
            System.out.println(employeeMonthlyWage[i].wageComputation());
        }
    }


}



