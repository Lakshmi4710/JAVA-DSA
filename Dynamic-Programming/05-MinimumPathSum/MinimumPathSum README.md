# Minimum Path Sum

### Approach

Uses **Dynamic Programming** where `dp[i][j]` stores the minimum path sum to reach cell `(i, j)`.

* First row → accumulated from left.
* First column → accumulated from top.
* Other cells → choose the minimum of **top** and **left** paths.

```text
dp[i][j] = grid[i][j] + min(dp[i-1][j], dp[i][j-1])
```

The answer is stored at `dp[m-1][n-1]`.

### Complexity

* **Time:** `O(m × n)`
* **Space:** `O(m × n)`
