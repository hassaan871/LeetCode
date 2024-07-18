
import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        App app = new App();

        System.out.println("Enter Size of Nums: ");
        int size = app.scanner.nextInt();

        int[] nums = createArray(size);

        System.out.println("Enter Target: ");
        int target = app.scanner.nextInt();

        TwoSumSolution solution = new TwoSumSolution(size, nums, target);
        int[] output = solution.twoSum();
        printArray(output);
    }

    public static int[] createArray(int size) {
        App app = new App();
        int[] nums = new int[size];

        System.out.println("Enter Array");
        for (int i = 0; i < size; i++) {
            nums[i] = app.scanner.nextInt();
        }
        return nums;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
