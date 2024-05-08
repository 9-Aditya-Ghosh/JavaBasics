package _06_For_Loops.src;

public class Exercise {
        public static void main(String[] args) {

                /*
                 * P
                 * 
                 * Print the following patterns
                 * 
                 * 1.
                 *
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * 
                 * 
                 * 2.
                 * 
                 * 1
                 * 8 27
                 * 64 125 216
                 * 343 512 728 1000
                 * 
                 * 
                 * 
                 */

                // first patten :
                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.err.print("*");
                        }
                        System.err.println();
                }

                System.err.println("---------------------------------");

                // second pattern :
                int num = 1;
                for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= i; j++, num++) {
                                System.err.print(" " + (num * num * num));
                        }
                        System.out.println();
                }
        }
}