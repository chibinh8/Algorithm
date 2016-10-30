package OOP;

import java.util.Random;

public class AninalPoli {

	public Animal getRandomAnimal() {
		int random = new Random().nextInt(2);
		Animal animal = null;
		if(random==0) 
			animal = new Cat(10, 20, "Kitty");
		else{
			
			animal = new Mouse("Jerry");
		}
		
		return animal;
		
	}
	
	public void DisplayRandomAnimal() {
		
		Animal animal = getRandomAnimal();
		if(animal instanceof Cat){
			Cat cat = (Cat) animal;
			cat.Displayname();
		}
		else{
			Mouse mouse = (Mouse)animal;
			mouse.Displayname();
		}
	}
}
