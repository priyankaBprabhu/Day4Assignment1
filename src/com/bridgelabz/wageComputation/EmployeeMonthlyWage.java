package com.bridgelabz.wageComputation;

public class EmployeeMonthlyWage {
    private static int partTimeWorkingHours ;
    private static int fullTimeWorkingHours ;
    private static int working_days ;
    private static int partTimeEMPWage;
    private static int fullTimeEMPWage ;
    public static int companyWage ;

    static int  wage(int wage_per_hour, int hour_per_day) {

        return (wage_per_hour * hour_per_day );
    }

       public  EmployeeMonthlyWage(String company, int total_working_hrs, int total_working_days, int wage_per_hour){
        int working_hours = 0;

        while((working_hours <=total_working_hrs)&&(working_days <=total_working_days))

        {
            int employee = (int) ((Math.random() * 10) % 3);

            switch (employee) {
                case 0 -> {
                    working_hours = working_hours + 8;
                    fullTimeWorkingHours = fullTimeWorkingHours + 8;
                    fullTimeEMPWage = wage(wage_per_hour, fullTimeWorkingHours);
                }
                case 1 -> {
                    working_hours = working_hours + 4;
                    partTimeWorkingHours = partTimeWorkingHours + 4;
                    partTimeEMPWage = wage(wage_per_hour, partTimeWorkingHours);
                }
                case 2 -> {
                }
            }
             companyWage = (fullTimeEMPWage + partTimeEMPWage);
             working_days++;

        }

        System.out.println(" part time employee working hours" + " " + partTimeWorkingHours);
        System.out.println(" full time employee working hours" + " " + fullTimeWorkingHours);
        System.out.println("Employee Monthly Wage of the " + company + " company is  "+ companyWage);

    }

}
