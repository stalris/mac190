package bankAccount;

public class bunnies{
	private String name;
	private int id;
	private double balance;
	private int t_count;

	// default constructor
	public bunnies(){
		System.out.println("hello");
	}
	// 3-param constructor
	public bunnies(String name, int id, double balance){
		System.out.println("안녕하새요");
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	// getters 
	public String get_name(){
		return this.name;
	}
	public int get_id(){
		return this.id;
	}
	public double get_balance(){
		return this.balance;
	}
	public int get_t_count(){
		return this.t_count;
	}
	// setters
	public void set_name(String name){
		this.name = name;
	}
	public void set_id(int id){
		this.id = id;
	}
	public void set_balance(double balance){
		if(balance < 0 || balance > 20000){
			System.out.println("invalid deposit amount");
			return;
		}
		this.balance = balance;
	}
	public void set_t_count(int t_count){
		if(t_count < 0){
			System.out.println("미안해");
			return;
		}
		this.t_count = t_count;
	}

	// Deposit 
	public void deposit(double cash_money){
		this.balance += cash_money;
		this.t_count++;
	}
	// withdraw
	public void withdraw(double cash_money){
		if (cash_money > this.balance){
			System.out.println("no monies");
			return;
		}
		System.out.println("here's your receipt. Beep Boop.");
		this.balance -= cash_money;
		this.t_count++;
	}
}

