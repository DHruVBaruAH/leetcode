public class diagonal {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        
        // Sum of primary diagonal
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }
        
        // Sum of secondary diagonal (excluding primary diagonal elements)
        for (int i = 0; i < n; i++) {
            sum += mat[i][n - 1 - i];
        }
        
        // Exclude the intersection element of both diagonals if matrix size is odd
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int result = diagonalSum(matrix);
        System.out.println("Sum of diagonals: " + result);
    }
}