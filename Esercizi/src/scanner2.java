import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		
		// Ask user to give two double input for length and breadth of a rectangle
		// and print area type casted to int.
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Qual'e' la base del rettangolo?");
		double b = s1.nextDouble();
		System.out.println("Qual'e' l'altezza del rettangolo?");
		double a = s1.nextDouble();
		int area = (int) (a * b);
		
		System.out.println("L'area del rettangolo è: " + area);
		
		
	}
}
