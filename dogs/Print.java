import java.util.Scanner;

public class Print{
	public static void main(String []args){
	
	Scanner scan = new Scanner (System.in);
        
	System.out.print ("Enter name of Dog1: ");
        String name = scan.nextLine();
	Dogs Dog = new Dogs(name);

        System.out.print ("Enter name of Dog2: ");
        String name2 = scan.nextLine();
        Dogs Dog2 = new Dogs(name2);

	 System.out.print ("Enter name of Dog3: ");
        String name3 = scan.nextLine();
        Dogs Dog3 = new Dogs(name3);

	 System.out.print ("Enter name of Dog4: ");
        String name4 = scan.nextLine();
        Dogs Dog4 = new Dogs(name4);

	 System.out.print ("Enter name of Dog5: ");
        String name5 = scan.nextLine();
        Dogs Dog5 = new Dogs(name5);

	 System.out.print ("Enter name of Dog6: ");
        String name6 = scan.nextLine();
        Dogs Dog6 = new Dogs(name6);

	System.out.print ("Enter name of Dog7: ");
        String name7 = scan.nextLine();
        Dogs Dog7 = new Dogs(name7);

	 System.out.print ("Enter name of Dog8: ");
        String name8 = scan.nextLine();
        Dogs Dog8 = new Dogs(name8);

	 System.out.print ("Enter name of Dog9: ");
        String name9 = scan.nextLine();
        Dogs Dog9 = new Dogs(name9);

	 System.out.print ("Enter name of Dog10: ");
        String name10 = scan.nextLine();
        Dogs Dog10 = new Dogs(name10);


	System.out.println("Dog names\n1."+name+"\n2."+name2+"\n3."+name3+"\n4."+name4+"\n5."+name5+"\n6."+name6+"\n7."+name7+
	"\n8."+name8+"\n9."+name9+"\n10."+name10);

	System.out.print("Select dog: ");
	String select = scan.nextLine();	
		if(select.equals("1")){System.out.println("Hello! I'm "+name);}
		else if(select.equals("2")){System.out.println("Hello! I'm "+name2);}
		else if(select.equals("3")){System.out.println("Hello! I'm "+name3);}
		else if(select.equals("4")){System.out.println("Hello! I'm "+name4);}
		else if(select.equals("5")){System.out.println("Hello! I'm "+name5);}
		else if(select.equals("6")){System.out.println("Hello! I'm "+name6);}
		else if(select.equals("7")){System.out.println("Hello! I'm "+name7);}
		else if(select.equals("8")){System.out.println("Hello! I'm "+name8);}
		else if(select.equals("9")){System.out.println("Hello! I'm "+name9);}
		else if(select.equals("10")){System.out.println("Hello! I'm "+name10);}
		else{System.out.println("Pls Select name.");}

/////////////////////////////////////////////////////////
        
/*	System.out.println("List of breeds.\n1.Labrador\n2.Poodle\n3.Bulldog\n4.Beagle");
        System.out.print ("Enter breed of Dog: ");
        String breed = scan.nextLine();
        Dog.setBreeds(breed);
        Dog.getBreeds();

        System.out.println("List of ages.\n1.Children\n2.Adult\n3.Old");
        System.out.print("Enter age of Dog: ");
        String age = scan.nextLine();
        Dog.setAge(age);
        Dog.getAge();

	System.out.println("Sex.\n1.Male\n2.Female");
        System.out.print("Enter sex of Dog: ");
        String sex = scan.nextLine();
        Dog.setSex(sex);
        Dog.getSex();

*/
	String command = "";
                
			while(!(command.equals("n"))){
                 	System.out.println("Choose command.\n1.Come here!\n2.Saluting!\n3.Crouch!\n4.Follow\n5.Bark\n6.Sit");
                 	System.out.println("If you want to have new dog. Pls enter _y_");	
			System.out.println("If you want to select dog. Pls enter _s_");	
			System.out.println("If you want to exit. Pls enter _n_");
                 	System.out.print("Enter command: ");
                 	command = scan.nextLine();
                 	Dog.setDoing(command);
                 	Dog.getDoing();
				if(command.equals("y")){
				main(args);	
				}else if(command.equals("s")){
					 System.out.println("Dog names\n1."+name+"\n2."+name2+"\n3."+name3+"\n4."+name4+"\n5."+name5+
						"\n6."+name6+"\n7."+name7+"\n8."+name8+"\n9."+name9+"\n10."+name10);

        				System.out.print("Select dog: ");
        				String select2 = scan.nextLine();
                				if(select2.equals("1")){System.out.println("Hello! I'm "+name);}
                				else if(select2.equals("2")){System.out.println("Hello! I'm "+name2);}
                				else if(select2.equals("3")){System.out.println("Hello! I'm "+name3);}
                				else if(select2.equals("4")){System.out.println("Hello! I'm "+name4);}
                				else if(select2.equals("5")){System.out.println("Hello! I'm "+name5);}
                				else if(select2.equals("6")){System.out.println("Hello! I'm "+name6);}
                				else if(select2.equals("7")){System.out.println("Hello! I'm "+name7);}
                				else if(select2.equals("8")){System.out.println("Hello! I'm "+name8);}
                				else if(select2.equals("9")){System.out.println("Hello! I'm "+name9);}
                				else if(select2.equals("10")){System.out.println("Hello! I'm "+name10);}
                				else{System.out.println("Pls Select name.");}
				
				}else if(command.equals("n")){
				System.exit(0);
				}	
			}
		
	}
}
