public class NoPower implements Power{
	public void power(){
		System.out.println("I'm not have power but I can bite.");
	}
	public int hpPower(){
		return 1;	
	}
}
