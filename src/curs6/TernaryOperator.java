package curs6;

public class TernaryOperator {

	public static void main(String[] args) {

		int a = 60;
		int b = 130;
		
		int x;
		
		if(a>b) {
			x = a;
		}else {
			x = b;
		}
		
		int y = a>b?a:b;
		
		System.out.println(y);
		
		
		System.out.println(x);
		
	}

}
