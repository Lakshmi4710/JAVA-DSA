# LRU Cache

## Problem

Implement an **LRU (Least Recently Used) Cache** with efficient `get()` and `put()` operations.

## Approach

Uses:

* **HashMap** → O(1) key lookup
* **Doubly Linked List** → maintains MRU to LRU order

The most recently used item is kept near the head, while the least recently used item is near the tail.

## Complexity

* **get():** O(1)
* **put():** O(1)
* **Space:** O(capacity)

## Key Learning

Learned how to combine a **HashMap and Doubly Linked List** to implement an efficient cache.
