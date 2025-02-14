package application;
import java.util.Scanner;
import entities.Rectangle;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle string = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		Rectangle.width = sc.nextDouble();
		Rectangle.height = sc.nextDouble();
		
		System.out.println(string.toString()); 
		
		
		sc.close();
	}
}
