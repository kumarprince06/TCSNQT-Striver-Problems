package NumberProblem;

import java.util.Scanner;

// Write a Program to check whether a gievn number is palindrome or not.
// A Plaindrome number is a number when reads from backward or forward it results same value.
// Example: 121, 111, 151, 353
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // Origin number

        PalindromeNumber pNum = new PalindromeNumber();

        int palNum = pNum.PalindromeApproachOne(num);

        if(palNum == num)
            System.out.println(num+" is a Palindrome Number.");
        else
            System.out.println(num+" is not a Palindrome Number.");
    }

    public int PalindromeApproachOne(int n){
        int palNum = 0; // to store the reverse  number;

        while(n != 0){
            palNum = (palNum*10)+ (n%10);
            n /= 10;
        }
        return palNum;
    }
}
