import java.io.*;

import java.util.Scanner;
public class Simulator{

	public void Simulator(){
        }

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);	

	String select = "";	
	while(!(select.equals("1")) && !(select.equals("2")) && !(select.equals("3"))){	
		println("\nIf you want to exit. Pls enter _n_\n");	
		println("Go to Arena. Pls enter _a_\n");
	
		println("List: 1.Jame 2.John 3.Jane 4.June 5.Jake\n");	
		print("Select dog: ");	
		select = scan.nextLine();
	
		if(select.equals("n")){
		System.exit(0);	
		}else if(select.equals("a")){
		Arena a = new Arena();
		a.fight();	
		}else if(select.equals("1")){
			String command = "";	
			while(!(command.equals("n"))){	
				
				println("\nIf you want to change dog after selection. Pls enter _s_");
				println("If you want to exit. Pls enter _n_\n");	
			
			//	Dog poodle = new Poodle("Jame","Adult","Male");	
				Dog poodle = new Poodle("Jame","Adult","Male","t","f");	
				
				println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark\n6.Power");	
				print("Command: ");
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
				}
				else if(command.equals("6")){
				poodle.setPower(new NoPower());
				}
				else{
				println("Pls select command.");
				}	
			}
		}else if(select.equals("2")){
			String command = "";          
                        while(!(command.equals("n"))){
                                
				println("\nIf you want to change dog after selection. Pls enter _s_");
                                println("If you want to exit. Pls enter _n_\n");
                                
			//	Dog labrador = new Labrador("John","Children","Male"); 
				Dog labrador = new Labrador("John","Children","Male","t","i");	

				println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark\n6.Power");
                                print("Command: ");
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
                                }
				else if(command.equals("6")){
                               	labrador.setPower(new NoPower());
				}
				else{ 
				println("Pls select command.");
                                }
                        }
		
		}else if(select.equals("3")){
			String command = "";
                        while(!(command.equals("n"))){
                              
				println("\nIf you want to change dog after selection. Pls enter _s_");
                                println("If you want to exit. Pls enter _n_\n");
                               	
		//		Dog beagle = new Beagle("Jane","Old","Female"); 
				Dog beagle = new Beagle("Jane","Old","Female","t","f");	

				println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark\n6.Power");
                                print("Command: ");
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
                                }
				else if(command.equals("6")){
                                beagle.setPower(new NoPower());
                                }
				else{
                                println("Pls select command.");
                                }
                        }
		 }else if(select.equals("4")){
                        String command = "";
                        while(!(command.equals("n"))){
                            
                                println("\nIf you want to change dog after selection. Pls enter _s_");
                                println("If you want to exit. Pls enter _n_\n");

                               // Dog pitbull = new Pitbull("June","Adult","Female");
                                Dog pitbull = new Pitbull("June","Adult","Female","t","i");

				println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark\n6.Power");
                                print("Command: ");
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
                                } 
				else if(command.equals("6")){
                                pitbull.setPower(new NoPower());
                                }
				else{
                                println("Pls select command.");
                                }
                        }

		 }else if(select.equals("5")){
                        String command = "";
                        while(!(command.equals("n"))){
                           
                                println("\nIf you want to change dog after selection. Pls enter _s_");
                                println("If you want to exit. Pls enter _n_\n");

                               // Dog bulldog = new Beagle("Jake","Old","Male");
                                Dog bulldog = new Bulldog("Jake","Adult","Male","t","n");

				println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark\n6.Power");
                                print("Command: ");
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
                                }
				else if(command.equals("6")){
                                bulldog.setPower(new NoPower());
                                }
				else{
                                println("Pls select command.");
                                }
                        }

	
		}else{println("Pls select dog from number.");}
	}

			
	}

	public static void println(String str){
                System.out.println(str);
                textFile(str);
        }

        public static void print(String str){
                System.out.print(str);
                textFile(str);
        }

        public static void textFile(String data){
                try{

                File file =new File("appendfile.txt");

                if(!file.exists()){
                        file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(file.getName(),true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.close();

                }catch(IOException e){
                e.printStackTrace();
                }
        }      
}
