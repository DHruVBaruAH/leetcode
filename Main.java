public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}