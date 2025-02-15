package application;

import java.util.Scanner;
import entities.Account;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acct = new Account();
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		char value;

		//estrutura de repetição para impedir a entrada de qualquer dado que não seja
		// 'y' ou 'n'
		
		do {
			System.out.print("Is there an initial deposit value? (y/n): ");
			value = sc.next().charAt(0);
		} while (value != 'y' && value != 'n');

		if (value == 'y') {
			System.out.println("Enter intial deposit value: ");
			double balance = sc.nextDouble();
			acct = new Account(number, name, balance);
			System.out.println("Updated account data: " + acct.toString());

		} else if (value == 'n') {
			acct = new Account(number, name);
			System.out.println(acct.toString());

		}
		
		System.out.print("Enter a deposit value: ");
		double balance = sc.nextDouble();
		acct.Deposit(balance);
		System.out.println("Updated account data: " + acct.toString());
		System.out.print("Enter a widthdraw value: ");
		double newBalance = sc.nextDouble();
		acct.Widthdraw(newBalance);
		System.out.print("Updated account data: " + acct.toString());

		sc.close();

	}

}
