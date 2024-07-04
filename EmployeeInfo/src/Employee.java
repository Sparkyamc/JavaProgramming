

/*
 * Employee.java
 */

/**
 *
 * @author Anne Chen
 */
public class Employee {
    
	// Name your member variables as follows: firstName, lastName and monthlySalary
	private String firstName;
	private String lastName;
	private double monthlySalary;
	private double yearlySalary;
    
	// Implement a three-parameter constructor that takes, in order: the first name, last name and monthly salary
	public Employee(String fName, String lName, double mSalary)
	{
		this.firstName = fName;
		this.lastName = lName;
		if(mSalary > 0.0)
		{
			this.monthlySalary = mSalary;
		}
	}

	// Your accessor methods should be named following the pattern getVariableName. e.g.: getFirstName
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	
	
	// Your mutator methods should be named following the pattern setVariableName. e.g.: setFirstName
	public void setFirstName(String fName) {
		firstName = fName;
	}
    
	public void setLastName(String lName) {
		lastName = lName;
	}
	
	public void setMonthlySalary(double mSalary) {
		if(mSalary > 0.0)
		{ 
			monthlySalary = mSalary;
		}
		else
		{
			System.out.println("Please enter a positive monthly salary!");
		}
	}
	
	public void showEmployeeInfo()
	{
		this.yearlySalary = 12*this.monthlySalary;
		System.out.println(firstName + " " + lastName + "Salary: "+ yearlySalary);
	}
}

