package entities;

public class Account {
	private int number;
	private String name;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int number, String name, double balance){
		this.number = number;
		this.name = name;
		Deposit(balance);
	}
	
	public Account(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	public int getNumber(){
		return number;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getBalance(){
		return balance;
	}

	public void Deposit(double deposit){
		balance += + deposit;
	}

	public void Widthdraw(double newBalance){
		balance -= newBalance + 5;
	}
	
	public String toString() {
		return "Account " 
	+ number 
	+ ", Holder: "
	+ name 
	+ ", Balance: " 
	+ String.format("%.2f", balance);
	}

}
