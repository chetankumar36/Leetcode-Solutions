class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=2*n;;
        int[] temp  = new int[m];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            temp[i+n]=nums[i];
        }
        return temp;
        
    }
}