package curs5;

public class StringComparison {

	public static void main(String[] args) {

		String s1 = "masina";
		String s2 = "masina";
		String s3 = new String("masina");
		
		System.out.println(s1 == s2); // va afisa TRUE
		System.out.println(s1 == s3); // va afisa FALSE
		
		System.out.println("----------------");
		System.out.println(s1.equals(s3));// va afisa TRUE
		
		
		
	}

}
