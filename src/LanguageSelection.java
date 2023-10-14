import java.util.Scanner;

public class LanguageSelection {
	Scanner scan = new Scanner(System.in);
	English eng = new English();
	Turkish tr = new Turkish();
	
	public void sel() {
		System.out.println("CALCULATOR");
		System.out.println();
	}
	
	public void selection() {
			
		while(true) {
		System.out.println("Please select a valid language");
		System.out.println("1-English");
		System.out.println("2-Türkçe");
		int language =scan.nextInt();
		scan.nextLine();
		
		if(language == 1) {
			eng.eng();			
		}
		else if (language == 2) {
			tr.tr();
		}
		
		else {
			System.out.println("You have made an incorrect selection.");
			System.out.println();
		}

	}
	}

}
