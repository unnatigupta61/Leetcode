class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int max=0;
        int c=0;
        for(int i=0;i<n;i++){
            int min=Math.min(rectangles[i][0],rectangles[i][1]);
            if(max<min){
                max=min;
                c=1;
            }else if(max==min){
                c++;
            }else{
                continue;
            }
        }
        return c;
    }
}
