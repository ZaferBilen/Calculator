import java.util.Scanner;

public class Transactions {
	
	Scanner scan =new Scanner(System.in);
	
	private double result = 0;	
	
	public double additional() { //toplama
		double number1;
		double number2;
		if(result==0) {
		System.out.println("...." + " + " + "....." + " = " + "....");
		number1 = scan.nextDouble();
		System.out.print(number1 + " + " + "....." + " = " + "....");
		number2 = scan.nextDouble();
		result = number1+number2;
		System.out.println(number1 + (" + " + number2 + (" = " ) + result ));
		}
		else {
			System.out.print(result + " + ");
			number1 = scan.nextDouble();
			result +=(number1);
			System.out.println(result + " + " + number1 +" = " + result);
		}
		return result;
		
	}
	public double extraction() { //cikarma
		double number1;
		double number2;
		if(result==0) {
		System.out.println("...." + " - " + "....." + " = " + "....");
		number1 = scan.nextDouble();
		System.out.print(number1 + " - " + "....." + " = " + "....");
		number2 = scan.nextDouble();
		result = number1-number2;
		System.out.println(number1 + (" - " + number2 + (" = " ) + result ));
		}
		else {
			System.out.print(result + " - ");
			number1 = scan.nextDouble();
			result -=(number1);
			System.out.println(result + " - " + number1 +" = " + result);
			
		}
		return result;
	}
	public double multiplication() { //carpma
		double number1;
		double number2;
		if(result==0) {
		System.out.println("...." + " * " + "....." + " = " + "....");
		number1 = scan.nextDouble();
		System.out.print(number1 + " * " + "....." + " = " + "....");
		number2 = scan.nextDouble();
		result = number1*number2;
		System.out.println(number1 + (" * " + number2 + (" = " ) + result ));			
	}
		else {
			System.out.print(result + " * ");
			number1 = scan.nextDouble();
			result *=(number1);
			System.out.println(result + " * " + number1 +" = " + result);
		}
		return result;
	}
	public double section() { //bolme
		double number1;
		double number2;
		if(result==0) {
		System.out.println("...." + " / " + "....." + " = " + "....");
		number1 = scan.nextDouble();
		System.out.print(number1 + " / " + "....." + " = " + "....");
		number2 = scan.nextDouble();
		result = number1/number2;
		System.out.println(number1 + (" / " + number2 + (" = " ) + result ));
	    }
		else {
			System.out.print(result + " / ");
			number1 = scan.nextDouble();
			result /=(number1);
			System.out.println(result + " / " + number1 +" = " + result);		
		}
		return result;
	}
	public double theExponentOf() { //üssü hesaplama
		double number1;
		double number2;
		if(result==0) {
		System.out.println("...." + " ^ " + "....." + " = " + "....");
		number1 = scan.nextDouble();
		System.out.print(number1 + "^ " + "....." + " = " + "....");
		number2 = scan.nextDouble();
		result = Math.pow(number1, number2);
		System.out.println(number1 + ("^" + number2 + (" = " ) + result ));
		}
		else {
			System.out.print(result + "^ ");
			number1 = scan.nextDouble();
			result = Math.pow(result, number1);
			System.out.println(result + "^" + number1 +" = " + result);
		}
		return result;
	}
	public double squareRoot() { //karekök
		double number1;
		if(result==0) {
		System.out.println("...." + " square root = ....");
		number1 = scan.nextDouble();
		result = Math.sqrt(number1);
		System.out.print( number1 +" = "+ result);
		}
		else {
			System.out.print(result + " square root ");
			result = Math.sqrt(result);
			System.out.println(" = " + result);
		}
		return result;
	}
	public double tenTheExponentOf() {//10 üssü
		final int number1  = 10;
		double number2;
		if(result==0) {
		System.out.println("10" + "^ " + "....." + " = " + "....");
		System.out.print(number1 + ("^"));
		number2 = scan.nextDouble();
		result = Math.pow(number1, number2);
		System.out.println(number1 + ("^" + number2 + (" = " ) + result ));
		}
		else {
			System.out.println(result + "^ ");
			result = Math.pow(number1,result);
			System.out.println(result + "^" + number1 +" = " + result);
		}
		return result;
	}
	public double reset() {
		return 0;
	}
	
	
}
