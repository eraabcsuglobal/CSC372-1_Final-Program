import java.util.LinkedList;

public class SortData {
	
	// sort vehicles by miles per gallon
	public static void sortByMPG(LinkedList<Vehicle> vehicles) {
		int i;
		int j;
		int indexOfSmallest; // renamed this to further clarify this is the index of the current smallest value in the list
		Vehicle temp;
		
		for (i = 0; i < vehicles.size() - 1; i++) {
			
			indexOfSmallest = i;
			
			for (j = i + 1; j < vehicles.size(); j++) {
				
				if (vehicles.get(j).getMPG() < vehicles.get(indexOfSmallest).getMPG()) {
					indexOfSmallest = j;
				}
			}
			
			temp = vehicles.get(i);
			vehicles.set(i, vehicles.get(indexOfSmallest));
			vehicles.set(indexOfSmallest, temp);
			
		}
	}
}


