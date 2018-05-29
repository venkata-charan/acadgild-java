package intro_to_java;

import java.util.Scanner;

public class BitAndLogicalAnd {

	public static void main(String[] args) {

		Byte a = 0, b = 0;

		boolean left, right;

		Scanner in = new Scanner(System.in);
		System.out.println("enter first number");
		a = in.nextByte();
		System.out.println("enter second number");
		b = in.nextByte();

		if (a > 0)
			left = true;
		else
			left = false;

		if (b > 0)
			right = true;
		else
			right = false;

		System.out.println("Bitwise And of a- " + a + "and b - " + b + " is " + (a & b));
		System.out.println("Logical And of a- " + a + "and b - " + b + " is " + (left && right));
		in.close();
	}

}
