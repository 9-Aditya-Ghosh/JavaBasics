package _04_if.src;

public class Application {
	public static void main(String[] args) {

		// Some useful conditions:
		System.out.println(5 == 5);
		System.out.println(10 != 11);
		System.out.println(3 < 6);
		System.out.println(10 > 100);

		int a = 11;
		if (a <= 10) {
			System.out.println("a is greater than 10");
		} else if (a > 100) {
			System.out.println("a is greater than 100");
		} else {
			System.out.println("a is less than 10");
		}

		// Using loops with "break":
		// int loop = 0;

		// while (true) {
		// System.out.println("Looping: " + loop);

		// if (loop == 3) {
		// break;
		// }

		// loop++;

		// System.out.println("Running");
		// }
	}
}