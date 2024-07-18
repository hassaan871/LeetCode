public class RemoveElements{
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);
    }
}
class Solution{

    /**
     *  Remove all occurrences of val in nums in-place.
     * The first k elements of nums are which are not equal to val.
     * The remaining elements of nums are not important.
     * 
     * @param nums the input array of integers
     * @param val the integer array to be removed from the array
     * @return the number of elements in num which are not equal to val
     */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;}
}