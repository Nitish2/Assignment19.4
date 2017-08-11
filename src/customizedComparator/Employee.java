package customizedComparator;

/**
 * Creating a PriorityQueue<Employee> class with Customized Comparator. 
     Adding the objects of Employee class in the PriorityQueue object.
       Using the Comparator to sort the employees as per their salaries.
 */
public class Employee implements Comparable<Employee> { // Creating 
	String eName; // Declaring variables
	float eSal;

	public Employee(String eName, float eSal) { // Creates method
		super();
		this.eName = eName;

		this.eSal = eSal;
	}

	public String getName() { // Get name of the employee
		return eName; // Return name
	}

	public void setName(String eName) {
		this.eName = eName;
	}

	public float getSalary() { // Get name of the employee
		return eSal; // Return salary
	}

	// salary the salary to set

	public void setSalary(float eSal) {
		this.eSal = eSal;
	}

	// toString() method to return values of the object
	public String toString() {
		return "Employee Name: " + eName + "\nMonthly Salary: " + eSal + " \n";
	}

	@Override

	// Comparing on the basis of salary
	public int compareTo(Employee e) {
		if (eSal > e.eSal) {
			return 1;
		} else {
			return -1;
		}
	}

}
