
import java.io.*;  // IMPORT STATEMENT

public class Group3BufferedReader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // IMPORT BUFFEREDREADER OBJECT	

        // Input employee details
        System.out.print("Employee Name: ");
        String name = reader.readLine();

        System.out.print("Employee position (Manager/Supervisor/Employee): ");
        String position = reader.readLine();

        // Determine rate per day based on position
        double ratePerDay ; // Initialize ratePerDay
        switch (position.toLowerCase()) {
        // Converts the input to lowercase so that
        // Manager, MANAGER, and manager are treated the same.

        case "manager":
            ratePerDay = 500;
            // Manager receives 500 pesos per day.
            break;
            // Stops the switch after finding the correct case.

        case "supervisor":
            ratePerDay = 400;
            // Supervisor receives 400 pesos per day.
            break;

        case "employee":
            ratePerDay = 300;
            // Employee receives 300 pesos per day.
            break;

        default:
            // Runs when the user enters an invalid position.

            System.out.println("=======================================================");
            System.out.println("               YOU ARE NOT EMPLOYEE                    ");
            System.out.println("=======================================================");

            return;
            // Stops the program if the position is invalid.
    }

        // Proceed to ask for number of working days only if the position is valid
        System.out.print("Number of Working Days: ");
        int daysWorked = Integer.parseInt(reader.readLine());

        // Compute gross income
        double gross = ratePerDay * daysWorked;

        // Compute bonus based on gross income
        double bonus;
        if (gross >= 8000) {
            bonus = 1000;
        } else if (gross >= 5000) {
            bonus = 750;
        } else if (gross >= 3000) {
            bonus = 500;
        } else {
            bonus = 0;
        }

        // Compute deductions
        double sss = gross * 0.10;  // SSS is 10% of gross
        double medicare = 100;      // Medicare is fixed at 100

        // Compute tax based on gross income
        double tax;
        if (gross >= 7000) {
            tax = gross * 0.15;
        } else if (gross >= 4000) {
            tax = gross * 0.10;
        } else if (gross >= 2000) {
            tax = gross * 0.05;
        } else {
            tax = 0;
        }

        // Calculate total deductions
        double totalDeductions = sss + medicare + tax;

        // Compute net income
        double netIncome = gross + bonus - totalDeductions;


        // Output the results
        System.out.println("\n===== Employee Salary Receipt =====");
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Number of Days Worked: " + daysWorked);
        System.out.println("Rate per Day: P" + ratePerDay);
        System.out.println("Gross Income: P" + gross);
        System.out.println("Bonus: P" + bonus);
        System.out.println("SSS Deduction: P" + sss);
        System.out.println("Medicare Deduction: P" + medicare);
        System.out.println("Tax Deduction: P" + tax);
        System.out.println("Total Deductions: P" + totalDeductions);
        System.out.println("\nYour Total Net Income is: P" + netIncome);
        System.out.println("===================================");
        System.out.println("THANK YOU !!!");
    }
}
