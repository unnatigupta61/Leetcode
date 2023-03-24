class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int digit,elementsum=0;
        int digitsum=0;
        for(int i=0;i<n;i++){
            elementsum += nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=10){
                
                while(nums[i]!=0){
                    digit=nums[i]%10;
                    digitsum+=digit;
                    nums[i]/=10;
                }
            }else{
                digitsum+=nums[i];
            }
        }
        int absolute=Math.abs(elementsum-digitsum);
        return absolute;
    }
}
