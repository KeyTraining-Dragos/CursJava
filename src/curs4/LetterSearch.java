package curs4;

import java.util.Scanner;

public class LetterSearch {
/**
 * facem un program care citeste un string de la tastatura
 * cautam in stringul respectiv daca contine litera A
 * daca o gasim, printam ca litera A exista in text
 * daca nu o gasim, print ca nu exista in text
 * si printam si de cate ori exista daca o gasim 
 */
	
	public static void main(String[] args) {

		System.out.println("Please enter a text :");
		Scanner scan = new Scanner(System.in);
		String text =  scan.next().toUpperCase();
		//text = text.toUpperCase();
		
		//masinadawdadadadadadada
		//012345
		int counter = 0;
		
		for(int i=0;i<text.length();i++ ) {
			
			if(text.charAt(i) == 'A') {
							
				counter++;
			}
		}
		
		if(counter >0) {
			System.out.println("Litera A exista in text de :" + counter);
		}else {
			System.out.println("Litera A nu exista in text");
		}
		
	}

}
