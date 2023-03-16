package curs8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		//String[] array = new String[4];
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Ioana");
		list.add("Ion");
		list.add("Maria");
		
		System.out.println(list.get(2));
		
		list.add(1, "George");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.remove(0);
		list.remove("Ioana");

		System.out.println("-------------------------");
		for(String nume : list) {
			System.out.println(nume);
		}
		
		String text = "Maria";
		System.out.println(list.contains(text));
		
		list.set(0, "Oana");
		
		System.out.println("-------------------------");
		for(String nume : list) {
			System.out.println(nume);
		}
		
		list.add("Ioana");
		list.add("Marian");
		
		System.out.println("------------BEFORE-------------");

		for(String nume : list) {
			System.out.println(nume);
		}
		
	/*	Oana -> 0
		Ion -> 1
		Maria -> 2 (inclus)
		Ioana -> 3
		Marian -> 4 (exclus)
	*/	
		list.subList(2, 4).clear();
		
		System.out.println("------------After-------------");

		for(String nume : list) {
			System.out.println(nume);
		}
		
		
	}

}
