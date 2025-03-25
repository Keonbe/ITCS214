import java.util.Scanner;
/*
You are tasked with developing a simple *Employee Salary Calculation System* that collects and processes employee information.
The system will ask for the employee’s name, position (Manager, Developer, or Analyst),
the number of hours worked, and their hourly rate.
Based on the employee's position, the program will assign a specific hourly rate:
$50 per hour for a Manager,
$40 per hour for a Developer,
and $35 per hour for an Analyst.

The system will then compute the employee’s gross salary by multiplying the number of hours worked by the hourly
rate.
Next, the program will calculate the tax deduction based on the gross salary.
If the gross salary exceeds $50,000, the tax deduction will be 30% of the gross salary.
If the salary falls between $30,000 and $50,000, the deduction will be 20%.
If the salary is less than $30,000, a 10% tax deduction will be applied.
The system will then calculate the final take-home salary by subtracting the tax deduction
from the gross salary.
Additionally, the program will validate that the number of hours worked is a positive integer.
After displaying the gross salary, tax deduction, and take-home salary, the system will prompt the user to indicate whether they
would like to enter another employee’s information, repeating the process if
needed.
The solution will use control structures such as if-else, switch, for, while, and
do-while loops without utilizing arrays.
 */
public class DSA_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Employee Name:"); //Name
            String name = scanner.nextLine();

            int positionChoice; //Global variable
            String position = "";
            int hourlyRate = 0;

            while (true) {
                System.out.print("Enter Position [Manager (1), Developer (2), Analyst (3)]:");
                positionChoice = scanner.nextInt();
                scanner.nextLine();

                if (positionChoice == 1) {
                    position = "Manager";
                    hourlyRate = 50;
                    break;
                } else if (positionChoice == 2) {
                    position = "Developer";
                    hourlyRate = 40;
                    break;
                } else if (positionChoice == 3) {
                    position = "Analyst";
                    hourlyRate = 35;
                    break;
                } else {
                    System.out.print("Invalid position. Please enter 1, 2, or 3.");
                }
            }

            int numHoursWorked;
            while (true) {
                System.out.print("Enter Number of Hours Worked:");
                numHoursWorked = scanner.nextInt();
                if (numHoursWorked > 0) {
                    break;
                } else {
                    System.out.print("Invalid input. Please enter a positive number.");
                }
            }

            int grossSalary = numHoursWorked * hourlyRate;
            double taxRate;

            if (grossSalary > 50000) {
                taxRate = 0.30;
            } else if (grossSalary >= 30000) {
                taxRate = 0.20;
            } else {
                taxRate = 0.10;
            }

            double taxDeduction = grossSalary * taxRate;
            double takeHomeSalary = grossSalary - taxDeduction;

            System.out.println("\nEmployee Salary Details:");
            System.out.println("Name: " + name);
            System.out.println("Position: " + position);
            System.out.println("Gross Salary: $" + grossSalary);
            System.out.println("Tax Deduction: $" + taxDeduction);
            System.out.println("Take-Home Salary: $" + takeHomeSalary);

            System.out.print("\nDo you want to enter another employee's details? (yes/no):");
            scanner.nextLine(); // Consume newline
            String response = scanner.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}
