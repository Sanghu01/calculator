import java.util.*;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// Stores two numbers
		double num1, num2;

		//  input from the user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		num1 = sc.nextDouble();
		System.out.println("Enter the second number:");
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/):");

		char operator = sc.next().charAt(0);
		double res = 0;

		switch (operator) {
			// add
			case '+':
				res = num1 + num2;
				break;

			// subtract
			case '-':
				res = num1 - num2;
				break;

			// multiply
			case '*':
				res = num1 * num2;
				break;

			// divide
			case '/':
			if (num2!=0) {
				res = num1 / num2;
			} else{
				System.out.println("error:divison by zero");
				System.exit(0);
			}
			break;
			
		

			default:
				System.out.println("You enter wrong input");
		}

		System.out.println("The final result is:");
		System.out.println();

		// final result
		System.out.println(num1 + " " + operator + " " + num2
				+ " = " + res);
	}
}
