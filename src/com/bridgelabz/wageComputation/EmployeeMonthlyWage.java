package com.bridgelabz.wageComputation;

public class EmployeeMonthlyWage {
    int pWorking_hours = 0;
    int fWorking_hours = 0;
    int working_days = 0;
    int partTimeEMPWage = 0;
    int fullTimeEMPWage = 0;

    int fullTimeWage(int wage_per_hour, int hour_per_day) {

        return (wage_per_hour * hour_per_day );
    }
    int partTimeWage(int wage_per_hour, int hour_per_day) {

        return (wage_per_hour * hour_per_day );
    }
    public EmployeeMonthlyWage( String company, int total_working_hrs, int total_working_days, int wage_per_hour) {
        int working_hours = 0;

        while((working_hours <=total_working_hrs)&&(working_days <=total_working_days))

        {
            int employee = (int) ((Math.random() * 10) % 3);

            switch (employee) {
                case 0 -> {
                    working_hours = working_hours + 8;
                    fWorking_hours = fWorking_hours + 8;
                    fullTimeEMPWage = fullTimeWage(wage_per_hour, fWorking_hours);
                }
                case 1 -> {
                    working_hours = working_hours + 4;
                    pWorking_hours = pWorking_hours + 4;
                    partTimeEMPWage = partTimeWage(wage_per_hour, pWorking_hours);
                }
                case 2 -> {
                }
            }
            working_days++;

        }
        System.out.println("Company "+ company);
        System.out.println(" part time employee working hours" + " " + pWorking_hours);
        System.out.println(" full time employee working hours" + " " + fWorking_hours);
        System.out.println("Total employee  wage per month" + " " + (fullTimeEMPWage + partTimeEMPWage));

    }

}
