package Bank_Gui;

import java.util.Scanner;

public class bank {
	Scanner scan = new Scanner(System.in);
	private double amount; 
	private String name;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double deposit(double dep) {
		this.amount += dep;
		return amount;
	}
	
	public double withdrawal(double with) {
		this.amount -= with;
		return amount;
	}
	
	public void simpleInterest() {
	/*
	 * this function shows how the set interest rate of the user's bank 
	 * affects their account
	 */
		System.out.println("hello " + this.name + " would you like see how"
				+ " interest will affect your account?");
		try {
			String response = scan.next();
			if(response.equalsIgnoreCase("yes")) {
				findAmount();
			}
		}
		catch(NumberFormatException e) {
			System.out.println("A number was entered...Try again");
		}
	}
	
	public void findAmount() {
		/*
		 *  this function branches of from the simple interest function
		 *  in order to prevent simpleInterest from becoming to long
		 */
		try {
			System.out.println("how many years would you like to view out?");
			int years = scan.nextInt();
			System.out.println("what is your bank's set interest rate?");
			double rate = scan.nextDouble();
			rate /= 100;
			amount += (amount * rate * years);
			System.out.println(name + " your amount in " + years + " years will be " + amount);
		}
		catch(NumberFormatException e) {
			System.out.println("A letter was entered...Try again");
		}
	}
	
	public bank(double amt) {
		/*
		 * creation of constructor that takes in original amount as parameter
		 */
		this.amount = amt;
	}
	
	public bank() {
		/*
		 * creation of blank constructor
		 */
	}
}
