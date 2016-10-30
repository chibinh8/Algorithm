package OOP;

public class Cat extends Animal{
	
	int age, height;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Cat(int age, int height, String name) {
		super(name);
		this.age = age;
		this.height = height;
				
	}
	
	@Override
	public String getAnimalName() {
		// TODO Auto-generated method stub
		return "Cat";
	}
	


}
