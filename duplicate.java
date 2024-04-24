public class duplicate {
        public static int removeDuplicates(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            
            int k = 1; // Pointer for unique elements
            
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k++] = nums[i]; // Overwrite duplicates
                }
            }
            
            return k;
        }
        
        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
            int k = removeDuplicates(nums);
            
            System.out.println("Number of unique elements: " + k);
            System.out.print("Unique elements: ");
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
    

