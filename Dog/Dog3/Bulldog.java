public class Bulldog extends Dog{
	
	String dogName;
	String dogAge;
	String dogSex;
	String dogStatus;

	public Bulldog(String name, String age, String sex, String status){
		
//		runBehavior = new Run();

		this.dogName = name;
		this.dogAge = age;
		this.dogSex = sex;
		this.dogStatus = status;

		if(dogStatus.equals("t")){
                runBehavior = new Run();
                }else if(dogStatus.equals("f")){
                runBehavior = new NoRun();
                }
	

		System.out.println(dogName+" Bulldog "+dogAge+" "+dogSex);	
	}
}
