class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] ans =new int[k];
        int sum=0,fre=0;
        ans[0]=1;
        for(int i:nums){
            sum=(sum+i%k+k)%k;
            fre+=ans[sum]++;
        }
        return fre;
    }
}
