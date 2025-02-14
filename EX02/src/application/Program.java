package application;
import java.util.Scanner;
import entities.CurrencyConverter;
	

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar cost: ");
		CurrencyConverter.dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought?: ");
		CurrencyConverter.real = sc.nextDouble();
		System.out.printf("Amount paid in reais: %.2f", CurrencyConverter.Converter());
		
		sc.close();
	}

}
