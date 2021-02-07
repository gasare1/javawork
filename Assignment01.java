//CSE 110 : <15817> /
// <Tuesday's 4:30>
// Assignment : <assignment 1>
// Author : <Glen Asare> & <1209416374>
// Description : <This program receives input from user then uses maths to calculate the results>
import java.util.Scanner;
class Assignment01 {
    public static void main(String[] args) {
        // declare and instantiate the Scanner
        Scanner sc = new Scanner(System.in);
        // declare and initialize the variables
        int pizza ;
        int pizzasPurchased;
        int numberofAdults;
        int numberofChildren;
        // / prompt for and collect the inputs
        System.out.println("Enter number of slices per pizza: ");
        pizza = sc.nextInt();
        System.out.println("Enter number of pizza purchased: ");
        pizzasPurchased = sc.nextInt();
        System.out.println("Enter number of number of adults: ");
        numberofAdults = sc.nextInt();
        System.out.println("Enter number of number of children: ");
        numberofChildren = sc.nextInt();
        // compute the required values
        int availablePizza = pizza*pizzasPurchased;
        int adultPizza = (numberofAdults %- availablePizza)*3;
        int availableforChildren =availablePizza - adultPizza;
        int childrenPizza =availableforChildren/numberofChildren;
        int pizzLeft= availableforChildren-(childrenPizza*numberofChildren);


        // display the required outputs
        System.out.println("Total number of slices of pizza: "+availablePizza);
        System.out.println("Total number of slices given to adults: "+adultPizza);
        System.out.println("Total number of slices available for children: "+availableforChildren);
        System.out.println("Number of slices each child will get: "+childrenPizza);
        System.out.println("Number of slices left over: "+pizzLeft);
         }
        }