public class Beagle extends Dog{
	
	String dogName;
	String dogAge;
	String dogSex;
	String dogStatus;
	String dogPower;
	
	String pow;
	int powhp;

	public Beagle(String name, String age, String sex, String status, String power){

	//	runBehavior = new Run();

                this.dogName = name;
                this.dogAge = age;
                this.dogSex = sex;
              	this.dogStatus = status;
		this.dogPower = power;

		if(dogStatus.equals("t")){
                runBehavior = new Run();
                }else if(dogStatus.equals("f")){
                runBehavior = new NoRun();
                }

		 if(dogPower.equals("n")){
                powerDog = new NoPower();
                }else if(dogPower.equals("f")){
                powerDog = new FirePower();
                }else if(dogPower.equals("i")){
                powerDog = new IcePower();
                }

                if(dogPower.equals("n")){
                pow = "Bite";
                powhp = hpBeagle()*(powerDog.hpPower());
                }else if(dogPower.equals("f")){
                pow = "Fire";
                powhp = hpBeagle()*(powerDog.hpPower());
                }else if(dogPower.equals("i")){
                pow = "Ice";
                powhp = hpBeagle()*(powerDog.hpPower());
                }

		println(dogName+" Beagle "+dogAge+" "+dogSex+" "+pow+" "+powhp);

        }
	 public void println(String str){
                System.out.println(str);
                Text text = new Text();
                text.textShow(str);
                text.textArena(str);
        }

}
