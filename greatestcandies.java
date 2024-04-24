
    import java.util.ArrayList;
import java.util.List;

public class greatestcandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        // Find the maximum number of candies among all kids and check simultaneously
        int maxCandies = -1;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println("Result: " + result);
    }
}

    

