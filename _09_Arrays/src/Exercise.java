package _09_Arrays.src;

public class Exercise {
    // WAP to find sum and avg of a array
    // Write a Java program to find the common elements between two arrays of
    // integers

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7 };
        int sum = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (sum / arr.length);
        System.err.println("The sum is : " + sum);
        System.err.println("The average is : " + avg);

        // find common between two arrays of integers :

        int arr1[] = { 3, 5, 6, 7 };
        int arr2[] = { 4, 6, 8, 7 };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.err.println(arr[i]);
                }
            }
        }
    }
}