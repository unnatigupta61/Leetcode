class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2){
            size+=nums[i];
        }
        int[] ans=new int[size];
        int ind=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                ans[ind]=nums[i+1];
                ind++;
            }
        }
        return ans;
    }
}
