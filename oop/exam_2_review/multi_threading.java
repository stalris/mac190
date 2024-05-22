// Multithreading allows a process to create smaller, light-weight processes called threads.
// threads can be invoked by either:
// 	1) extending the Thread class
// 	2) implementing the Runnable class
//
// This is an example of extending the Thread class.
// Our custom class extends Thread and overrides the run() method.
// When a new object is created, run() is invoked by calling start() on the object.

class 토끼 extends Thread {

	// This is invoked by using the method start()
	public void run(){
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+": is running");
		}catch(Exception errorObject){
			System.out.println("Wonder how we got to this point.");
		}
	}
}

public class multi_threading {	
	public static void main(String [] args){

		// instantiate an object of the class 토끼
		토끼 rabbit = new 토끼();

		// invoke start() which in turn invokes run().
		rabbit.start();

	}
}
