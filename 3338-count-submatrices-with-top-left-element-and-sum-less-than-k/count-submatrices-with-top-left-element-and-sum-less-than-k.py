class Solution:
    def countSubmatrices(self, grid: List[List[int]], k: int) -> int:
        m, n = len(grid), len(grid[0])
        count = 0
        prefix = [[0] * n for _ in range(m)]
        for i in range(m):
            for j in range(n):
                if i==0 and j==0:
                    prefix[0][0]=grid[0][0]
                elif i==0:
                    prefix[i][j]=grid[i][j] + prefix[i][j-1]
                elif j==0: 
                    prefix[i][j]=grid[i][j] + prefix[i-1][j]
                else:
                    prefix[i][j] = grid[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1]
                if prefix[i][j] <= k:
                    count+=1
        return count