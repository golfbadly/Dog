import java.lang.*;

public class DogThread extends Thread{
	
	private Thread t;
       	private String d; 
	private String d1;
	private String d2;
	private String d3;
	private String d4;
	private String d5;

       	public void run(){
       		
	        DogSim dog1 = new DogSim();
                DogSim dog2 = new DogSim();
                DogSim dog3 = new DogSim();
                DogSim dog4 = new DogSim();
                DogSim dog5 = new DogSim();
		
       		d1 = "1."+ 
                dog1.dogName("Jame")+" "+
                dog1.dogBreeds("Poodle")+" "+
                dog1.dogAge("Adult")+" "+
                dog1.dogSex("Male")+" "+
                dog1.dogBlood(1000)+" "+
               	dog1.dogPower("f") 
		;
 
                d2 = "2."+
                dog2.dogName("John")+" "+
                dog2.dogBreeds("Labrador")+" "+
                dog2.dogAge("Children")+" "+
                dog2.dogSex("Male")+" "+
                dog2.dogBlood(1600)+" "+
                dog2.dogPower("i")
                ;

                d3 = "3."+
                dog3.dogName("Jane")+" "+
                dog3.dogBreeds("Beagle")+" "+
                dog3.dogAge("Adult")+" "+
                dog3.dogSex("Female")+" "+
                dog3.dogBlood(1300)+" "+
                dog3.dogPower("f")
                ;

                d4 = "4."+
                dog4.dogName("June")+" "+
                dog4.dogBreeds("Pitbull")+" "+
                dog4.dogAge("Adult")+" "+
                dog4.dogSex("Male")+" "+
                dog4.dogBlood(1700)+" "+
                dog4.dogPower("i")
                ;

                d5 = "5."+
                dog5.dogName("Jake")+" "+
                dog5.dogBreeds("Bulldog")+" "+
                dog5.dogAge("Old")+" "+
                dog5.dogSex("Male")+" "+
                dog5.dogBlood(1400)+" "+
                dog5.dogPower("n")
                ;	 

		for (int i = 1; i < 6; i++) {
			if(i == 1){
         		d = d1;
         		}else if(i==2){
			d = d2;
			}else if(i==3){
                        d = d3;
                        }else if(i==4){
                        d = d4;
                        }else if(i==5){
                        d = d5;
                        }
		System.out.println(d);

	
		/*	try {
            			Thread.sleep(4000);
			} catch (Exception e){
			}
           	*/	
      		}
	
	}

}
