
public class giornidelmese {

	public static void main(String[] args) {
		
		String month = "stocazz";
		
		if(month == "January" || month == "March" || month == "May" || month == "July" || month == "August" 
				|| month == "October" || month == "December") {
			System.out.println(month + " has 31 days");
		}
		else if(month == "April" || month == "June" || month == "September" || month == "November") {
			System.out.println(month + " has 30 days");
		}
		else if(month == "February") {
			System.out.println(month + " has 28 days and 29 in leap years");
		}
		else { System.out.println("error");}
	}
}
