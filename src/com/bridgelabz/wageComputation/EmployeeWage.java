package com.bridgelabz.wageComputation;

public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeMonthlyWage hclCompany = new EmployeeMonthlyWage("Hcl", 120, 15, 25);
        EmployeeMonthlyWage blCompany = new EmployeeMonthlyWage("BL", 100, 20, 25);
        EmployeeMonthlyWage infosysCompany = new EmployeeMonthlyWage("Infosys", 140, 30, 28);

        hclCompany.display();
        System.out.println(hclCompany.wageComputation());
        blCompany.display();
        System.out.println(blCompany.wageComputation());
        infosysCompany.display();
        System.out.println(infosysCompany.wageComputation());

    }


}



