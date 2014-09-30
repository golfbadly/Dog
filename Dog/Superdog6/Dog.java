public abstract class Dog{
	
	RunBehavior runBehavior;
	Power powerDog;

	public Dog(){
	}
	
	public String setRunBehavior(RunBehavior rb){
	runBehavior = rb;	
	return runBehavior.run();	
	}	
	public String setPower(Power p){
	powerDog = p;	
	return powerDog.power();
	}	
	public int setHp(Power hp){
	powerDog = hp;	
	return powerDog.hpPower();
	}	
	
	public String walk(){
	return "\nI will walk with you.";
	}
	public String eat(){
	return "\nI only eat dog food.";
	}
	public String sit(){
	return "\nI'm sitting.";
	}
	public String bark(){
	return "\nBOX BOX BOX!";
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
