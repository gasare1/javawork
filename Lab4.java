/*-------------------------------------------------------------
// AUTHOR: Glen asare.
// FILENAME: Lab4.
// SPECIFICATION: This program uses loops to calculate sum of an integer from 1 to m,
factorial of a given number and also scan for the left most number while having an option to quit the program..
// FOR: CSE 110- Lab #4
// TIME SPENT: 4 hours.
//-----------------------------------------------------------*/

// Import Scanner class

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declare some variables you need
        int m;
        int sum = 0;
        int leftMost = 0;
        int givenNumber = 1;
        int userChoice = 0;


        // -->

        do {
            // Display the menu
            System.out.println("Please choose one option from the following menu; ");
            System.out.println("1) Calculate the sum of integer form 1 to m");
            System.out.println("2) Calculate the factorial of a given number");
            System.out.println("3) Display the leftmost digit of a given number");
            System.out.println("4) Quit");
            userChoice = input.nextInt();
            int i;


            // Ask the user for one option


            switch (userChoice) {
                case 1:
                    System.out.println("Enter a number");
                    m = input.nextInt();
                    for (i = 1; i <= m; i++) {
                        sum = sum+ i;
                    }
                    System.out.println("The sum of 1 to" + m + " is " + sum);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a number");
                    m = input.nextInt();
                    for (i = 1; i <= m; i++) {
                        givenNumber = givenNumber* i;
                    }
                    System.out.println("The factorial of " + m + " is " + givenNumber);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter a number ");
                    m = input.nextInt();
                    i=m;
                    while (i>0) {
                        leftMost = i % 10;
                        i=i/10;
                    }

                    System.out.println(" The left most digit " + m + " is " + leftMost);
                    System.out.println();
                    break;
                    // Define four cases for different options. Don't forget "break".
                    // -->
            }

        } while (userChoice != 4);
        System.out.println("Bye");
    }
}


            /**
             * Print the menu
             */
            //private static void displayMenu () {
                //System.out.println("Please choose one option from the following menu:");
                //System.out.println("1) Calculate the sum of integers from 1 to m");
                //System.out.println("2) Calculate the factorial of a given number");
                ///System.out.println("3) Display the leftmost digit of a given number");
                //System.out.println("4) Quit");
            //}