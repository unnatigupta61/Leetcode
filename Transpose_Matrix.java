class Solution {
    public int[][] transpose(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        int ar[][]=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                ar[i][j]=arr[j][i];
            }
        }
        return ar;
    }
}
