//import java.util.*;
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int maxArea=0;
        int area=0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    area = dfs(grid,i,j,m,n);
                    maxArea  = Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
    private static int dfs(int[][] grid,int i,int j,int m,int n){
        if(i>=m||i<0 || j>=n||j<0 || grid[i][j]==0){
            return 0;
        }
        
        grid[i][j]=0;
        int a1 = dfs(grid,i+1,j,m,n);
        int a2 = dfs(grid,i-1,j,m,n);
        int a3 = dfs(grid,i,j+1,m,n);
        int a4 = dfs(grid,i,j-1,m,n);
        return 1+a1+a2+a3+a4;
    }
}