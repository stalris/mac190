import frame.frame_class;
import java.util.Scanner;

public class draw{
	
	draw(){
		System.out.println("안녕하새요");
	}

	public static void main(String [] args){
		// calls the constructor from this class.
		new draw();
	
		// grab length of triangles. Don't do any input validation for now.
		System.out.println("안영하새요, enter length of triangles: ");
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();

		// Creates a new object;
		new frame_class(l);
	}
}
