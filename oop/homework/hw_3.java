import bankAccount.bunnies;

// duplicate class, ignore. 
class bankAccount{
	private String name;
	private int id;
	private double balance;
	private int t_count;

	// default constructor
	bankAccount(){
		System.out.println("hello");
	}
	// 3-param constructor
	bankAccount(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	// getters 
	String get_name(){
		return this.name;
	}
	int get_id(){
		return this.id;
	}
	double get_balance(){
		return this.balance;
	}
	int get_t_count(){
		return this.t_count;
	}
	// setters
	void set_name(String name){
		this.name = name;
	}
	void set_id(int id){
		this.id = id;
	}
	void set_balance(double balance){
		if(balance < 0 || balance > 20000){
			System.out.println("invalid deposit amount");
			return;
		}
		this.balance = balance;
	}
	void set_t_count(int t_count){
		if(t_count < 0){
			System.out.println("미안해");
			return;
		}
		this.t_count = t_count;
	}

	// Deposit 
	void deposit(double cash_money){
		this.balance += cash_money;
		this.t_count++;
	}
	// withdraw
	void withdraw(double cash_money){
		if (cash_money > this.balance){
			System.out.println("no monies");
			return;
		}
		System.out.println("here's your receipt. Beep Boop.");
		this.balance -= cash_money;
		this.t_count++;
	}
}

public class hw_3{

	//public class bankAccount{
	//	bankAccount(){
	//		System.out.println("만나서 반가워");
	//	}
	//}
	public static void main(String [] args){
		System.out.println("아녕하새여");
		bankAccount b = new bankAccount();
		bankAccount a = new bankAccount("Juniper", 01, 10000);

		// testing
		a.set_name("Amaryllis");
		String huh = a.get_name();
		System.out.println(huh);
		a.set_balance(-1);
		a.withdraw(10000);
		a.withdraw(1);
		a.set_t_count(-1);
		a.set_t_count(1);
		
		// testing the package.
		bunnies 토끼 = new bunnies("Juniper", 01, 10000);
		System.out.println(토끼.get_name());
	}
}
