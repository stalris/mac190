// example of using throws. 
// throws is only used for checked exceptions
// throws is declared in the method signature
// throws implies that the caller, that is whoever is using(calling) the method, has to handle the exception being thrown.
// the caller can handle it by using a try/catch block or by also throwing the exception themselves

import java.io.IOException;

public class exception_3{
	
	// A method that can throw IOException. Must use the package IOException.
	static void check ()throws IOException{
		throw new IOException("귀신");
	}

	public static void main(String [] args){
		try{
			// check will throw an exception that must be handled.
			check();
		}catch(IOException error){ // Exception handler right here.

			System.out.println("inside the catch block");
			System.out.println(error.getMessage());
		}
	}
}
