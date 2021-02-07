/*---// AUTHOR: <Glen Asare>
// FILENAME: Lab2.java
// SPECIFICATION: <Scanner that prints out user input (first and last names)
and also calculate the amount of characters the name has. Also the next program uses two solutions to solve if
 the defined variable equals to each other using different functions >
// FOR: CSE 110 -Lab #2
// TIME SPENT: <3 hours>
//-----------------------------------------------------------*/
import java.util.Locale;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        // declare variables of different types:
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength;
        String upperCase;
        Scanner scan = new Scanner(System.in);

        // Use Scanner to ask the user for first name
        System.out.print("Please enter first name: ");
        firstName = scan.nextLine();
        // Use Scanner to ask the user for last name
        System.out.print("Please enter last name: ");
        lastName = scan.nextLine();

        // Add firstName to lastName variables using "+" sign, don't forget the space.
        // store the result in the fullName variable
        fullName = (firstName) + " " + (lastName);


        // Convert fullName variable to upper case
        upperCase = fullName.toUpperCase(Locale.ROOT);
        // Find the length of fullName and store it
        nameLength = fullName.length();
        // Print fullName, it should be in upper case
        System.out.println("Full name (in capitals): " + upperCase);
        // Print nameLength, this should be number of characters
        System.out.println("Length of full name: " + nameLength);

        // Define two String variables, title1 and title2 using String constructor to initialize them

            String title1 = new String("CSE110");
            String title2 = "CSE110";

            // Compare the two strings and print which one of the two ways works
            if (title1 == title2) {
                System.out.println("String comparison using == sign works");
            } else {
                System.out.println("String comparison using == sign does not works");
            }
            if (title1.equals(title2)) {
                System.out.println("String comparison using ==  sign works");
            } else {
                System.out.println("String comparison using == sign does not works");
            }
        }
    }

