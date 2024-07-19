public class MajorityElement{
    public static void main(String[] args){
        int[] nums = {3,2,3};
        Solution solution = new Solution();
        int majorityElement = solution.majorityElement(nums);
        System.out.println(majorityElement);
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) return 0;

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}