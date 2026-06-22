class Solution {
    public int maxIceCream(int[] costs, int coins) {
    int max=0;
    int count=0;
    for(int i=0;i<costs.length;i++){
        if(costs[i]>max){
            max=costs[i];
        }
    }
        int[] frq=new int[max+1];
        for(int i=0;i<costs.length;i++){
            frq[costs[i]]++;
        }
        for(int prize=1;prize<frq.length;prize++){
            while(frq[prize]>0 && coins>=prize){
                coins=coins-prize;
                count++;
                frq[prize]--;
            }
        }
    
    return count;
    }
       
}