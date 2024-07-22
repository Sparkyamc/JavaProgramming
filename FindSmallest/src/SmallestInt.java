/*
 * SmallestInt.java
 */

/**
 *
 * @author Anne Chen
 */

import java.util.Scanner;

public class SmallestInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        // Initialize a Scanner to read input from the command line
        // You may assume that only int values will be supplied as input for this assignment
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	/* Prompt the user and validate their input to ensure they've entered a positive (greater than zero) integer. Discard/ignore any other data.
    	 * Note that we'll be doing this at least once and most likely multiple times...
    	 */
    	
    	int count = 0;
    	
    	while (count <= 0) {
    		
    		System.out.print("How many integers shall we compare? (Enter a positive integer): ");
    		
    		if (scanner.hasNextInt()) {
    			
    			count = scanner.nextInt();
    			
    			if (count <= 0) {
    				
            		// Display the following text in the event of an invalid input
            		System.out.println("Invalid input!");

    			}
    		} else {
    			
        		// Display the following text in the event of an invalid input
        		System.out.println("Invalid input!");

        		scanner.next(); // consume the invalid input
    		}
    		
    		
    	}
    	
    	
    	int smallest = Integer.MAX_VALUE;
        	
        /* Read in the candidates for smallest integer
         * We know in advance how many times we need to iterate by the time we get here... why not use a for loop?
         */
        for(int i = 1; i <= count; i++) {    // Fill in the blanks! Seriously, fill them in! As currently written this will loop forever
        	
        		// Prompt as follows
            	System.out.print("Enter value " + i + ": ");
            	
            	if (scanner.hasNextInt()) {
            		int num = scanner.nextInt();
            		
            		if (num < smallest) {
            			smallest = num;
            		}
            	} else {
            		// Display the following text in the event of an invalid input
            		System.out.println("Invalid input!");

            		scanner.next(); // consume the invalid input
            		
            		i--; // retry for the same i
            		
            	}

        }
        
        /* At this point we know the smallest int entered... display it already!
         * Note that I used a local variable named "smallest" to keep track of the smallest int. If you name yours anything else you'll need to update the line below.
         * Note also that I didn't indicate where you should declare smallest... that's up to you/part of the assignment.
         */
        System.out.println("The smallest number entered was: " + smallest);
        
        scanner.close();
    }
    
}
