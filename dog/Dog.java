import java.util.Scanner;

public class Dog{  

   public static void main (String[] args){

	String breeds = null;
	String age = null;       
	String sex = null;	
	String name = null;
        String doing = null; 

        DetailDog dog = new DetailDog(breeds, age, sex, name, doing);
        
	dog.setBreeds(breeds);
	dog.setAge(age);
	dog.setSex(sex);
	dog.setName(name);
        dog.setDoing(doing);

       
        Scanner scan = new Scanner (System.in);
     
	System.out.print ("Enter breeds of Dog: ");
	breeds = scan.nextLine();

	System.out.print ("Enter age of Dog: ");
	age = scan.nextLine();

        System.out.print ("Enter sex of Dog: ");
        sex = scan.nextLine();

	System.out.print ("Enter name of Dog: ");
        name = scan.nextLine();

        System.out.println("******************************");
        System.out.println("Dog breeds: "+breeds);
        System.out.println("Dog age: "+age);
	System.out.println("Dog sex: "+sex);
	System.out.println("Dog name: "+name);
	System.out.println("******************************");

        Scanner scando = new Scanner (System.in);

	System.out.print("Command Dog: ");
	doing = scando.nextLine();
	
        System.out.println("Now: Dog "+doing+"ing");
	System.out.println("******************************");	
    }
	  
 
} 
