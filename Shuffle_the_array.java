class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=2*n;
        int[] curpos=new int[len];
        int x=0,y=n;
        int a=0;
        while(a<len){
            curpos[a++]=nums[x++];
            curpos[a++]=nums[y++];
        }
        return curpos;
    }
}
