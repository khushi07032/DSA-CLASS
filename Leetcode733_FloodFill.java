class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int orgcolor = image[sr][sc];
        
        if(image[sr][sc]==color){
            return image;
        }
        dfs(image,sr,sc,orgcolor,color);
        return image;
        
    }
    private static void dfs(int[][] image,int sr,int sc,int orgcolor,int newcolor){
        if(sr<0 || sr>=image.length||sc<0 || sc>=image[0].length || image[sr][sc]!=orgcolor) return;
        
        if(image[sr][sc]==orgcolor){
            image[sr][sc] = newcolor;
            dfs(image,sr+1,sc,orgcolor,newcolor);
            dfs(image,sr-1,sc,orgcolor,newcolor);
            dfs(image,sr,sc+1,orgcolor,newcolor);
            dfs(image,sr,sc-1,orgcolor,newcolor);
        }

    }
}
