/*
 * RockNRollah.java
 */

import java.util.Random;

/**
 *
 * @author Anne Chen
 */
public class RockNRollah {
       
    public static void main(String[] args) {
    	// Create a Random object
    	Random rand = new Random();
    	
    	// Initialize a couple of variables to hold the values of the two dice
    	int rolls = 36000000;
    	int die1;
    	int die2;
    	
    	// Initialize the array that will hold the results
    	int[] frequencies = new int[13];
    	
    	
    	/* Hypothetical questions: (no, I don't want answers)
    	 *   How many different sum values do we need to account for?
    	 *   How big does the array need to be?
    	 *   Why might you make it (slightly) larger? (Note: my answer does not use an unnecessarily large array, and I'm not encouraging you to; just giving you something to think about) 
    	 */
    	// Roll the dice (a lot) and sum and tally the results
    	for (int i = 0; i < rolls; i++) {
    		die1 = rand.nextInt(6) + 1;
    		die2 = rand.nextInt(6) + 1;
    		int sum = die1 + die2;
    		frequencies[sum]++;
    	}
    	
        // Display the frequencies
        System.out.println("Results after " + rolls + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");
        
        // Loop, displaying the rows for the body of the table, each on its own line.
        
        //   The required format for each row is to display the sum, followed by a tab, followed by the number of times that sum came up. Do not include any additional formatting
        
        for (int value = 2; value <= 12; value++) {
        	System.out.println(value + "\t" + frequencies[value]);
        }
    }
    
}
