package customizedComparator;

import java.util.Comparator;

public class SalComp implements Comparator<Employee> { // Creates a class and implements through Comparator interface 

	@Override
	public int compare(Employee e1, Employee e2) { //Creates a Method and do the comparison based on salary
		
		if (e1.getSalary() < e2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
		
	}

}
