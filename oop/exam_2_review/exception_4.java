// creating a user-defined exception object.
//
class myException extends Exception{

	// Constructor for this class.
	myException(String message){
		// call the constructor for Exception and pass 'message' as an argument
		super(message);
	}
}

public class exception_4 {

	public static void main(String [] args){
		try{
			throw new myException("yo");
		}catch(myException error){
			System.out.println("inside the catch block");
			System.out.println(error.getMessage());
		}
		
	}
}
