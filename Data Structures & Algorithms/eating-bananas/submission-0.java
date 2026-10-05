class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min =1;
        int maxS = 0;
        for(int pile:piles){
            maxS = Math.max(maxS,pile);
        }
        while(min< maxS){
            int m = min + (maxS-min)/2;
            if(canE(piles,h,m)){
                maxS = m;
            }else{
                min = m+1;
            }
        }
        return min;
    }
    private boolean canE(int []piles,int h,int speed){
        int hours =0;
        for(int pile:piles){
            hours += (pile+speed-1)/speed;
        }
        return hours<=h;
    }
}
