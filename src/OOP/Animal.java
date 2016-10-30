package OOP;

public abstract class Animal {

	String name;
	public Animal(){
		
		this.name = getAnimalName();
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getname() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getAnimalName();
	
	public void Displayname() {
		System.out.println("My name is " + this.name);
	}
	
}
