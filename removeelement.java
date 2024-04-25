public class removeelement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2,4,35, 3};
        int val = 3;
        
        Solution solution = new Solution();
        int result = solution.removeElement(nums, val);
        
        System.out.println("Number of elements not equal to " + val + ": " + result);
        System.out.print("Updated array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Initialize the count of elements not equal to val
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Move the non-val element to the position k
                nums[k] = nums[i];
                // Increment the count of non-val elements
                k++;
            }
        }
        
        // The first k elements of nums now contain elements not equal to val
        // The remaining elements are not important
        
        return k; // Return the count of elements not equal to val
    }
}
