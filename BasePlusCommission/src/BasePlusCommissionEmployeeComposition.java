/*
 * BasePlusCommissionEmployeeComposition.java
 */

public class BasePlusCommissionEmployeeComposition {
    
    private double baseSalary; // base salary per week
    // Demonstrate composition of (as opposed to inheritance from) a CommissionEmployee object
    private CommissionEmployee commissionEmployee;
    
    // six-argument constructor
    public BasePlusCommissionEmployeeComposition( String first, String last, 
            String ssn, double sales, double rate, double salary) {
    	
    	// TODO: implement this constructor
    	if (salary < 0.0) {
    		throw new IllegalArgumentException("Base salary must be >= 0.0");
    	}
    	
    	commissionEmployee = new CommissionEmployee(first, last, ssn, sales, rate);
    	baseSalary = salary;
    }
    
    // Implement accessors and mutators for all six attributes (stubs appear below)
    // As per the text (demonstrated in its BasePlusCommissionEmployee implementation), throw an IllegalArgumentException if the salary argument is negative
    public void setBaseSalary( double salary ) {
    	// TODO: implement this method
    	if (salary < 0.0)
    	{
    		throw new IllegalArgumentException("Base salary must be >= 0.0");
    	}
    	baseSalary = salary;
    }    

    public double getBaseSalary() {
    	// TODO: implement this method
    	return baseSalary;
    }

    public String getFirstName() {
    	// TODO: implement this method
    	return commissionEmployee.getFirstName();
    }

    public String getLastName() {
    	// TODO: implement this method
    	return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
    	// TODO: implement this method
    	return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
    	// TODO: implement this method
    	return commissionEmployee.getGrossSales();
    }

    public void setGrossSales(double sales) {
    	// TODO: implement this method
    	commissionEmployee.setGrossSales(sales);
    	
    }

    public double getCommissionRate() {
    	// TODO: implement this method
    	return commissionEmployee.getCommissionRate();
    }

    public void setCommissionRate(double rate) {
    	// TODO: implement this method
    	commissionEmployee.setCommissionRate(rate);
    }    
    
    public double earnings() {
    	// TODO: implement this method
    	return baseSalary + commissionEmployee.earnings();
    }
    
    @Override
    public String toString() {        
    	// TODO: implement this method
    	return String.format("base-salaried commission employee: %s %s%n" +
    						"social security number: %s%n" +
    						"gross sales: %.2f%n" +
    						"commission rate: %.2f%n" +
    						"base salary: %.2f",
    						getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getBaseSalary());
   
    }
}
