package customizedComparator;

import java.util.PriorityQueue;

public class EmployeePriorityQueue {

	public static void main(String[] args) {
		// Creates Priority queue object 
		PriorityQueue<Employee> empPQ = new PriorityQueue<Employee>(new SalComp());
		
		//Adding elements in the priority queue
		empPQ.add(new Employee("Harshit kumar", 60988));
		empPQ.add(new Employee("Ram sharma", 40500));
		empPQ.add(new Employee("Zeenat khan", 260000));
		empPQ.add(new Employee("Nitish Negi", 82400));
		empPQ.add(new Employee("Arvind verma", 20000));

		while (empPQ.size() != 0) {
			System.out.println(empPQ.remove());
		}
	}

}
