import java.util.Scanner;

public class English {
	Scanner scan = new Scanner(System.in);
	
	public void eng() {
		Transactions transactions = new Transactions();

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
				transactions.additional();
			}
			else if (process.equals("-")) {
				transactions.extraction();
			}
			else if (process.equals("*")) {
				transactions.multiplication();
			}
			else if (process.equals("/")) {
				transactions.section();
			}
			else if (process.equals("^")) {
				transactions.theExponentOf();
			}
			else if (process.equals("&")) {
				transactions.squareRoot();
			}
			else if (process.equals("10")) {
				transactions.tenTheExponentOf();
			}
			else if (process.equals("0")) {
				transactions.reset();
			}
			
			else {
			System.out.println("You have made an incorrect selection, please make your selection again.");
			System.out.println();
			System.out.print("preference : ");
		}

	}
	}

}
