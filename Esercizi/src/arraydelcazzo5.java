
public class arraydelcazzo5 {
	
	public static void main(String[] args) {
		
		// Calculate the average value of an array element
		int[] numbers = new int[] {20, 30, 25, 35, -16, -100, 60};
		// Calculate sum
		int sum = 0;
		for(int i = 0; i<numbers.length; i++) 
			sum = sum + numbers[i];
		// Calculate average value
	    double average = sum /numbers.length;
	    System.out.println(average);
	}

}
