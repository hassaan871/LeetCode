
public class TwoSumSolution {

    int[] nums ;
    int target;

    public TwoSumSolution(int size, int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    public int[] twoSum() {
        int[] output = new int[2];
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                temp = nums[i] + nums[j];
                if (temp == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
