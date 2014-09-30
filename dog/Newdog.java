import java.util.Scanner;

public class Newdog{

String dogBreeds;
String dogAge;
String dogSex;
String dogDoing;

	
	public Newdog(String name){
	System.out.println("Dog name: "+name); 
	}
	public void setBreeds(String breeds){
	dogBreeds = breeds;	
	}
	public String getBreeds(){
		if(dogBreeds.equals("1")){dogBreeds = "Labrador";}
		else if(dogBreeds.equals("2")){dogBreeds = "Poodle";}	
		else if(dogBreeds.equals("3")){dogBreeds = "Bulldog";} 		
		else{dogBreeds = "Beagle";}
	System.out.println("Dog breeds: "+dogBreeds);
        return dogBreeds;	
	}

	public void setAge(String age){
	dogAge = age;
	}
	public String getAge(){
		if(dogAge.equals("1")){dogAge = "Children";}
                else if(dogAge.equals("2")){dogAge = "Adult";}
                else{dogAge = "Old";}	
	System.out.println("Dog age: "+dogAge);
	return dogAge;	
	}

	public void setSex(String sex){
        dogSex = sex;
        }
	public String getSex(){
		 if(dogSex.equals("1")){dogSex = "male";}
                else{dogSex = "female";}  
	System.out.println("Dog sex: "+dogSex);
        return dogSex;
        }

	 public void setDoing(String doing){
        dogDoing = doing;
        }
       /* public String getDoing(){
       		 if(dogDoing.equals("1")){dogDoing = "I'm here.";}
                else if(dogDoing.equals("2")){dogDoing = "Hello!";}
                else if(dogDoing.equals("3")){dogDoing = "I'm crouching.";}
		else if(dogDoing.equals("4")){dogDoing = "I'm followwing.";}
		else if(dogDoing.equals("5")){dogDoing = "I'm barking.";}
		else{dogDoing = "I'm sitting.";}
	System.out.println("Now! Dog: "+dogDoing);
        return dogDoing;
        }
*/

	public String getDoing(){
                 if(dogDoing.equals("1")){dogDoing = "I'm here.";}
                else if(dogDoing.equals("2")){dogDoing = "Hello!";}
                else if(dogDoing.equals("3")){dogDoing = "I'm crouching.";}
                else if(dogDoing.equals("4")){dogDoing = "I'm followwing.";}
                else if(dogDoing.equals("5")){dogDoing = "I'm barking.";}
                else if(dogDoing.equals("6")){dogDoing = "I'm sitting.";}
//		else if(dogDoing.equals("y")){main(args);}
		else{dogDoing = "Pls select commands.";} 

	System.out.println("Now! Dog: "+dogDoing);
        return dogDoing;
        }

///////////////////////////////////////////////////////


	public static void main(String []args){
	
	Scanner scan = new Scanner (System.in);

        System.out.print ("Enter name of Dog: ");
        String name = scan.nextLine();
	Newdog Dog = new Newdog(name);

	System.out.println("List of breeds.\n1.Labrador\n2.Poodle\n3.Bulldog\n4.Beagle");
	System.out.print ("Enter breed of Dog: ");
	String breed = scan.nextLine();
	Dog.setBreeds(breed);
	Dog.getBreeds();
	
	System.out.println("List of ages.\n1.Children\n2.Adult\n3.Old");
	System.out.print("Enter age of Dog: ");
	String age = scan.nextLine();	
	Dog.setAge(age);
	Dog.getAge();	
	
        System.out.print("Enter sex of Dog between\n1.male\n2.female\nSex: ");
        String sex = scan.nextLine();
	Dog.setSex(sex);
	Dog.getSex();
	
/*	System.out.println("Choose command.\n1.run\n2.jump\n3.sleep\n4.wake up\n5.flip\n6.eat");
	System.out.println("If you want to exit pls enter _no_");	
	System.out.print("Enter command: ");	
	String command = scan.nextLine();	
	Dog.setDoing(command);
	Dog.getDoing();	
*/

/*	String command = "";
		while(!(command.equals("no"))){
		 System.out.println("Choose command.\n1.Come here!\n2.Saluting!\n3.Crouch!\n4.Follow\n5.Bark\n6.Sit");
       		 System.out.println("If you want to exit pls enter _no_");
        	 System.out.print("Enter command: ");
        	 command = scan.nextLine();
        	 Dog.setDoing(command);
        	 Dog.getDoing();
		}
*/
	String command = "";
                
			while(!(command.equals("n"))){
                 	System.out.println("Choose command.\n1.Come here!\n2.Saluting!\n3.Crouch!\n4.Follow\n5.Bark\n6.Sit");
                 	System.out.println("If you want to have new dog. Pls enter _y_");	
			System.out.println("If you want to exit. Pls enter _n_");
                 	System.out.print("Enter command: ");
                 	command = scan.nextLine();
                 	Dog.setDoing(command);
                 	Dog.getDoing();
			}
		
	}
}
