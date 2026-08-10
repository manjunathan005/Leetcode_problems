class Solution {
    public int arrangeCoins(int n) {
        int m=n;
        int count=0;
        for(int i=1;i<=n;i++){
            if(i>m){
                return count;
            }
            else{
                 m=m-i;
                 count++;
            }
        }
        return count;
    }
}












