import java.util.Scanner;
public class scanner3 {

	public static void main(String[] args) {
		
		// Take name, roll number and a field of interest from user and print in the 
		// format below :
		// Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = s2.nextLine();
		System.out.println("What is your field of interest?");
		String fieldOfInterest = s2.nextLine();		
		System.out.println("What is your roll number?");
		int rollNumber = s2.nextInt();
		
		System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + 
				". My field of interest is " + fieldOfInterest + ".");
		
		
	}
}
