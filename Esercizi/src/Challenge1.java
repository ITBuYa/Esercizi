import java.util.Scanner;
public class Challenge1 {
	
	public static void main(String[] args) {
		 
		    //                             Challenge 1
		    // Write a Java method to count all vowels in a string. 
		    // Hint: Use substring() for this challenge question. You can also use charAt().
		
		/*String word = "Deltaplano";
		int Vowels = 0;
		for (int i = 0; i < word.length(); i++) {
		    if (word.substring(i, i + 1).equals("a") 
		     || word.substring(i, i + 1).equals("e")
		     || word.substring(i, i + 1).equals("i") 
		     || word.substring(i, i + 1).equals("o")
		     || word.substring(i, i + 1).equals("u")) {
		        Vowels++;
		    }
		}
		System.out.println("The number of vowels in " + word + " is " + Vowels);}

		//**********************************************************************************	
        //                                 Challenge 2

        // Write a Java method to count all words in a string entered by a user. 
		// Assume that each word is separated by a 
		// SINGLE SPACE and that there is at least 1 word in the string. 

        // Example: "This is a big world" has 4 words

		
		String parola = "Sono nato in italia";
		int conta = 1;
		for(int i = 0; i<parola.length(); i++) {
			if(parola.substring(i, i+1).equals(" ")) {
				conta++;
		System.out.println("The number of words in '" + parola + "' is " + conta);
			}
		}
		
	    // ********************************************************************************
		//                                 Challenge3
		
		// Write a Java method to check whether a string entered by a user is a valid password.
        // Password rules:

        // A password must have at least ten characters.
        // A password must have at least one uppercase letter.
		// A password must contain at least two digits.
		// Note: Password MUST meet all 3 rules to be considered valid.

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a password:");
		String password = s.nextLine();
		boolean validPassword = true;
		if (password.length() < 10) {
			validPassword = false;
		}
		
		boolean allLowercase = password.equals(password.toLowerCase());
		
		
		if(allLowercase) {  // allLowercase == true
			
			validPassword = false;
			
		}
		
		int digits = 0;
		
		for(int i = 0; i<password.length(); i++ ) {
			
			if (password.substring(i, i + 1).equals("1")
					
			   ||  password.substring(i, i + 1).equals("2")
			
			   ||  password.substring(i, i + 1).equals("3")
			
			   ||  password.substring(i, i + 1).equals("4")
			
			   ||  password.substring(i, i + 1).equals("5")
			
			   ||  password.substring(i, i + 1).equals("6")
			
			   ||  password.substring(i, i + 1).equals("7")
			
			   ||  password.substring(i, i + 1).equals("8")
			
			   ||  password.substring(i, i + 1).equals("9")
			
			   ||  password.substring(i, i + 1).equals("0")
			
			) {
				
				digits++; 
				
			}
			
			if(digits < 2) {
				
				validPassword = false;
				
			}
			
			if(validPassword) {
				
				System.out.println("The password is valid");
				
			}
			
			else {
				
				System.out.println("The password is invalid");
				
			}
			
		
			}
		
		//*********************************************************************************
		//                                Challenge4
		
		//  Given an integer n, perform the following conditional actions:

        //  If n is odd, print "red"
        //  If n is even and in the inclusive range of 2 to 5 print "blue" (2,3,4,5)
        //  If n is even and in the inclusive range of 6 to 20 print "green" (6,7,8, 9, 10....20)
        //  If n is even and greater than 20 print "yellow"


		int n = 200;
		
		if(n % 2 == 1) {
			System.out.println("Red");
		}
		else if (n>=2 && n<=5) {
		    System.out.println("Blue");
		}
		else if (n>=6 && n<=20) {
		    System.out.println("Blue");
		}
		else {
			System.out.println("Yellow");
		}
		
		// ***********************************************************************************
		//                                   Challenge 5
		
		//  Write a Java program to find the common elements between two arrays (int values) 
		//  and print the similar elements to the console. 
		//  Assume that both arrays have the same length (equal number of int elements)
        //  For example, for:

        //  int[] array1 = {2, 3, 4};

        //  int[] array2 = {3, 6,7};

        //  3 is printed out to the console

		int[] array1 = {3, 33, 44, 66, 77, 99};
		int[] array2 = {33, 45, 54, 64, 99, 8};
		
		for(int x = 0; x<array1.length; x++) {
			for(int y = 0; y<array2.length; y++) {
				if(array1[x] == array2[y]) {
					System.out.println(array2[y]);
				}
			}
			
		}*/
		
		
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

 
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		