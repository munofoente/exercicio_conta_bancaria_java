package application;
import java.util.Scanner;
import java.util.Arrays;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar?: ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = sc.nextInt();
		}
		System.out.println("Valores: " + Arrays.toString(array));
		
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			avg = sum / n;
		}
		System.out.println("Soma: " + sum);
		System.out.println("Média: " + avg);
		
		
		sc.close();
	}

}
