class Solution {
    public boolean isPalindrome(int x) {
        int revalue=0;
        int duplicate=x;

        while(x>0){
            int d1=x%10;
            revalue=(revalue*10)+d1;
            x/=10;
            }
            return revalue==duplicate;
        


        
    }
}