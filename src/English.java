import java.util.Scanner;

public class English {
	Scanner scan = new Scanner(System.in);
	
	public void eng() {
		Transactions mat = new Transactions();

		String transaction = "transactions \n"
							+ "(+) Additional \n"
							+ "(-) Extraction \n"
							+ "(*) Multiplication \n"
							+ "(/) Section \n"
							+ "(^) TheExponentOf  \n"
							+ "(&) SquareRoot \n"
							+ "(10) TenTheExponentOf \n"
							+ "(0) Reset \n"
							+ "(q) Exit";
		
		System.out.println(transaction);
		System.out.println();
		System.out.print("preference : ");
		
		while (true) {
			String process = scan.nextLine();
			if(process.equals("q")) {
				System.out.println("Calculator is closing");
				System.exit(0);
			}
			else if (process.equals("+")) {
				mat.toplama();
			}
			else if (process.equals("-")) {
				mat.cikarma();
			}
			else if (process.equals("*")) {
				mat.carpma();
			}
			else if (process.equals("/")) {
				mat.bolme();
			}
			else if (process.equals("^")) {
				mat.usHesaplama();
			}
			else if (process.equals("&")) {
				mat.karakok();
			}
			else if (process.equals("10")) {
				mat.onUssu();
			}
			else if (process.equals("0")) {
				mat.reset();
				System.out.println(transaction);
				System.out.println();
				System.out.print("preference : ");
			}
			
			else {
			System.out.println("You have made an incorrect selection, please make your selection again.");
			System.out.println();
			System.out.print("preference : ");
		}

	}
	}

}
