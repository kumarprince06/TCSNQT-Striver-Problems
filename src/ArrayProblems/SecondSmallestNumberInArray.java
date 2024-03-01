package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        //Array Declaration
        int[] arr = new int[size];
        System.out.println("Enter Array element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        SecondSmallestNumberInArray secondSmall = new SecondSmallestNumberInArray();
        secondSmall.findSecondSmallest(arr, size);
    }

    private void findSecondSmallest(int[] arr, int size) {
        /*********   Brute-Force Approach     ************/
        /***
        // Sort an array in ascending order and return the second smallest
        Arrays.sort(arr);
        int secondSmall = arr[1];
         */

        /*****   Better & Optimal Approach      ******/
        /**
         *     Find the smallest and largest element in the array in a single traversal
         *     After this, we once again traverse the array and find an element that is just greater than the smallest element we just found.
         *     Similarly, we would find the largest element which is just smaller than the largest element we just found
         *     Indeed, this is our second smallest and second largest element.
         */

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }


        System.out.println("Second Smallest Number in Array: "+secondSmall);
    }

}
