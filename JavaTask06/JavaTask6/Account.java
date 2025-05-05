package JavaTask6;

public class Account {

	static int accountNumber;
	static double balance;

	public Account() { // No-argument constructor (default values)
		this.accountNumber = 0;
		this.balance = 0;

	}

	public Account(int accountNumber, double balance) { // Parameterized constructor
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public void deposit(double amount) { // // Method to deposit amount
		if (amount > 0) {

			balance += amount;
			System.out.println("Deposited Amount :: " + amount);
		} else {
			System.out.println("Invalid deposited amount");
		}

	}

	public void withdraw(double amount) { // // Method to withdraw amount

		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn :: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}

	}

	public void checkBalance() { // // Method to check balance

		System.out.println("Account Number :: " + accountNumber);
		System.out.println("Current Balance is ::" + balance);

	}

	public static void main(String[] args) {     
		Account acc1 = new Account();
		acc1.checkBalance();
		acc1.withdraw(1000);
		acc1.deposit(25000);
		acc1.checkBalance();

		Account acc2 = new Account(44550081, 50000);
		acc2.checkBalance();
		acc2.withdraw(15000);
		acc2.deposit(4500);
		acc2.checkBalance();
	}

}