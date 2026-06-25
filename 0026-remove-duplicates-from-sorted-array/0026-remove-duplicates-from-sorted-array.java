class Solution {
    public int removeDuplicates(int[] nums) {        
        if(nums.length<=1){
            return nums.length;
        }
        int rd=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[rd]=nums[i];
                rd++;
            }   
        }
        return rd;
        
    }
}
