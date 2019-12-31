package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("End of Program");

	}

	public static void method1() {
		System.out.println("*** METHOD 1 STARTS ***");
		method2();
		System.out.println("*** METHOD 1 ENDS ***");

	}

	public static void method2() {
		System.out.println("*** METHOD 2 STARTS ***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println("Name for position " + position + " is " + vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();

		} catch (InputMismatchException e) {

			System.out.println("Input Error");
		}

		System.out.println("*** METHOD 2 ENDS ***");
		sc.close();

	}

}
