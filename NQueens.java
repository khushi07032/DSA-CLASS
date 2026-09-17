import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> answer = new ArrayList<>();
        char[][] grid = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(grid[i],'.');
        }
        solve(0,grid,n,answer);
        return answer;
    }
    public static void solve(int row,char[][] grid,int n,List<List<String>> ans){
        if(row==n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(grid[i]));
            }
            ans.add(temp);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,grid,n)){
                grid[row][col] = 'Q';
                solve(row+1,grid,n,ans);
                grid[row][col] = '.';
            }

        }

    }
    public static boolean isSafe(int row,int col,char[][] grid,int n){
        for(int i=0;i<row;i++){
            if(grid[i][col]=='Q'){
                return false;
            }

        }
        for(int i = row-1,j = col+1;i>=0 && j<n;i--,j++){
            if(grid[i][j]=='Q'){
                return false;
            }
        }
        for(int i = row-1,j = col-1;i>=0 && j>=0;i--,j--){
            if(grid[i][j]=='Q'){
                return false;
            }
        }
        return true;
    } 
}
