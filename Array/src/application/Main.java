package application;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos dados serão inseridos: ");
		int limit = sc.nextInt();
		System.out.println("Insira os dados: ");
		
		int[] vect = new int[limit];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(vect));
		
		System.out.println("Insira a posição do dado a ser exibida: ");
		int position = sc.nextInt();
		position -= 1;
		System.out.println("Dado na posição " 
							+ (position + 1) + 
							": " 
							+ vect[position]);
		
		sc.close();
	}

}
