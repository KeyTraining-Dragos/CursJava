package curs6;

import java.util.Scanner;

public class ConditionalOperator {

	/*
	 * citim 2 numere de la tastatura si verificam urmatoarele :
	 * daca fiecare dintre nr este pozitiv
	 * daca ambele numere sunt pozitive
	 * care dintre cele 2 numere este cel mai mic
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter the first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the second number:");
		num2 = scan.nextInt();
		
		//verific daca primul numar este pozitiv
		if(num1>0) {
			System.out.println("Num1 is pozitive");
		}else {
			System.out.println("Num1 is negative");
		}
		//result = conditie ? expresie1 : expresie2;
		String result = num1>0?"Num1 is pozitive" :"Num1 is negative";
		System.out.println(result);
		
		if(num2>0) {
			System.out.println("Num2 is pozitive");
		}else {
			System.out.println("Num2 is negative");
		}
		
		result = num2>0?"Num2 is pozitive" :"Num2 is negative";
		System.out.println(result);
		
		if(num1>0 && num2>0) {
			System.out.println("Both numbers are positive");
		}else {
			System.out.println("One of the numbers is negative");
		}
		
		result = (num1>0 && num2>0) ? "Both numbers are positive":"One of the numbers is negative";
		System.out.println(result);
		
		//verific care dintre cele 2 nr este mai mare (ele pot fi egale)
		if(num1>num2) {
			System.out.println("Num1 is the greatest");
		}else if(num1 == num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Num2 is the greatest");
		}
		
		result = (num1>num2)?"Num1 is the greatest":(num1==num2)?"Numbers are equal":"Num2 is the greatest";
		System.out.println(result);
	}

}
