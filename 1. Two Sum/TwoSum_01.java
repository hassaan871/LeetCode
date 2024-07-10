/*1. Two Sum - Easy*/
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
import java.util.Scanner;

public class TwoSum_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the number of elements in the array: ");
        size = scanner.nextInt();
        int[] nums = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter element "+i+":");
            nums[i] = scanner.nextInt();
        }

        for(int i = 0; i<size; i++){
            System.out.println("Array: ");
            System.out.println(nums[i]);
        }
    }
    
    
}

// public class HelloWorld {
//     public static void main(String[] args) {
//     }
// }
