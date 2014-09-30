public abstract class Dog{
	
	RunBehavior runBehavior;
	Power powerDog;

	public Dog(){
	}
	public void setRunBehavior(RunBehavior rb){
	runBehavior.run();	
	runBehavior = rb;	
	}	
	public void setPower(Power p){
	powerDog.power();
	powerDog = p;
	}	
	public void setHp(Power hp){
	powerDog.hpPower();
	powerDog = hp;
	}	
	public void walk(){
	System.out.println("I will walk with you.");
	}
	public void eat(){
	System.out.println("I only eat dog food.");
	}
	public void sit(){
	System.out.println("I'm sitting.");
	}
	public void bark(){
	System.out.println("BOX BOX BOX!");
	}
	
	public int hpPoodle(){
		return 1000;
	}
	public int hpLabrador(){
                return 1600;
        }
	public int hpBeagle(){
                return 1300;
        }
	public int hpPitbull(){
                return 1700;
        }
	public int hpBulldog(){
                return 1400;
        }

}
