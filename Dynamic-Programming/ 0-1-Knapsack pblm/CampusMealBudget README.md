# Campus Meal Budget

## Problem
Find the maximum nutrition points that can be obtained without exceeding the given budget. Each food item can be selected at most once.

## Approach
Use 0/1 Knapsack Dynamic Programming.

`dp[i][b]` represents the maximum nutrition using the first `i` items with budget `b`.

## Complexity
- Time: O(n × budget)
- Space: O(n × budget)
