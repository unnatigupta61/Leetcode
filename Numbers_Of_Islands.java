class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int noofislands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid,i,j,visited);
                    noofislands++;
                }
            }
        }
        return noofislands;
    }
    public void dfs(char[][]grid, int row,int column,boolean[][] visited){
        if((row<0 || column<0)|| row>=grid.length || column>=grid[0].length || visited[row][column] || grid[row][column]=='0')return;
        visited[row][column]=true;
        dfs(grid,row,column-1,visited);
        dfs(grid,row,column+1,visited);
        dfs(grid,row-1,column,visited);
        dfs(grid,row+1,column,visited);
    }
}
