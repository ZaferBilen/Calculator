import java.util.Scanner;

public class Islemler {
	
	Scanner scan =new Scanner(System.in);
	
	private double sonuc = 0;	

	public double toplama() { //toplama
		double sayi1;
		double sayi2;
		if(sonuc==0) {
		System.out.println("...." + " + " + "....." + " = " + "....");
		sayi1 = scan.nextDouble();
		System.out.print(sayi1 + " + " + "....." + " = " + "....");
		sayi2 = scan.nextDouble();
		sonuc = sayi1+sayi2;
		System.out.println(sayi1 + (" + " + sayi2 + (" = " ) + sonuc ));
		}
		else {
			System.out.print(sonuc + " + ");
			sayi1 = scan.nextDouble();
			sonuc +=(sayi1);
			System.out.println(sonuc + " + " + sayi1 +" = " + sonuc);
		}
		return sonuc;
		
	}
	public double cikarma() { //cikarma
		double sayi1;
		double sayi2;
		if(sonuc==0) {
		System.out.println("...." + " - " + "....." + " = " + "....");
		sayi1 = scan.nextDouble();
		System.out.print(sayi1 + " - " + "....." + " = " + "....");
		sayi2 = scan.nextDouble();
		sonuc = sayi1-sayi2;
		System.out.println(sayi1 + (" - " + sayi2 + (" = " ) + sonuc ));
		}
		else {
			System.out.print(sonuc + " - ");
			sayi1 = scan.nextDouble();
			sonuc -=(sayi1);
			System.out.println(sonuc + " - " + sayi1 +" = " + sonuc);
			
		}
		return sonuc;
	}
	public double carpma() { //carpma
		double sayi1;
		double sayi2;
		if(sonuc==0) {
		System.out.println("...." + " * " + "....." + " = " + "....");
		sayi1 = scan.nextDouble();
		System.out.print(sayi1 + " * " + "....." + " = " + "....");
		sayi2 = scan.nextDouble();
		sonuc = sayi1*sayi2;
		System.out.println(sayi1 + (" * " + sayi2 + (" = " ) + sonuc ));			
	}
		else {
			System.out.print(sonuc + " * ");
			sayi1 = scan.nextDouble();
			sonuc *=(sayi1);
			System.out.println(sonuc + " * " + sayi1 +" = " + sonuc);
		}
		return sonuc;
	}
	public double bolme() { //bolme
		double sayi1;
		double sayi2;
		if(sonuc==0) {
		System.out.println("...." + " / " + "....." + " = " + "....");
		sayi1 = scan.nextDouble();
		System.out.print(sayi1 + " / " + "....." + " = " + "....");
		sayi2 = scan.nextDouble();
		sonuc = sayi1/sayi2;
		System.out.println(sayi1 + (" / " + sayi2 + (" = " ) + sonuc ));
	    }
		else {
			System.out.print(sonuc + " / ");
			sayi1 = scan.nextDouble();
			sonuc /=(sayi1);
			System.out.println(sonuc + " / " + sayi1 +" = " + sonuc);		
		}
		return sonuc;
	}
	public double usHesaplama() { //ussu hesaplama
		double sayi1;
		double sayi2;
		if(sonuc==0) {
		System.out.println("...." + " ^ " + "....." + " = " + "....");
		sayi1 = scan.nextDouble();
		System.out.print(sayi1 + "^ " + "....." + " = " + "....");
		sayi2 = scan.nextDouble();
		sonuc = Math.pow(sayi1, sayi2);
		System.out.println(sayi1 + ("^" + sayi2 + (" = " ) + sonuc ));
		}
		else {
			System.out.print(sonuc + "^ ");
			sayi1 = scan.nextDouble();
			sonuc = Math.pow(sonuc, sayi1);
			System.out.println(sonuc + "^" + sayi1 +" = " + sonuc);
		}
		return sonuc;
	}
	public double karekok() { //karekok
		double sayi1;
		if(sonuc==0) {
		System.out.println("...." + " karakok = ....");
		sayi1 = scan.nextDouble();
		sonuc = Math.sqrt(sayi1);
		System.out.print( sayi1 +" = "+ sonuc);
		}
		else {
			System.out.print(sonuc + " karakok ");
			sonuc = Math.sqrt(sonuc);
			System.out.print(" = " + sonuc);
		}
		return sonuc;
	}
	public double onUssu() {//10 üssü
		final int sayi1  = 10;
		double sayi2;
		if(sonuc==0) {
		System.out.println("10" + "^ " + "....." + " = " + "....");
		System.out.print(sayi1 + ("^"));
		sayi2 = scan.nextDouble();
		sonuc = Math.pow(sayi1, sayi2);
		System.out.println(sayi1 + ("^" + sayi2 + (" = " ) + sonuc ));
		}
		else {
			System.out.println(sonuc + "^ ");
			sonuc = Math.pow(sayi1,sonuc);
			System.out.println(sonuc + "^" + sayi1 +" = " + sonuc);
		}
		return sonuc;
	}
	public double reset() {
		return 0;
	}
	
	
}
