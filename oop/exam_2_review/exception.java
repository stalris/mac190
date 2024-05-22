// This will not compile. The first handler catches all exceptions, including ArithmeticException. Therefore the second handler is never reached.
// Compilation error if you try to compile it.
//
public class exception {
	public static void main(String [] args){
		try{
			int [] numbers = {10, 24, 3005};
		}catch(Exception error){
			System.out.println("yo, what the heck?");
		}catch(ArithmeticException a){

		}
	}
}
