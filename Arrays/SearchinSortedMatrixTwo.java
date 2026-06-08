class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         // Handle edge cases for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int row = 0;
        int col = matrix[0].length - 1;

        // "Staircase" search starting from top-right corner
        while (row < matrix.length && col >= 0) {
            int curr = matrix[row][col];
            
            if (target == curr) {
                return true;
            } else if (target < curr) {
                // Target is smaller, so it must be to the left
                col--;
            } else {
                // Target is larger, so it must be below
                row++;
            }
        }

        return false;
        
    }
}