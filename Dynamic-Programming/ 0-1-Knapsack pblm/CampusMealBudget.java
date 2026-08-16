public class CampusMealBudget {
    // Method to achieve maximum nutrition within budget
    public static int maxNutrition(int[] cost, int[] nutrition, int budget) {
        int m = cost.length;
        // dp[i][b] represents maximum nutrition achieved using a subset of first 'i' items with budget 'b'
        int[][] dp = new int[m + 1][budget + 1];
        for (int i = 1; i <= m; i++) {
            for (int b = 1; b <= budget; b++) {
                // Check if current item's cost fits within current budget 'b'
                if (cost[i - 1] <= b) {
                    // Option 1 (Exclude): Skip current item -> dp[i - 1][b]
                    // Option 2 (Include): Take current item -> nutrition[i - 1] + value with remaining budget (b - cost[i - 1])
                    // Take max of exclude vs include
                    dp[i][b] = Math.max(
                        dp[i - 1][b],
                        nutrition[i - 1] + dp[i - 1][b - cost[i - 1]]
                    );
                } else {
                    // Item is too expensive, inherit maximum nutrition obtained without this item
                    dp[i][b] = dp[i - 1][b];
                }
            }
        }
        // Return maximum nutrition possible using all 'm' items within total 'budget'
        return dp[m][budget];
    }
}
