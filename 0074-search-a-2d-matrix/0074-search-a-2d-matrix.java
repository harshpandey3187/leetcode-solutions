class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int startrow = 0;
        int endrow = m * n - 1;

        while (startrow <= endrow) {
            int mid = startrow + (endrow - startrow) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                startrow = mid + 1;
            } else {
                endrow = mid - 1;
            }
        }

        return false;
    }
}