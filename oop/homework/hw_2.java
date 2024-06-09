public class hw_2{
	public static void main(String [] args){
		String 아녕하새요;

		// run this game for the first two numbers.
		for(int i = 0; i < 20; i++){
			
			// clear the buffer
			아녕하새요 = "";
			// If multiple then add to the buffer.
			if(i % 5 == 0)
				아녕하새요 += "Fizz";
			if(i % 3 == 0)
				아녕하새요 += "Buzz";
			System.out.println(String.format("%d: %s", i,아녕하새요));

		}
	}
}
