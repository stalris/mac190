// Multithreading allows a process to create smaller, light-weight processes called threads.
// Threads can be invoked by either:
// 	1) extending the Thread class
// 	2) implementing the Runnable class
//
// This is an example of implementing the Runnable class.

class 날개 implements Runnable{
	public void run(){
		try {
			System.out.println("진홍색 날개로 나는 날아간다");
		}catch(Exception e){
			System.out.println("Surely we'll never reach this block, jajaja");
		}
	}
}

class multi_threading_2 {
	public static void main(String [] args){

		// In this example a new thread is created by passing Thread an object that implemented the Runnable class.
		// In this case 날개 is the class that implements the Runnable class and alhaitham is an instant(object) of that class.
		// pass Thread this object
		
		날개 alhaitham = new 날개();
		Thread Rukkhadevata = new Thread(alhaitham);
		Rukkhadevata.start();
	}
}
