package entities;

public class Rectangle {
	public static double width;
	public static double height;

	
	public static double Area() {
		return width * height;
	}
	
	public static double Perimeter() {
		return (2 * width) + (2 * height);
	}
	
	public static double Diagonal() {
		double d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return d;
	}
	
	public String toString() {
		return  "AREA: " + String.format("%.2f", Area())
				+ "\n"
				+ "PERIMETER: " + String.format("%.2f", Perimeter())
				+ "\n"
				+ "DIAGONAL: " + String.format("%.2f", Diagonal())
				; 
				
			
	}
}
