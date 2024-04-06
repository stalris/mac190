import bunnies.b;
import bank.BankAccount;

public class f{
	public static void main(String[] args){
		System.out.println("hello");
		System.out.println("내슨명아");
		String hangul = "안녕하세요";

		BankAccount bunnies = new BankAccount();
		BankAccount 토끼 = new BankAccount("Usagi no Tsuki", 1, 1000.01 );
		BankAccount 고영이 = new BankAccount("Pusheen", 2, 9999.02);
		
		토끼.name();
		토끼.withdraw(2000.01);
			
		
	}
}
