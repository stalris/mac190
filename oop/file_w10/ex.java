import java.io.File;
import java.util.Scanner;
public class ex {
	public static void main(String [] args){
		try{
			System.out.println("hello");
			File f = new File("ditto.txt");
			Scanner s = new Scanner(f);
			System.out.println(s.nextLine());
		}catch(Exception e){}
	}
}
