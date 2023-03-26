class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k % n;
        reversearray(nums,0,n-1);
        reversearray(nums,0,k-1);
        reversearray(nums,k,n-1);
    }
    void reversearray(int[] arr,int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
}
