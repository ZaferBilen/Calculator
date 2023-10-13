

import java.util.Scanner;

public class Transactions implements ITransactions {

	Scanner scan = new Scanner(System.in);
	private double sonuc=0;
	@Override
	public double toplama() {
		double a ,b;
		if(sonuc==0) {
		System.out.println("...." + " + " + "....." + " = " + "....");
		a=scan.nextDouble();
		System.out.print(a + " + " + "....." + " = " + "....");
		b=scan.nextDouble();
		sonuc = a+b;
		System.out.println(a + (" + " + b + (" = " ) + sonuc ));
		}
		else {
			System.out.print(sonuc + " + ");
			a=scan.nextDouble();
			sonuc +=(a);
			System.out.println(sonuc + " + " + a +" = " + sonuc);
		}
		return sonuc;
		
		
	}

	@Override
	public double cikarma() {
		double a,b;
		if(sonuc==0) {
			System.out.println("...." + " - " + "....." + " = " + "....");
			a=scan.nextDouble();
			System.out.print(a + " - " + "....." + " = " + "....");
			b=scan.nextDouble();
			sonuc = a-b;
			System.out.println(a + (" - " + b + (" = " ) + sonuc ));
			}
			else {
				System.out.print(sonuc + " - ");
				a=scan.nextDouble();
				sonuc -=(a);
				System.out.println(sonuc + " - " + a +" = " + sonuc);
				
			}
			return sonuc;
		
	}

	@Override
	public double carpma() {
		double a,b;
		if(sonuc==0) {
			System.out.println("...." + " * " + "....." + " = " + "....");
			a=scan.nextDouble();
			System.out.print(a + " * " + "....." + " = " + "....");
			b=scan.nextDouble();
			sonuc = a*b;
			System.out.println(a + (" * " + b + (" = " ) + sonuc ));			
		}
			else {
				System.out.print(sonuc + " * ");
				a=scan.nextDouble();
				sonuc *=(a);
				System.out.println(sonuc + " * " + a +" = " + sonuc);
			}
			return sonuc;
		
	}

	@Override
	public double bolme() {
		double a,b;
		if(sonuc==0) {
			System.out.println("...." + " / " + "....." + " = " + "....");
			a=scan.nextDouble();
			System.out.print(a + " / " + "....." + " = " + "....");
			b=scan.nextDouble();
			sonuc = a/b;
			System.out.println(a + (" / " + b + (" = " ) + sonuc ));
		    }
			else {
				System.out.print(sonuc + " / ");
				a=scan.nextDouble();
				sonuc /=(a);
				System.out.println(sonuc + " / " + a +" = " + sonuc);		
			}
			return sonuc;
		
	}

	@Override
	public double usHesaplama() {
		double a,b;
		if(sonuc==0) {
			System.out.println("...." + " ^ " + "....." + " = " + "....");
			a=scan.nextDouble();
			System.out.print(a + "^ " + "....." + " = " + "....");
			b=scan.nextDouble();
			sonuc = Math.pow(a, b);
			System.out.println(a + ("^" + b + (" = " ) + sonuc ));
			}
			else {
				System.out.print(sonuc + "^ ");
				a=scan.nextDouble();
				sonuc = Math.pow(sonuc, a);
				System.out.println(sonuc + "^" + a +" = " + sonuc);
			}
			return sonuc;
		
	}

	@Override
	public double karakok() {
		double a;
		if(sonuc==0) {
		System.out.println("...." + " karakok = ....");
		a=scan.nextDouble();
		sonuc = Math.sqrt(a);
		System.out.print( a +" = "+ sonuc);
		}
		else {
			System.out.print(sonuc + " karakok ");
			sonuc = Math.sqrt(sonuc);
			System.out.print(" = " + sonuc);
		}
		return sonuc;
		
	}

	@Override
	public double onUssu() {
		final int sayi1  = 10;
		double a;
		if(sonuc==0) {
		System.out.println("10" + "^ " + "....." + " = " + "....");
		System.out.print(sayi1 + ("^"));
		a=scan.nextDouble();
		sonuc = Math.pow(sayi1, a);
		System.out.println(sayi1 + ("^" + a + (" = " ) + sonuc ));
		}
		else {
			System.out.println(sonuc + "^ ");
			sonuc = Math.pow(sayi1,sonuc);
			System.out.println(sonuc + "^" + sayi1 +" = " + sonuc);
		}
		return sonuc;
		
	}

	@Override
	public double reset() {
		
		return sonuc = 0;
		
	}


}
