package intro_to_java;

import java.util.Scanner;

public class AddWithOutPlus {

	public static void main(String[] args) {
		int a = 0, b = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("enter first number");
		a = in.nextInt();
		System.out.println("enter second number");
		b = in.nextInt();
		System.out.println("sum of a- " + a + "and b - " + b + " is " + add_No_Plus(a, b));
	}

	public static int add_No_Plus(int a, int b) {

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

}
