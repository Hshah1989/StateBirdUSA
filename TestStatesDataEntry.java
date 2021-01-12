

/* TestStatesDataEntry.java
 * Author: Hiren Shah
 * Date: 10/4/2020
 * Purpose: to run the program and ask user input and display output
 */

import java.util.Scanner;

public class TestStatesDataEntry {

	public static void main(String[] args) {
		Scanner scannerIn = new Scanner(System.in); // create scanner object to store user value
		StatesDataEntry stateInfo = new StatesDataEntry(); // create an instance of StatesDataEntry class to store state info
															

		do {
			System.out.println("Enter a state or 'None' to exit: "); // ask for user input
			String stateName = scannerIn.next(); // store user input in stateName
			if (stateName.trim().equalsIgnoreCase("None")) { // as long as this is true then break
				break;
			}
			// calling setter method
			stateInfo.setName(stateName); // call the setter method setName
			System.out.println("Bird: " + stateInfo.getBird() + "\nFlower: " + stateInfo.getFlower()); // call the
																										// getters
		} while (true);

		// print the summary
		System.out.println("**** THANK YOU ****");
		System.out.println("A summary report for each State, Bird, and Flower is: ");
		System.out.println(stateInfo.getHistory());
		System.out.println("Please visit our site again!");
	}

}
