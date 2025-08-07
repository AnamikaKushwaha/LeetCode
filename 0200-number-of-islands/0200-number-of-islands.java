class Solution {
    public int numIslands(char[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
        int ans = 0;
       for(int i = 0; i<row; i++) {
        for(int j = 0; j<col; j++) {
            if(grid[i][j] == '1') {
                DFS(grid, i, j, row, col);
                ans++;
            }
        }
       } 
       return ans;
    }

    void DFS(char[][] grid, int i, int j, int row, int col) {
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        DFS(grid, i, j+1, row, col);
        DFS(grid, i-1, j, row, col);
        DFS(grid, i, j-1, row, col);
        DFS(grid, i+1, j, row, col);
    }
}