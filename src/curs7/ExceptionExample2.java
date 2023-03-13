package curs7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {

		
		try {
			System.out.println("Introdu un numar :");
			Scanner scan  = new Scanner(System.in);
			int num1  =  scan.nextInt();
			System.out.println("Introdu un numar :");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			System.out.println(num1/num2);
			
		}catch(InputMismatchException obj) {
			System.out.println("Te rog sa introduci doar numere!");
			
		}catch (ArithmeticException e) {
			System.out.println("nu mai imparti la 0");
		
		}catch (NullPointerException e) {
			System.out.println("A primit un null pointer");
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//NoSuchElement --> scrii in log
		//StaleElementException --> findElement
		
		
		
		System.out.println("Vreau sa execut si linia aceasta");
		
	}

}
