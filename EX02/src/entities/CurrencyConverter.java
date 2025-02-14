package entities;

public class CurrencyConverter {
		public static double dollar, real;
		
		public static double Converter() {
			double iof = dollar * real * 0.06;
			return iof + dollar * real;
		}
}
