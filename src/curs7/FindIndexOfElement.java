package curs7;

public class FindIndexOfElement {

	/*
	 * avem un array de tip integer
	 * vreau sa printam care este indexul unui anumit element
	 * Ex: index pentru elementul 6 este 3
	 * rezolvare cu FOR
	 * rezolvare cu FOR EACH
	 */
	
	static int[] number = { 3, 4, 5, 6, 8, 9, 6};
	
	public static void main(String[] args) {

		rezolvareCuFor();
		
		
	}

	
	public static void rezolvareCuFor() {
		
		for(int i = 0; i<number.length; i++) {
			
			if(number[i] == 6) {
				System.out.println("index pentru elementul 6 este " + i);
			}
		}
	}
	
	
	public static void rezolvareCuForEach() {
		
		//static int[] number = { 3, 4, 5, 6, 8, 9};
		
		int i= 0;
		
		for(int element : number) {
			
			if(element == 6) {
				System.out.println("index pentru elementul 6 este " + i);

			}
			i++;
		}
		
	}
	
	
}
