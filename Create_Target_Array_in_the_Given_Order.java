class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        int n=nums.length;
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++){
            target[i]=list.get(i);
        }
        return target;
    }
}
