
public class arraydelcazzo3 {
	
	public static void main(String[] args) {
		
		String[] words = {"sleepy", "morning", "dogs", "school"};
        String[] duplicate = new String[words.length];
        int s = 0;
        while(s<words.length) {
            duplicate[s] = words[s];
            System.out.println(duplicate[s]);
            s++;
	}
	}
}
