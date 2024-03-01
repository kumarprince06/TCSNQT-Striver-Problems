package ArrayProblems;

import java.util.Scanner;

public class ReverseArrayLoopApproach {
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

        ReverseArrayLoopApproach reverse = new ReverseArrayLoopApproach();
        reverse.reverseArray(arr, size);
    }

    private void reverseArray(int[] arr, int size) {
        System.out.println("Original Array: ");
        for (int num: arr){
            System.out.print(num+", ");
        }
        System.out.println();
        for (int i = 0; i <size/2; i++) {
            //Swapping the first index element and last index element and so on
            int temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }

        System.out.println("Reverse Array: ");
        for (int num: arr){
            System.out.print(num+", ");
        }

    }
}
