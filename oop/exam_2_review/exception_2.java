// Examples of using throw. It implies that the exception will be handled by someone else.
// if the exception is not being thrown then it must be handled by a try/catch block.

public class exception_2{
	public static void main(String [] args){

		try{
			throw new NullPointerException("null thingy");
		}catch(NullPointerException error_object){

			System.out.println("Inside the catch block!");
			System.out.println(error_object.getMessage());
		}finally{ // an optional block that always runs whether or not an exception is thrown.
			System.out.println("hello from finally");
		}
	}
}
