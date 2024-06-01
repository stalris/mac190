import java.io.File;
import java.util.Scanner;


public class f_io {
	
	public static void main(String [] args){
		try{
		File lyrics = new File("Ditto.txt");
		Scanner input = new Scanner(lyrics);
		while(input.hasNextLine()){
			System.out.println(input.nextLine());
		}
		input.append("hello");
		}catch(Exception error){
			"T_T"
		}
		
	}
} 
