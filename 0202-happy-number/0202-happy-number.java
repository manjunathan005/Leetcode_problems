class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int t=n;
        while(t!=1 && !set.contains(t)){
            set.add(t);
            int sum =0;
            while( t!=0){
                int last=t%10;
                sum +=last*last;
                 t=t/10;
                 
            }
            t=sum;
        }
        if(t==1){
            return true;
        }
        else{
           return false;
        }
    }
}