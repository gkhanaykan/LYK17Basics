package tr.org.linux.kamp.account;

public class AccountApplication {

	public static void main(String[] args) {
		
		Account myAccount1= new Account();
		Account myAccount2= new Account("Yavuz Çetin",500);
		Account myAccount3= new Account("Jie Morison");
		
		myAccount3.deposit(3000);
		System.out.println(myAccount3.getBalance());
		myAccount1.setName("Kerim Çaplı");
		System.out.println(myAccount1.getName());
		System.out.println(myAccount2.getName());
		
	}

}
