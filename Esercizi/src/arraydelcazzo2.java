

public class arraydelcazzo2 {

	public static void main(String[] args) {
		// Write a java program to find the index of an array elements.
		// Print "not found" if the element does not exist in the array
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int index = 1; 
		boolean indexFound = false;
		for(int n = 0; n<numbers.length; n++) {
			if(index == numbers[n]) {
			System.out.println(index + " is located at position " + n + " in the array numbers");
			indexFound = true;
			}
		}
		if(indexFound == false) {
			System.out.println(index + " was not found in the array numbers");
		}	
	}
}
		
		

