class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int p=0;
        int d=0;
        for (int i=0;i<nums.length-1;i++){
            d=Math.max(d,nums[i]+i);
            if(p==i){
                p=d;
                jump++;
            }
        }
        return jump;
    }
}
