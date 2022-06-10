package com.bridgelabz.wageComputation;

import java.util.ArrayList;

public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeMonthlyWage employeeMonthlyWage = new EmployeeMonthlyWage("Hcl", 120, 15, 25);
        EmployeeMonthlyWage employeeMonthlyWage1 = new EmployeeMonthlyWage("BL", 100, 20, 25);
        EmployeeMonthlyWage employeeMonthlyWage2 = new EmployeeMonthlyWage("Infosys", 140, 30, 28);

        ArrayList<EmployeeMonthlyWage> employeeWageArrayList = new ArrayList<>();
        employeeWageArrayList.add(employeeMonthlyWage);
        employeeWageArrayList.add(employeeMonthlyWage1);
        employeeWageArrayList.add(employeeMonthlyWage2);
        for(EmployeeMonthlyWage wage:employeeWageArrayList){
            wage.display();
            System.out.println(wage.wageComputation());
        }
    }
}





