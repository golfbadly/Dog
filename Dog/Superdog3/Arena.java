import java.util.Scanner;

public class Arena{
	
	Scanner scan = new Scanner(System.in);
	Simulator sim = new Simulator(); 

	String select1;
	String select2;

	Dog dog1;
	Dog dog2;

	int dogHp1;
	int dogHp2;

	int redDog;
	int blueDog;

	String attack1;	
	String attack2;
	
	public  Arena(){
	
	}
	
	public void fight(){

	select1 = "";
	while(!(select1.equals("n"))){

		System.out.println("\nIf you want to exit. Pls enter _n_");	
		System.out.println("\nGo back to main. Pls enter _s_");	
		System.out.println("\nPlease select SuperDog for fighting.");
		System.out.println("\nList: 1.Jame 2.John 3.Jane 4.June 5.Jake\n");	
		
		System.out.print("Enter RedDog: ");
		select1 = scan.nextLine();	
		
		if(select1.equals("1")){
			dog1 = new Poodle("Jame","Adult","Male","t","f");
			dogHp1 = dog1.hpPoodle();	
		}else if(select1.equals("2")){
			dog1 = new Labrador("John","Children","Male","t","i");	
			dogHp1 = dog1.hpLabrador();	
		}else if(select1.equals("3")){
                        dog1 = new Beagle("Jane","Old","Female","t","f"); 
			dogHp1 = dog1.hpBeagle();	
		}else if(select1.equals("4")){
			dog1 = new Pitbull("June","Adult","Female","t","i");	
			dogHp1 = dog1.hpPitbull();	
		}else if(select1.equals("5")){
			dog1 = new Bulldog("Jake","Adult","Male","t","n");	
			dogHp1 = dog1.hpBulldog();	
		}else if(select1.equals("n")){
			System.exit(0);		
		}else if(select1.equals("s")){
			String[] args={};
                        sim.main(args);
                } 	

	
		System.out.print("Enter BlueDog: ");
                select2 = scan.nextLine();

                if(select2.equals("1")){
                        dog2 = new Poodle("Jame","Adult","Male","t","f");
               		dogHp2 = dog2.hpPoodle(); 
		}else if(select2.equals("2")){
                        dog2 = new Labrador("John","Children","Male","t","i");
               		dogHp2 = dog2.hpLabrador(); 
		}else if(select2.equals("3")){
                        dog2 = new Beagle("Jane","Old","Female","t","f");
               		dogHp2 = dog2.hpBeagle(); 
		}else if(select2.equals("4")){
                        dog2 = new Pitbull("June","Adult","Female","t","i");
               		dogHp2 = dog2.hpPitbull(); 
		}else if(select2.equals("5")){
                        dog2 = new Bulldog("Jake","Adult","Male","t","n");
               		dogHp2 = dog2.hpBulldog(); 
		}else if(select2.equals("n")){
                        System.exit(0);
                }else if(select1.equals("s")){
                        String[] args={}; 
			sim.main(args);
                } 
	

		System.out.println("Result");
		redDog = dogHp1*dog1.powerDog.hpPower();
		blueDog = dogHp2*dog2.powerDog.hpPower();

		if(redDog > blueDog || redDog < blueDog){
	
				int damageRed = (dogHp1*dog1.powerDog.hpPower())/10;
                                int damageBlue = (dogHp2*dog2.powerDog.hpPower())/10;

                                int hpRed = (dogHp1*dog1.powerDog.hpPower())-damageBlue;
                                int hpBlue = (dogHp2*dog2.powerDog.hpPower())-damageRed;


			if(select1.equals("1") || select1.equals("3")){
			attack1 = "Fire Attack";
			}
			else if(select1.equals("2") || select1.equals("4")){
                        attack1 = "Ice Attack";
			} 
			else if(select1.equals("5")){
                        attack1 = "Bite Attack";
			} 	
	
			if(select2.equals("1") || select2.equals("3")){
                        attack2 = "Fire Attack";
                        }
                        else if(select2.equals("2") || select2.equals("4")){
                        attack2 = "Ice Attack";
                        }
                        else if(select2.equals("5")){
                        attack2 = "Bite Attack";
                        }
	
			String loop = "";	
			while(!(loop.equals("0"))){	
				hpRed = hpRed - damageBlue;
                                hpBlue = hpBlue - damageRed;

				if(hpRed < 0){
                                break;
                                }else if(hpBlue < 0){
                                break;
                                }

				System.out.println("RedDog: "+attack1+" "+damageRed+" damage. Hp: "+hpRed);
                                System.out.println("BlueDog: "+attack2+" "+damageBlue+" damage. Hp: "+hpBlue);	
			}	
			if(redDog > blueDog){	
			System.out.println("\nWinner: RedDog");
			}else if(redDog < blueDog){
			System.out.println("\nWinner: BlueDog");
			}	
		}else if(redDog == blueDog){
			System.out.println("You can't select dog duplicate.\nPlease new selection.");
		}			
	}					

	}
	
}
