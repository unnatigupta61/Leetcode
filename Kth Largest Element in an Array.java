class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        Reverse(nums);
        return nums[k-1];
    }
    public static void Reverse(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
