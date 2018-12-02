
public class Loop {
	
	public static void main(String[] args) {
		
		int x = 0;
		while(x<10) {
			System.out.println("hello");
			x++;
		}
		
		for(x=0; x<10; x++) {
			System.out.println("Bye");
		}
		
		for(int someNumber = 1; someNumber<=10; someNumber++) {
			System.out.println(someNumber);
		}
		
		//Tabellina del 3
		
		int myNumber = 1;
		while(myNumber<=10) {
			System.out.println(myNumber * 3);
			myNumber++;
		}
		
		for(myNumber = 1; myNumber<=10; myNumber++) {
			System.out.println(myNumber * 3);
		}
		
		int input = 5;
		int oddNum = 1;
		int sum = 0;
		
		for(int i=0; i<input; i++) {
			System.out.println(oddNum);
			sum += oddNum;
			oddNum += 2; } {
			System.out.println("The sum of the first " + input + " odd numbers is " + sum);
		}
			
		int input2 = 5;
		int oddNum2 = 1;
		int sum2 = 0;
		int j = 0;
		while(j<input2) {
			System.out.println(oddNum2);
			j++;
			sum2 += oddNum2;
			oddNum2 += 2; } {
		System.out.println("The sum of the first " + input2 + " odd numbers is " + sum2);
			
		}
	
				
	}
}

