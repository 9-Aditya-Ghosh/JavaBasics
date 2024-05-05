package _04_if.src;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

		/*
		 * Take three numbers from the user and print the greatest number. Go to the
		 * editor
		 * Test Data
		 * Input the 1st number: 25
		 * Input the 2nd number: 78
		 * Input the 3rd number: 87
		 * Expected Output :
		 * The greatest: 87
		 */

		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		num1 = sc.nextInt();
		System.out.print("Enter number 2 : ");
		num2 = sc.nextInt();
		System.out.print("Enter number 3 : ");
		num3 = sc.nextInt();

		System.out.print("------- Comparision starts here ------- \n");

		int greatest = num1;

		if (num2 > greatest) {
			System.out.println(num2 + " is the greatest");
		}

		else if (num3 > greatest) {
			System.out.println(num3 + " is the greatest");
		}

		else {
			System.out.println(greatest + " is the greatest");
		}

		System.out.print(" ------- End of the program ----- ");
	}
}