package tr.org.linux.kamp.account;

public class Account {

	private String name;
	private double balance;
	
	public Account(String name, double blance) {
		this.name=name;
		
		if(balance>0.0) {
			this.balance=balance;
		}
	
	}
	public Account(String name) {
		this.name=name;
	
	}
	
	
	public Account() {
		
	}
	public void deposit(double depositAccount) {
		if(depositAccount> 0.0) {
			balance=balance+depositAccount;
		}
	
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
