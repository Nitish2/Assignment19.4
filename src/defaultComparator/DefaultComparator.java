package defaultComparator;

/**
 * Creating a PriorityQueue<Integer> with default Comparator.
     Adding some elements in the PriorityQueue object.
       Removing the elements from PrioirityQueue from Head.
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class DefaultComparator {  //Creating class 
	public static void main(String[] args) { //Main class
		
        //Creating Priority queue object 
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		// Adding elements in the priority queue
		pQueue.add(3);
		pQueue.add(6);
		pQueue.add(9);
		pQueue.add(4);
		pQueue.add(1);

		Object[] arr = pQueue.toArray(); //Converting queue into array for sorting
		Arrays.sort(arr); // Sorting the array 
		System.out.println("Elements in Priority queue:");
		for (Object p : arr) { // Prints all sorted elements in the priority queue 
			System.out.println(p);

		}

		int i;  //Declaring variable i
         for (i = 0; pQueue.size() > i; i--) { //Loop will execute till the size of Priority Queue.

			Integer head = pQueue.peek(); // Points towards new TOP element in the queue

			head = pQueue.poll(); //Removes the TOP element from the queue
			System.out.println("\n"+ head + " is removed  ");
			head = pQueue.peek(); // Points towards new TOP element in the queue
			System.out.println("New head is: " + head);
			if (pQueue.isEmpty()) { // If Priority queue is Empty
				System.err.println("Priority queue is empty"); // Prints empty queue statement
															
				break;  // Breaks the loop 

			}

		}

	}

}
