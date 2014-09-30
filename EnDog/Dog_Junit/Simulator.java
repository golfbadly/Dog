import java.util.Scanner;

public class Simulator{

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		Make make = new Make();
		Arena arena = new Arena();
	
		String s = "";	
		while(!(s.equals("q"))){
		System.out.println("Play with dog. Enter _s_\nGo to arena. Enter _a_\nExit. Enter _q_");			
		System.out.print("Enter: ");	
		s = scan.nextLine();
		if(s.equals("s")){	
		make.create();
		}else if(s.equals("a")){
		arena.selectDog();
		}else if(s.equals("q")){
		System.exit(0);
		}else{
		System.out.println("Please new select.");
		}	
		}	
	}

}
