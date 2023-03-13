package curs7;

public class TestAnimal {

	
	
	public static void main(String[] args) {

	/*	Animal animal =  new Animal();
		animal.makeSound();
		
		Deer bambi =  new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		bambi.metodaAnimal();
		
		Lion simba =  new Lion();
		simba.makeSound();
		simba.eatMeat(); */
		
		
		//Lion simba =  new Lion();
		//WebDriver obj =  new ChromeDriver(); 
		
		Animal leu =  new Lion();
		leu.makeSound();
		((Lion) leu).eatMeat();
		feedAnimal(leu);
		
		leu =  new Deer();
		leu.makeSound();
		feedAnimal(leu);
		
	}

	public static void feedAnimal(Animal object) {
		if(object instanceof Lion) {
			System.out.println("You are geeting steak!");
		}else if(object instanceof Deer) {
			System.out.println("you are getting salad!");
		}
	} 
	
	
}
