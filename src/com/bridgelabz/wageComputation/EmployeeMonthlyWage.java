package com.bridgelabz.wageComputation;

public class EmployeeMonthlyWage {
    int partTimeWorkingHours = 0;
    int fullTimeWorkingHours = 0;
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
                    fullTimeWorkingHours = fullTimeWorkingHours + 8;
                    fullTimeEMPWage = fullTimeWage(wage_per_hour, fullTimeWorkingHours);
                }
                case 1 -> {
                    working_hours = working_hours + 4;
                    partTimeWorkingHours = partTimeWorkingHours + 4;
                    partTimeEMPWage = partTimeWage(wage_per_hour, partTimeWorkingHours);
                }
                case 2 -> {
                }
            }
            working_days++;

        }
        System.out.println("Company "+ company);
        System.out.println(" part time employee working hours" + " " + partTimeWorkingHours);
        System.out.println(" full time employee working hours" + " " + fullTimeWorkingHours);
        System.out.println("Total employee  wage per month" + " " + (fullTimeEMPWage + partTimeEMPWage));

    }

}
