class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] count=new int[26];

        for(int i=0;i<text.length();i++){
            count[text.charAt(i)-'a']++;           
        }

       return  Math.min(
            Math.min(count['b'-'a'],count['a'-'a']),
            Math.min(
                Math.min(count['l'-'a']/2,count['o'-'a']/2),
            count['n'-'a']
            )
            
        );
    }

}