package curs5;

public class VariableScope {
	
	//instance area
	String nume;
	int num;
	
	//static area
	static String prenume;
	
	public static void afiseazaAltText() {
		System.out.println("Metoda statica");
	}
	

	public static void main(String[] args) {

		VariableScope obiect = new VariableScope();
		System.out.println(obiect.nume);
		//System.out.println(nume);
		System.out.println(prenume);
		obiect.afiseazaText();
		afiseazaAltText();
		
		
		
	}
	
	
	public void afiseazaText() {
		String text = "Text" ;	
		System.out.println(text);
		System.out.println(nume);
		
	}
	

}
