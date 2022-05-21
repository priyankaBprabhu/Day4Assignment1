package com.BridgelLabs;

public class EmployeeWage {
    public static void main(String[] args) {
        DailyEmployeeWage wage = new DailyEmployeeWage();
        System.out.println("Welcome to Employee Wage Computation Program ");
        int employee = (int) ((Math.random() * 10) % 2);
        System.out.println(employee);
        if (employee == 1) {
            System.out.println("Employee is present");
            int full_time_emp_wage = wage.dailyWage(20, 8);
            System.out.println("full time employee daily wage" + " " + full_time_emp_wage);
            int part_time_emp_wage = wage.dailyWage(20, 4);
            System.out.println("part time employee daily wage" + " " + part_time_emp_wage);
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
