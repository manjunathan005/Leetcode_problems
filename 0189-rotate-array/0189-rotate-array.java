class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
        k=k%nums.length;
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            k++;
            if(k>=nums.length){
                k=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}