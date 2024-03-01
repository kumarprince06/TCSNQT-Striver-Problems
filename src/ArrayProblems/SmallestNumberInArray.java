package ArrayProblems;

import java.util.Scanner;

public class SmallestNumberInArray {
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

        SmallestNumberInArray small = new SmallestNumberInArray();
        small.findSmallestNumber(arr, size);
    }

    private void findSmallestNumber(int[] arr, int size) {
        int small = arr[0];

        for (int i = 0; i < size; i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest Number in Array : "+small);
    }
}
