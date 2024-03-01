package ArrayProblems;

import java.util.Scanner;

public class RecursuionReverseArrayApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        //Array Declaration
        int[] arr = new int[size];
        System.out.println("Enter Array element: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array : ");
        for (int num: arr)
            System.out.printf(num+", ");
        System.out.println();

//        ReverseArrayLoopApproach reverse = new ReverseArrayLoopApproach();
        RecursuionReverseArrayApproach reverse = new RecursuionReverseArrayApproach();
        reverse.reverseArrayRecursion(arr,0, size-1);

        System.out.println("Reverse Array : ");
        for (int num: arr)
            System.out.printf(num+", ");
    }

    private void reverseArrayRecursion(int[] arr, int start, int end) {
        if (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArrayRecursion(arr, start+1, end-1);
        }
    }
}
