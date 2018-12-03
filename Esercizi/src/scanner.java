import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		// Scanner name = new Scanner(System.in);
		
		// Sysout("question");
		// String input = name.nextline();
		
		// Sysout("question");
		// Int number = name.nextint();
		// Sysout(input+number);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("Your name is " + name);
		
		// Ask the user for his age and print: hi + name. You are + age
		
		System.out.println("What is your age");
		int age = sc.nextInt();
		
		System.out.println("Hi " + name + "! You are " + age);
		
		//   *****************************************************************************
		
		// Ask the user for their favorite animal and how many pets they have had.
		
		System.out.println("What is your favorite animal?");
		String animal = sc.nextLine();
		
		System.out.println("How many pets have you had?");
		int number = sc.nextInt();
		
		System.out.println("your favorite animal is " + animal + " and you had " + number + " pets");
		
		
		
	}

}
