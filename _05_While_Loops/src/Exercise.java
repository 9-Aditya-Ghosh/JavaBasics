package _05_While_Loops.src;

public class Exercise {
    // TODO print all Fibonacci number from 1 to 1000
    public static void main(String[] args) {
        int first = 0, second = 1, next;
        next = first + second;
        System.out.print(first + " ");
        System.out.print(second + " ");

        while (next <= 1000) {

            System.out.print(" " + next);
            first = second;
            second = next;
            next = first + second;

        }

    }
}
