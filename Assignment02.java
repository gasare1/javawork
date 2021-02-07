// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        // declare and instantiate the Scanner
        Scanner myObj = new Scanner(System.in);

        // declare and initialize the variables
        double lengthofRoad;
        int numberofLanes;
        int deptofAsphalt;
        int daystoComplete;

        // prompt for and collect the inputs
        System.out.println("Enter length of road project(Miles): ");
        lengthofRoad = Double.parseDouble(myObj.nextLine());
        System.out.println("Enter number of lanes: ");
        numberofLanes = myObj.nextInt();
        System.out.println("Enter the depth of asphalt(inches): ");
        deptofAsphalt = myObj.nextInt();
        System.out.println("Enter the days to complete project: ");
        daystoComplete = myObj.nextInt();
        // compute the required values
        //Truckload of asphault needed
        double truckLoad = (numberofLanes*lengthofRoad*5280*deptofAsphalt*160)/10000;
        //Number of stoplight calculation
        double stopLight = Math.floor( lengthofRoad * 1) * (numberofLanes + 2);
        //Number of conduit pipe calculation
        double conduitPipe = (5280 *lengthofRoad)/20;
        //number of crewmember needed
        double crewmembersNeeded =(50*lengthofRoad*numberofLanes)/daystoComplete;
        //Calculate cost of asphault, stoplight, conduit pipe and labor
        double costofAsphalt = (5*Math.ceil(truckLoad)*230);
        double costofStoplight =(Math.floor(stopLight*27000));
        double costofconduitPipe = (conduitPipe *600);
        double costofLabor = (8*28*daystoComplete*Math.ceil(crewmembersNeeded));
        double totalCost = (costofAsphalt+costofStoplight+costofconduitPipe+costofLabor);

            // display the required outputs
        System.out.println("Truckloads of Asphalt: "+Math.round(truckLoad));
        System.out.println("Stoplight: " + Math.floor(stopLight));
        System.out.println("Conduit Pipes: "+conduitPipe);
        System.out.println(("Crew members Needed: "+Math.ceil(crewmembersNeeded)));
        System.out.println("Cost of Asphault: "+costofAsphalt);
        System.out.println("Cost of Stoplights: "+costofStoplight);
        System.out.println("Cost of COnduit pipes: "+costofconduitPipe);
        System.out.println("Cost of Labor: "+costofLabor);
        System.out.println("Total Cost: "+totalCost);
        }


    }

