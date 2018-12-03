
public class substring {

	public static void main(String[] args) {
		
		String input = "porcodiddio";
		int index = input.length()/2;
		String newWord = input.substring(index) + input.substring(0, index);
		System.out.println(newWord);
	}
}
