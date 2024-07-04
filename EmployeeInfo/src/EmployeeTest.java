




/*
 * EmployeeTest.java
 */

/**
 *
 * @author Anne Chen


*/

public class EmployeeTest {
    
    public static void main(String args[]){
        // Create two Employee objects
    	//	 Employee #1: Benjamin Bernanke has a monthly salary of 1234.56
    	
    	Employee employee1 = new Employee("Benjamin", "Bernanke", 1234.56);
    	
    	
    	
    	//   Employee #2: Paul Volcker has a monthly salary of 2345.67
    	
    	
    	Employee employee2 = new Employee("Paul", "Volcker", 2345.67);
   
    	
    	
    	
    	
        
        // Display the employees' info (including yearly salary)
    	
        
        employee1.showEmployeeInfo();
        
        employee2.showEmployeeInfo();
        
    	
    	
    	/* Note that you'll receive slightly different results for the salary displaying via printf and print/println.
    	 * This is due to the implicit precision and the rounding that is applied.
    	 * I used println, but you're welcome to use printf if you like: I account for slight variations in the numeric values displayed for the salaries.
    	 */
       
        System.out.println("Giving raises...");
        
        
        // Give each employee a 10% raises.
        
        
        employee1.setMonthlySalary(employee1.getMonthlySalary()*1.1);
        
        employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
        
        
    	// Be sure to actually apply the raise to the Employee objects: don't just calculate and display a 10% greater salary within this test code 

        // Display the employees' info (including yearly salary)
        
        employee1.showEmployeeInfo();
        
        employee2.showEmployeeInfo();
        
        
        
        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        
        employee1.setMonthlySalary(-500);
        
       
        // Display Bernanke's info (including yearly salary)
        employee1.showEmployeeInfo();
    }
    
}
