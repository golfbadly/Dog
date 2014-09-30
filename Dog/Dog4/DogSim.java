public class DogSim extends Dog{

	String dogBreeds;
	String dogName;
        String dogAge;
        String dogSex;
	String dogStatus;

        public DogSim(String name, String breeds, String age, String sex, String status){

           //     runBehavior = new Run();

                this.dogName = name;
               	this.dogBreeds = breeds; 
		this.dogAge = age;
                this.dogSex = sex;
                this.dogStatus = status; 

		if(dogStatus.equals("t")){
		runBehavior = new Run();	
		}else if(dogStatus.equals("f")){
		runBehavior = new NoRun();
		}	
		System.out.println("------------------------------------------");	
		System.out.println(dogName+" "+dogBreeds+" "+dogAge+" "+dogSex);
		System.out.println("------------------------------------------");
	
	}

}
