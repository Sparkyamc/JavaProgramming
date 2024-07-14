/*
 * CommissionCalculator.java
 */

/**
 *
 * @author Anne Chen
 */

import java.util.Scanner;

public class CommissionCalculator {
    
    public static void main(String args[]) {
    	
    	
        // Initialize a Scanner to read input from the command line
    	Scanner scanner = new Scanner(System.in);
    	
    	
    	
    	/* Note that we'll be doing this at least once and most likely multiple times...
    	 * Prompt the user with a menu of the four items and their values (this information is included in the problem statement)
    	 */
    	System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89"); 
        
        //Initialize variables
        double[] itemValues = {239.99, 129.75, 99.95, 350.89};
        double totalSales = 0.0;
        
        
    	/* Display the user's current compensation
    	 * 
    	 * Prompt and take input from the user (you may assume that they will only enter int values)
    	 * They'll enter an item number (1 - 4) to record its sale or 0 to exit
    	 * 
    	 * NOTE: THE USER DOES NOT ENTER PRICES DIRECTLY... THEY ENTER ITEM NUMBERS TO INDICATE WHAT WAS SOLD
    	 * NOTE: THE USER MAY ENTER THE SAME ITEM NUMBRER MULTIPLE TIMES
    	 * 
    	 * If the user provides invalid input (a value other than 0 - 4) display "ERROR: Invalid input!" and prompt them again
    	 */
    	
    	/* After the user enters 0, display the salesperson's earnings in the format "Total earnings: $NNN.NN" and exit
    	 * For example, if the salesperson sold two item 3s this week the final output would be "Total earnings: $217.99"
    	 */
        
        //Display current compensation
        double currentCompensation = 200.0;
        System.out.printf("Current compensation: $%.2f%n", currentCompensation);
        
        
        //Prompt and take user input
        while (true) {
        	

        	System.out.println("Please select an item from the list above (or enter 0 to exit):");
        	int itemNumber = scanner.nextInt();
        	
        	//Validate input
        	if (itemNumber < 0 || itemNumber > 4) {
        		System.out.println("ERROR: Invalid input!");
        		displayMenuAndCompensation(currentCompensation);
        		continue;
        	}
        	
        	//Exit loop if user enters 0
        	if (itemNumber == 0) {
        		break;
        	}
        	
        	//Add item value to total sales based on item number
        	totalSales += itemValues[itemNumber - 1];
        	
        	//Calculate updated compensation
        	currentCompensation = 200.0 + totalSales*0.09;
        	
        	displayMenuAndCompensation(currentCompensation);

        	
        }
        
        //Calculate earnings
        double baseSalary = 200.0;
        double commissionRate = 0.09;
        double commission = totalSales*commissionRate;
        double earnings = baseSalary + commission;
        
        //Display total earnings
        System.out.printf("Total earnings: $%.2f%n", earnings);
        
        //Close the scanner
        scanner.close();
    }
    
    private static void displayMenuAndCompensation(double compensation) {
    	System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89");
        System.out.printf("Current compensation: $%.2f%n", compensation);
    	
    }
}
