import java.util.Scanner;

public class scanner4 {
 
	public static void main(String[] args) {
		
		// Ask the user for the name of a relative and then construct a fictional city
		// with the name through the following steps:
		// Say the user input is "Hilton".
		// a. Choose a random index (n) of the string. Let's assume index (n) is 3 for the 
		// name Hilton. Note: the index has to be smaller than the length of the input
		// b. Find the nth letter in the input. The 3rd letter in Hilton is "t" assuming
		// that "h" is 0th.
		// c. The fictional city name will be equal to the substring starting from index n
		// to the end of the input and then the first part of the name (till index n)
		// will be appened to it. In this case, fictionalCity = tonhil (ton+hil)
		// More examples: 
		// (i) Name = "beverly", random index (n) = 3, fictionalCity = erlybev (erly + bev)
		// (ii) Name = "rupal", random index (n) = 2, fictionalCity = palru (pal + ru)
		// (iii) Name = "Sachin", random index (n) = 4, fictionalCity = insach (in + sach)
		
		Scanner s3 = new Scanner(System.in);
		
		System.out.println("What is the name of your relative?");
		String relativeName = s3.nextLine();
		// Hilton: length = 6
		int randomIndex = (int) (Math.random()*relativeName.length());
		String fictionalCity = relativeName.substring(randomIndex, relativeName.length())
				+ relativeName.substring(0, randomIndex);
		System.out.println("The fictional city you live in is: " + fictionalCity);
		
		/*String s = "ElephantsAreBig";
		String middleWorld = s.substring(9, 15);
		System.out.println("Last word is: " + middleWorld);*/
	}
}
