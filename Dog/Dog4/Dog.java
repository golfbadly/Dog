public abstract class Dog{
	
	RunBehavior runBehavior;

	public Dog(){
	}
	public void setRunBehavior(RunBehavior rb){
	runBehavior.run();	
	runBehavior = rb;	
	}	
	public void walk(){
	System.out.println("---------------------------");	
	System.out.println("I will walk with you.");
	System.out.println("---------------------------");
	}
	public void eat(){
	System.out.println("---------------------------");
	System.out.println("I only eat dog food.");
	System.out.println("---------------------------");
	}
	public void sit(){	
	System.out.println("---------------------------");
	System.out.println("I'm sitting.");
	System.out.println("---------------------------");
	}
	public void bark(){
	System.out.println("---------------------------");
	System.out.println("BOX BOX BOX!");
	System.out.println("---------------------------");
	}
	
}
