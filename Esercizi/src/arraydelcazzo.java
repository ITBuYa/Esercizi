
public class arraydelcazzo {

	public static void main(String[] args) {
		
		String[] animals = new String[5];
		animals[0] = "dog";
		animals[1] = "cat";
		animals[2] = "elephant";
		animals[3] = "lion";
		animals[4] = "horse";
		
		System.out.println(animals[4]);
		
		String[] animals1 = {"dog ", "cat ", "elephant ", "lion ", "horse"};
		
		for(int a = 0; a<animals1.length; a++) {
			
	    System.out.println(animals1[a]);
		}
		
		int[] multiple = new int[5];
		multiple[0] = 3;
		multiple[1] = 6;
		multiple[2] = 9;
		multiple[3] = 12;
		multiple[4] = 15;
		{
		System.out.println(multiple[3]); 
		}
		
		int[] multiple1 = {3, 6, 9, 12, 15};
		
		for(int x = 0; x<multiple.length; x++) {
			System.out.println(multiple1[x]);
			
		}
		
		
		
		
		
	}
}
