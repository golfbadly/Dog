import java.util.Scanner;
public class Dog extends Behavior{
	private int number;
	private String name;
	private String breeds;
	private String age;	
	
   	public Dog(int numberDog, String nameDog, String breedsDog, String ageDog){
		this.number = numberDog;	
		this.name = nameDog;	
		this.breeds = breedsDog;
		this.age = ageDog;	
		System.out.println("Number: "+numberDog+" | Name: "+nameDog+" | Breeds: "+breedsDog+" | Age: "+ageDog);
	}

}
