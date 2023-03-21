class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(candies[i]+extraCandies >=Max(candies));
        }
        return list;
    }
    public static int Max(int[] candies){
        int n=candies.length;
        int max=candies[0];
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        return max;
    }
}
