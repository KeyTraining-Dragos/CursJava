package curs7;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray = new String[5];
		
		//String[] textArray = { null, null, null, null, null}
		// index of array =        0 ,   1  ,  2 ,   3  ,  4 
		// 
		
		System.out.println(textArray[0]);
		textArray[0] = "This ";
		//String[] textArray = { "Text", null, null, null, null}
		System.out.println(textArray[0]);
		textArray[1] = "is ";
		//String[] textArray = { "Text", "is", null, null, null}
		textArray[2] = "an ";
		textArray[3] = "array ";
		textArray[4] = " !";
		
		
		for(int i=0; i <textArray.length; i++) {
			
			System.out.print(textArray[i]);
		}

		System.out.println(Arrays.toString(textArray));

		//for each  --enhanced loop
		
		for(String element : textArray) {
			
			System.out.print(element);
		}
		


	}

}
