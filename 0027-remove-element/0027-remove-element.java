class Solution {
    public int removeElement(int[] nums, int val) {
        int rd=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[rd]=nums[i];
                rd++;
            }
        }
        return rd;

        
    }
}