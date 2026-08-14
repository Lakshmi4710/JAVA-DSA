# Climbing Stairs

**LeetCode:** 70 — Climbing Stairs

## Problem

Given `n` stairs, you can climb either **1 or 2 steps** at a time. Find the number of distinct ways to reach the top.

## Approach

This problem follows a **Dynamic Programming / Fibonacci pattern**.

For every step:

`ways(i) = ways(i - 1) + ways(i - 2)`

Instead of using a DP array, the solution stores only the previous two values:

* `prev1` → ways for `i - 2`
* `prev2` → ways for `i - 1`
* `curr` → ways for `i`

This reduces the space required.

## Complexity

* **Time:** O(n)
* **Space:** O(1)

## Key Learning

Learned how to optimize a **1D Dynamic Programming** solution from **O(n) space to O(1) space** by storing only the previous two states.
