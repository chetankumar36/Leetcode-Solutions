class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left=0;
        int right=s.length()-1;
        for(int i=left;i<=right;i++){
            if(s.charAt(i)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }

        }
        return true;
        


        
    }
}