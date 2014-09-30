public abstract class Dog{
	
	RunBehavior runBehavior;

	public Dog(){
	}
	public void setRunBehavior(RunBehavior rb){
	runBehavior.run();	
	runBehavior = rb;	
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
	
}
