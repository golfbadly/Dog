
public class Dogs{

String dogBreeds;
String dogAge;
String dogSex;
String dogDoing;

	
	public Dogs(String name){
	System.out.println("Dog name: "+name); 
	}

	public void setBreeds(String breeds){
	dogBreeds = breeds;	
	}
	public String getBreeds(){
		if(dogBreeds.equals("1")){dogBreeds = "Labrador";}
		else if(dogBreeds.equals("2")){dogBreeds = "Poodle";}	
		else if(dogBreeds.equals("3")){dogBreeds = "Bulldog";} 		
		else{dogBreeds = "Beagle";}
	System.out.println("Dog breeds: "+dogBreeds);
        return dogBreeds;	
	}

	public void setAge(String age){
	dogAge = age;
	}
	public String getAge(){
		if(dogAge.equals("1")){dogAge = "Children";}
                else if(dogAge.equals("2")){dogAge = "Adult";}
                else{dogAge = "Old";}	
	System.out.println("Dog age: "+dogAge);
	return dogAge;	
	}

	public void setSex(String sex){
        dogSex = sex;
        }
	public String getSex(){
		 if(dogSex.equals("1")){dogSex = "male";}
                else{dogSex = "female";}  
	System.out.println("Dog sex: "+dogSex);
        return dogSex;
        }

	 public void setDoing(String doing){
        dogDoing = doing;
        }

	Print p = new Print();

	public String getDoing(){
                 if(dogDoing.equals("1")){dogDoing = "I'm here.";}
                else if(dogDoing.equals("2")){dogDoing = "Hello!";}
                else if(dogDoing.equals("3")){dogDoing = "I'm crouching.";}
                else if(dogDoing.equals("4")){dogDoing = "I'm followwing.";}
                else if(dogDoing.equals("5")){dogDoing = "I'm barking.";}
                else if(dogDoing.equals("6")){dogDoing = "I'm sitting.";}
		else if(dogDoing.equals("y")){dogDoing = "Create new dog.";}	
		else{dogDoing = "Pls select commands.";} 

	System.out.println("Now! Dog: "+dogDoing);
        return dogDoing;
        }
}
