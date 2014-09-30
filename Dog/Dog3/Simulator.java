import java.util.Scanner;
public class Simulator{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	

	String select = "";	
	while(!(select.equals("1")) && !(select.equals("2")) && !(select.equals("3"))){	
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
			
			//	Dog poodle = new Poodle("Jame","Adult","Male");	
				Dog poodle = new Poodle("Jame","Adult","Male","t");	
				
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
				poodle.setRunBehavior(new Run());
				}	
				else if(command.equals("2")){
				poodle.walk();
				}
				else if(command.equals("3")){
				poodle.eat();
				}
				else if(command.equals("4")){
				poodle.sit();
				}
				else if(command.equals("5")){
				poodle.bark();
				}else{
				System.out.println("Pls select command.");
				}	
			}
		}else if(select.equals("2")){
			String command = "";          
                        while(!(command.equals("n"))){
                                
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
                                System.out.println("If you want to exit. Pls enter _n_\n");
                                
			//	Dog labrador = new Labrador("John","Children","Male"); 
				Dog labrador = new Labrador("John","Children","Male","t");	

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
                                labrador.setRunBehavior(new Run());
                                }
                                else if(command.equals("2")){
                                labrador.walk();
                                }
                                else if(command.equals("3")){
                                labrador.eat();
                                }
                                else if(command.equals("4")){
                                labrador.sit();
                                }
                                else if(command.equals("5")){
                                labrador.bark();
                                }else{
                                System.out.println("Pls select command.");
                                }
                        }
		
		}else if(select.equals("3")){
			String command = "";
                        while(!(command.equals("n"))){
                              
				System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
                                System.out.println("If you want to exit. Pls enter _n_\n");
                               	
		//		Dog beagle = new Beagle("Jane","Old","Female"); 
				Dog beagle = new Beagle("Jane","Old","Female","f");	

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
                                beagle.setRunBehavior(new Run());
                                }
                                else if(command.equals("2")){
                                beagle.walk();
                                }
                                else if(command.equals("3")){
                                beagle.eat();
                                }
                                else if(command.equals("4")){
                                beagle.sit();
                                }
                                else if(command.equals("5")){
                                beagle.bark();
                                }else{
                                System.out.println("Pls select command.");
                                }
                        }
		 }else if(select.equals("4")){
                        String command = "";
                        while(!(command.equals("n"))){
                            
                                System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
                                System.out.println("If you want to exit. Pls enter _n_\n");

                               // Dog pitbull = new Pitbull("June","Adult","Female");
                                Dog pitbull = new Pitbull("June","Adult","Female","t");

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
                                pitbull.setRunBehavior(new Run());
                                }
                                else if(command.equals("2")){
                                pitbull.walk();
                                }
                                else if(command.equals("3")){
                                pitbull.eat();
                                }
                                else if(command.equals("4")){
                                pitbull.sit();
                                }
                                else if(command.equals("5")){
                                pitbull.bark();
                                }else{
                                System.out.println("Pls select command.");
                                }
                        }

		 }else if(select.equals("5")){
                        String command = "";
                        while(!(command.equals("n"))){
                           
                                System.out.println("\nIf you want to change dog after selection. Pls enter _s_");
                                System.out.println("If you want to exit. Pls enter _n_\n");

                               // Dog bulldog = new Beagle("Jake","Old","Male");
                                Dog bulldog = new Bulldog("Jake","Adult","Male","t");

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
                                bulldog.setRunBehavior(new Run());
                                }
                                else if(command.equals("2")){
                                bulldog.walk();
                                }
                                else if(command.equals("3")){
                                bulldog.eat();
                                }
                                else if(command.equals("4")){
                                bulldog.sit();
                                }
                                else if(command.equals("5")){
                                bulldog.bark();
                                }else{
                                System.out.println("Pls select command.");
                                }
                        }

	
		}else{System.out.println("Pls select dog from number.");}
	}

			
	}
}
