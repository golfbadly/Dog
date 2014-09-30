import java.util.Scanner;
public class Dog extends Doing{

	private String name;
	private String[] list;	
	private String command;
	
   	public Dog(String nameDog, String breedsDog, String ageDog){
		this.name = nameDog;	
//		System.out.println("Dog name: "+nameDog);
	}


/*	public void addDog(){	

		String add = "";	
		while(!(add.equals("y")) && !(add.equals("n"))){	
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you want to add a dog. Select y/n : ");
		add = scan.nextLine();	

		if(add.equals("y")){
	 	newDog(); 	
		}else if (add.equals("n")){
	        list();	
		}else{System.out.println("pls select y/n");}
		}	
	}
*/	
	public void newDog(){
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter number of dog: ");
		int num = scan.nextInt();
                list = new String[num];
		
		for(int i = 0; i < list.length; i++){
                System.out.print("Enter name of dog"+(i+1)+": ");
                String nam = scan.next();
                list[i] = nam;
                }		
		
		list();	
	}

	public void list(){
		Scanner scan = new Scanner(System.in);	

		System.out.println("List of dog.");
                for (int y = 0; y < list.length; y++) {
                System.out.println((y+1)+"."+list[y] + " ");
                }

                System.out.print("Select dog: ");
                int select = scan.nextInt();
                System.out.println("Hello! I'm "+list[(select-1)]);	
	
		command(select);
	}
	
	public void command(int select){
		Dog dog = new Dog("");	
		Scanner scan = new Scanner(System.in);
		command = "";	
		while(!(command.equals("n"))){	

		System.out.println("Command\n1.Run\n2.Jump\n3.Crouch\n4.Eat\n5.Sit\n6.Bark");			
		System.out.println("If you want to select dog. Pls enter _y__");	
		System.out.println("If you want to exit. Pls enter _n_");	
		System.out.print("Enter command: ");	
		command = scan.nextLine();

                        if(command.equals("n")){
                        System.exit(0);
                        }
			else if(command.equals("y")){
			list();
			}	
			else if(command.equals("1")){
			System.out.print(list[(select-1)]+": ");dog.run();
			}	
			else if(command.equals("2")){
			System.out.print(list[(select-1)]+": ");dog.jump();
			}
			else if(command.equals("3")){
			System.out.print(list[(select-1)]+": ");dog.crouch();
			}
			else if(command.equals("4")){
			System.out.print(list[(select-1)]+": ");dog.eat();
			}
			else if(command.equals("5")){
			System.out.print(list[(select-1)]+": ");dog.sit();
			}
			else if(command.equals("6")){
			System.out.print(list[(select-1)]+": ");dog.bark();
			}
			else if(command.equals("7")){
                        System.out.print(list[(select-1)]+": ");dog.crack();
                        }
	
			else{
			System.out.println("Pls Select command.");
			}

		}	
	}
  
}
