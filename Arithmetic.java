import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int num1 = s.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = s.nextInt();
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int modulo = num1 % num2;
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " +difference);
		System.out.println("Product = " +product);
		System.out.println("Quotient = " + quotient);
		System.out.println("Modulo = " + modulo);
	}

}
