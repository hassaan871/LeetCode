public class RemoveDuplicates{
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {11, 12, 13, 11, 11, 14, 15, 12, 16};
        solution.removeDuplicates(nums);
    }
}

class Solution {
    /**
     * Removes duplicates from sorted array
     * 
     * @param nums array whoes duplicates should be removed.
     * @return integer k the first k non duplicates elements in nums
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
