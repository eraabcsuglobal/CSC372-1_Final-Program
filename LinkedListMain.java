import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class LinkedListMain {
	
	public static void main(String[] args) throws IOException {
	
		// create Linked List for vehicle objects
		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		
		Scanner scnr = new Scanner(System.in);
		
		String make;
		String model;
		double milesPerGallon;
		//number of vehicles user will enter data for
		int numberOfVehicles = 3;
		
		for (int i = 0; i < numberOfVehicles; i++) {
			try {
				System.out.print("Enter vehicle make: ");
				make = scnr.next();
				
				System.out.print("Enter vehicle model: ");
				model = scnr.next();
				
				System.out.print("Enter vehicle miles per gallon: ");
				// throw exception if the value for miles per gallon is not a double
				if (scnr.hasNextDouble()) {
					// also throw exception if user enters a negative number for mile per gallon
					milesPerGallon = scnr.nextDouble();
					if (milesPerGallon < 0) {
						throw new Exception("Please enter a positive value.");
					} 
				} 
				else {
					throw new Exception("Invalid input for miles per gallon");
				}
				
				
				// add input data to the Linked List
				vehicles.add(new Vehicle (make, model, milesPerGallon));
			}
			catch (Exception excpt) {
				System.out.println(excpt.getMessage());
				System.out.println("Cannot add vehicle to list.");
			}
		}
		
		// sort the vehicle list by miles per gallon
		SortData.sortByMPG(vehicles);
		
		// create .txt file of the sorted objects in the list
		FileOutputStream fileByteStream = null;
		PrintWriter outFS = null;
		
		fileByteStream = new FileOutputStream("Vehicles.txt");
		outFS = new PrintWriter(fileByteStream);
		
		for (int i = 0; i < vehicles.size(); i++) {
			outFS.print(vehicles.get(i).getMake() + " ");
			outFS.print(vehicles.get(i).getModel() + " ");
			outFS.print(vehicles.get(i).getMPG() + " ");

		}
		
		outFS.flush();
		fileByteStream.close();
			
	}
}
