import java.io.*;

public class Text{
	 
	public Text(){
	}
		
	public void textShow(String data){
                try{

                File file =new File("Show.txt");

                if(!file.exists()){
                        file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(file.getName(),true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.newLine();
                bufferWritter.close();

                }catch(IOException e){
                e.printStackTrace();
                }
        }     

	public void textArena(String data){
                try{

                File file =new File("Arena.txt");

                if(!file.exists()){
                        file.createNewFile();
                }

                FileWriter fileWritter = new FileWriter(file.getName(),true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.newLine();
                bufferWritter.close();

                }catch(IOException e){
                e.printStackTrace();
                }
        }

}
