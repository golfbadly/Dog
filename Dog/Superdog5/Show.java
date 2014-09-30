import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Show{

	Dog dog;
	String select;
	String command;

	Simulator sim = new Simulator();
	
	public void Show(){
		Scanner scan = new Scanner(System.in);	

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
                        dog = new Poodle("Jame","Adult","Male","t","f");
		}else if(select.equals("2")){
                        dog = new Labrador("John","Children","Male","t","i");
                }else if(select.equals("3")){
                        dog = new Beagle("Jane","Old","Female","t","f");
                }else if(select.equals("4")){
                        dog = new Pitbull("June","Adult","Female","t","i");
                }else if(select.equals("5")){
                        dog = new Bulldog("Jake","Adult","Male","f","n");
		}else{
			println("Pls select dog from number.");
		}
	
			command = "";		
			while(!(command.equals("n"))){

                                println("\nIf you want to change dog after selection. Pls enter _s_");
                                println("If you want to exit. Pls enter _n_\n");

				if(select.equals("1")){
                        	dog = new Poodle("Jame","Adult","Male","t","f");
                		}else if(select.equals("2")){
                        	dog = new Labrador("John","Children","Male","t","i");
                		}else if(select.equals("3")){
                        	dog = new Beagle("Jane","Old","Female","t","f");
                		}else if(select.equals("4")){
                        	dog = new Pitbull("June","Adult","Female","t","i");
                		}else if(select.equals("5")){
                        	dog = new Bulldog("Jake","Adult","Male","f","n");
                		}			
	
				println("\nCommand\n1.Run\n2.Walk\n3.Eat\n4.Sit\n5.Bark\n6.Power");
				print("Command: ");
                                command = scan.nextLine();
                                
				if(command.equals("s")){
                                String[] args={};
                                sim.main(args);
                                }
                                else if(command.equals("n")){
                                System.exit(0);
                                }
                                else if(command.equals("1")){
					if(select.equals("1")||select.equals("3")){	
					println(dog.setRunBehavior(new Run()));
					}else if(select.equals("2")||select.equals("4")){
					println(dog.setRunBehavior(new Run()));	
					}else if(select.equals("5")){
					println(dog.setRunBehavior(new NoRun())); 
					}	
				}
                                else if(command.equals("2")){
                                println(dog.walk());
                                }
                                else if(command.equals("3")){
                                println(dog.eat());
                                }
                                else if(command.equals("4")){
                                println(dog.sit());
                                }
                                else if(command.equals("5")){
                                println(dog.bark());
                                }
                                else if(command.equals("6")){
                                	if(select.equals("1")||select.equals("3")){	
					println(dog.setPower(new FirePower()));
                               		}else if(select.equals("2")||select.equals("4")){
					println(dog.setPower(new IcePower()));	
					}else{
					println(dog.setPower(new NoPower()));
					} 
				}
				else{
				println("Please command");
				}	
			}
	}

	public void println(String str){
                System.out.println(str);
                textFile(str);
        }

        public void print(String str){
                System.out.print(str);
                textFile(str);
        }

        public void textFile(String data){
                try{

                File file =new File("Show.txt");

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
