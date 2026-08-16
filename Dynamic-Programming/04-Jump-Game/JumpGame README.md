# Jump Game

## Problem

Determine whether you can reach the last index of the array.

## Approach

Use a **Greedy** approach by tracking the farthest reachable index.

* If `i > maxr`, return `false`.
* Otherwise, update `maxr = Math.max(maxr, i + nums[i])`.

## Complexity

* **Time:** O(n)
* **Space:** O(1)
