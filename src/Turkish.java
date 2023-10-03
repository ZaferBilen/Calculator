import java.util.Scanner;

public class Turkish {
Scanner scan = new Scanner(System.in);
	
	public void tr() {
		Islemler islemler = new Islemler();

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
				islemler.toplama();
			}
			else if (process.equals("-")) {
				islemler.cikarma();
			}
			else if (process.equals("*")) {
				islemler.carpma();
			}
			else if (process.equals("/")) {
				islemler.bolme();
			}
			else if (process.equals("^")) {
				islemler.usHesaplama();
			}
			else if (process.equals("&")) {
				islemler.karekok();
			}
			else if (process.equals("10")) {
				islemler.onUssu();
			}
			else if (process.equals("0")) {
				islemler.reset();
			}
			
			else {
			System.out.println("Hatalý giriþ yaptýnýz. Tekrar deneyin");
			System.out.println();
			System.out.print("Tercih : ");
		}

	}
	}

}
