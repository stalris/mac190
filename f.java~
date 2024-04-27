import bunnies.b;
import bank.BankAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class f{
	public static void main(String[] args){
		// System.out.println("hello");
		// System.out.println("내슨명아");
		// String hangul = "안녕하세요";

		// BankAccount bunnies = new BankAccount();
		// BankAccount 토끼 = new BankAccount("Tsuki no Usagi", 1, 1000.01 );
		// BankAccount 고영이 = new BankAccount("Pusheen", 2, 9999.02);
		// 
		// 토끼.name();
		// 토끼.withdraw(2000.01);
		

		// This also works, but looks ugyl.
		// String lyrics = System.getProperty("user.dir") + "\\ditto.txt";
		String lyrics = "ditto.txt";
		File f = new File(lyrics);
		try{
			Scanner ditto = new Scanner(f);
			Map<String, String> words = new HashMap<String, String>();
			words.put("dog", "yes");
			words.put("dog", "no");
			System.out.println(words.get("dog"));
			while(ditto.hasNext()){
				String word = ditto.next();
				System.out.println(word);
			} 
		}catch(FileNotFoundException error){ // Its not healthy to "squash" errors like this, idk how to properly handle it tho.

		}
		
	}
}
