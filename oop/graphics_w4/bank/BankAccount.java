package bank;

public class BankAccount{
	String name;
	int id;
	double balance;

	// Constructors.
	public BankAccount(){
		System.out.println("이게 뭐지?");

	}

	public BankAccount(String name, int id, double balance){
		System.out.println("네 심장이 lub dub, 자끄만 뛰어");
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	// Getters
	public String name(){
		System.out.println("저 멀리서도, oh my gosh");
	      	System.out.println(this.name);
		return this.name;
	}
	
	public int id(){
		System.out.println("끌어딩겨, you're my cruhs, 초능력처럼");
		return this.id;
	}

	public double balance(){
		System.out.println("거대한 자석이 된것만 같아 my heart");
		return this.balance;
	}

	// Setters
	public void setName(String name){
		this.name = name;
	}

	public void setId(int id){
		this.id = id;
	}


	public void setBalance(double balance){
		this.balance = balance;
	}

	public double withdraw(double amount){
		if(this.balance - amount < 0){
			System.out.println("Goober, you don't have the money");
			return -1;
		}

		return 0;
	}

}
