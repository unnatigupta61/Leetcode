class Solution {
 public int missingNumber(int[] nums) {
 if(nums.length==1 && nums[0]==0) return 1;
 if(nums.length==1 && nums[0]==1) return 0;
 int n = nums.length;
 int sum=0;
 for(int i=0;i<n;i++)
 sum += nums[i];
 return n*(n+1)/2 - sum;
 }
}
