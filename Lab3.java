/*-------------------------------------------------------------
// AUTHOR: Glen Asare.
// FILENAME: Lab3.java
// SPECIFICATION: This program takes input from user then calculate the total grade then decide if they passed or not.
// FOR: CSE 110- Lab #3
// TIME SPENT: 5 hours.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        double homework = 0;
        double  midterm = 0;
        double finalexamGrades = 0;
        // Declare a loop control variable i


        //while (homework < 0 || homework > 200) {

        // Design if-else control flow:
        //
        // if i is 0, asks for the homework grade
        // if i is 1, asks for the midterm exam grade
        // if i is 2, asks for the final exam grade
        //
        // You have to let the user re-try if any of the inputs is invalid.
        // - homework grade is in [0, 100]
        // - midterm grade is in [0, 100]
        // - final exam grade is in [0, 200]
        //
        // The first if-else statement is attached for your reference. You have to
        // finish the last two statments by yourself.
        // -->
        int i = 0;
        if (i == 0) {
            System.out.println("Enter you Homework grade: ");
            homework = scanner.nextDouble();
            i++;
            // Do input validation
            // -->
            //if (* the HW grade is not valid */) {
            // Show the error message
            // -->
        } else if (homework > 0) {
            System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100]");

            // Update the loop variable
            // -->
        }
        while (homework < 0 || homework > 100) {
            System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100]");
            System.out.println("Enter you Homework grade: ");
            homework = scanner.nextDouble();
            i++;
            if (i==3) {
                System.out.println("[ERR] You have retried 3 times. Please restart your program.");
                break;
            }

        }
        if (i == 1) {
            System.out.println("Enter you Midterm grade: ");
            midterm = scanner.nextDouble();
            i++;
            // Do input validation
            // -->
            //if (* the HW grade is not valid */) {
            // Show the error message
            // -->
        } else if (midterm > 0) {
            System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100]");

            // Update the loop variable
            // -->
        }
        while (midterm < 0 || midterm > 100) {
            System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100]");
            System.out.println("Enter you midterm grade: ");
            midterm = scanner.nextDouble();
            i++;
            if (i==4) {
                System.out.println("[ERR] You have retried 3 times. Please restart your program.");
                break;
            }
        }
        if (i == 2) {
            System.out.println("Enter you final exam grade: ");
            finalexamGrades = scanner.nextDouble();
            i++;
            // Do input validation
            // -->
            //if (* the HW grade is not valid */) {
            // Show the error message
            // -->
        } else if (finalexamGrades > 0) {
            System.out.println("[ERR] Invalid input. A final exam grade grade should be in [0, 200]");


            // Update the loop variable
            // -->
        }
        while (finalexamGrades < 0 || finalexamGrades > 200) {
            System.out.println("[ERR] Invalid input. A final exam grade should be in [0, 200]");
            System.out.println("Enter you Final exam grade: ");
            finalexamGrades = scanner.nextDouble();
            i++;
            if (i==5) {
                System.out.println("[ERR] You have retried 3 times. Please restart your program.");
                break;
            }
        }

        // The other two if-else statments go her

        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total = ((finalexamGrades / 200) * 50)+ (midterm * 0.25) + (homework * 0.25) ;
        System.out.println("Student's Weighted Total is: " + weighted_total);
        // Show the weighted total and tell the user s/he passed or not
        // -->
        if (weighted_total>=50) {
        System.out.println("the student PASSED the class.");
        } else {
            System.out.println("the student failed the class.");
    }

       scanner.close();

}  // End of main
// End of class
// }

}


