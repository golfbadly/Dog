import java.util.Scanner;
public class Simulator{


	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	
		String select;

		System.out.println("\nIf you want to exit. Pls enter _n_\n");	
		System.out.println("List: 1.Jame 2.John 3.Jane 4.June 5.Jake\n");	
		System.out.print("Select dog: ");	
		select = scan.nextLine();
	
		if(select.equals("n")){
		System.exit(0);	
		}else if(select.equals("1")){
			String command = "";	
			while(!(command.equals("n"))){	
				
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
				System.out.println("If you want to exit. Pls enter _n_\n");	
		
				Dog dog = new DogSim("Jame","Poodle","Adult","Male","t");
	
				System.out.println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark");	
				System.out.print("Command: ");
				command = scan.nextLine();	
				if(command.equals("s")){
				main(args);	
				}	
				else if(command.equals("n")){
				System.exit(0);
				}	
				else if(command.equals("1")){
				dog.setRunBehavior(new Run());
				}	
				else if(command.equals("2")){
				dog.walk();
				}
				else if(command.equals("3")){
				dog.eat();
				}
				else if(command.equals("4")){
				dog.sit();
				}
				else if(command.equals("5")){
				dog.bark();
				}else{
				System.out.println("Pls select command.");
				}	
			}		
		}else if(select.equals("2")){
			String command = "";	
			while(!(command.equals("n"))){	
				
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
				System.out.println("If you want to exit. Pls enter _n_\n");	
		
				Dog dog = new DogSim("John","Labrador","Children","Male","t");
	
				System.out.println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark");	
				System.out.print("Command: ");
				command = scan.nextLine();	
				if(command.equals("s")){
				main(args);	
				}	
				else if(command.equals("n")){
				System.exit(0);
				}	
				else if(command.equals("1")){
				dog.setRunBehavior(new Run());
				}	
				else if(command.equals("2")){
				dog.walk();
				}
				else if(command.equals("3")){
				dog.eat();
				}
				else if(command.equals("4")){
				dog.sit();
				}
				else if(command.equals("5")){
				dog.bark();
				}else{
				System.out.println("Pls select command.");
				}	
			}		
		}else if(select.equals("3")){
			String command = "";	
			while(!(command.equals("n"))){	
				
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
				System.out.println("If you want to exit. Pls enter _n_\n");	

				Dog dog = new DogSim("Jane","Beagle","Old","Female","f");
			
				System.out.println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark");	
				System.out.print("Command: ");
				command = scan.nextLine();	
				if(command.equals("s")){
				main(args);	
				}	
				else if(command.equals("n")){
				System.exit(0);
				}	
				else if(command.equals("1")){
				dog.setRunBehavior(new Run());
				}	
				else if(command.equals("2")){
				dog.walk();
				}
				else if(command.equals("3")){
				dog.eat();
				}
				else if(command.equals("4")){
				dog.sit();
				}
				else if(command.equals("5")){
				dog.bark();
				}else{
				System.out.println("Pls select command.");
				}	
			}		
		}else if(select.equals("4")){
			String command = "";	
			while(!(command.equals("n"))){	
				
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
				System.out.println("If you want to exit. Pls enter _n_\n");	
		
				Dog dog = new DogSim("June","Pittbull","Adult","Female","t");
	
				System.out.println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark");	
				System.out.print("Command: ");
				command = scan.nextLine();	
				if(command.equals("s")){
				main(args);	
				}	
				else if(command.equals("n")){
				System.exit(0);
				}	
				else if(command.equals("1")){
				dog.setRunBehavior(new Run());
				}	
				else if(command.equals("2")){
				dog.walk();
				}
				else if(command.equals("3")){
				dog.eat();
				}
				else if(command.equals("4")){
				dog.sit();
				}
				else if(command.equals("5")){
				dog.bark();
				}else{
				System.out.println("Pls select command.");
				}	
			}		
		}else if(select.equals("5")){	
			String command = "";	
			while(!(command.equals("n"))){	
				
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
				System.out.println("If you want to exit. Pls enter _n_\n");	
		
				Dog dog = new DogSim("Jake","Beagle","Adult","Male","f");
	
				System.out.println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark");	
				System.out.print("Command: ");
				command = scan.nextLine();	
				if(command.equals("s")){
				main(args);	
				}	
				else if(command.equals("n")){
				System.exit(0);
				}	
				else if(command.equals("1")){
				dog.setRunBehavior(new Run());
				}	
				else if(command.equals("2")){
				dog.walk();
				}
				else if(command.equals("3")){
				dog.eat();
				}
				else if(command.equals("4")){
				dog.sit();
				}
				else if(command.equals("5")){
				dog.bark();
				}else{
				System.out.println("Pls select command.");
				}	
			}		
		}else{
		System.out.println("Pls select dog from number.");
		}
	}
}
