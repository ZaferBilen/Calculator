import java.util.Scanner;

public class Turkish {
Scanner scan = new Scanner(System.in);
	
	public void tr() {
		Transactions mat = new Transactions();

		String islem = "Islemler \n"
							+ "(+) Toplama \n"
							+ "(-) Cýkarma \n"
							+ "(*) Carpma \n"
							+ "(/) Bolme \n"
							+ "(^) Ussu  \n"
							+ "(&) Karekok \n"
							+ "(10) On Ussu \n"
							+ "(0) Reset \n"
							+ "(q) Cýkýs ";
		
		System.out.println(islem);
		System.out.println();
		System.out.print("Tercih : ");
		
		while (true) {
			String process = scan.nextLine();
			if(process.equals("q")) {
				System.out.println("Hesap Makinesi Kapanýyor.");
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
				System.out.println(islem);
				System.out.println();
				System.out.print("Tercih : ");
			}
			
			else {
			System.out.println("Hatalý giriþ yaptýnýz. Tekrar deneyin");
			System.out.println();
			System.out.print("Tercih : ");
		}

	}
	}

}
