# 💡 DSA Solutions - Data Structures & Algorithms

## Overview
A comprehensive collection of Data Structures and Algorithms solutions in Java. This repository contains solutions to hundreds of coding problems from various platforms including LeetCode, HackerRank, and CodeChef.

## 📚 Topics Covered

### Arrays & Strings
- Array manipulation and searching
- Sorting algorithms
- String manipulation
- Sliding window techniques
- Two-pointer approach

### Linked Lists
- Singly linked lists
- Doubly linked lists
- Circular linked lists
- Operations and manipulations

### Stacks & Queues
- Stack implementation
- Queue implementation
- Priority queues
- Deques
- Applications

### Trees
- Binary trees
- Binary search trees
- AVL trees
- Tree traversals
- Lowest common ancestor
- Path problems

### Graphs
- Graph representation
- BFS & DFS
- Shortest path algorithms
- Topological sorting
- Minimum spanning tree
- Cycle detection

### Dynamic Programming
- 1D DP problems
- 2D DP problems
- Knapsack problems
- Digit DP
- Interval DP

### Greedy Algorithms
- Activity selection
- Huffman coding
- Job sequencing
- Fractional knapsack

### Recursion & Backtracking
- N-Queens problem
- Sudoku solver
- Permutations & combinations
- Maze solving

### Number Theory
- GCD & LCM
- Prime numbers
- Modular arithmetic
- Factorization

## 📁 Directory Structure
```
dsa-solutions/
├── arrays/
│   ├── TwoSum.java
│   ├── MaxSubarray.java
│   └── ...
├── strings/
│   ├── LongestSubstring.java
│   ├── Palindrome.java
│   └── ...
├── linked-lists/
│   ├── ReverseLinkedList.java
│   ├── MergeKLists.java
│   └── ...
├── stacks-queues/
│   ├── ValidParentheses.java
│   ├── LargestRectangle.java
│   └── ...
├── trees/
│   ├── LevelOrderTraversal.java
│   ├── LowestCommonAncestor.java
│   └── ...
├── graphs/
│   ├── BFS.java
│   ├── DFS.java
│   ├── Dijkstra.java
│   └── ...
├── dynamic-programming/
│   ├── Fibonacci.java
│   ├── Knapsack.java
│   └── ...
├── backtracking/
│   ├── NQueens.java
│   ├── Permutations.java
│   └── ...
└── README.md
```

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Any IDE (VS Code, IntelliJ IDEA, Eclipse)
- Git

### Running Solutions

1. **Clone the repository**
   ```bash
   git clone https://github.com/sagaar051/dsa-solutions.git
   cd dsa-solutions
   ```

2. **Compile and run a solution**
   ```bash
   javac arrays/TwoSum.java
   java arrays/TwoSum
   ```

## 📊 Problem Statistics

| Category | Count | Difficulty |
|----------|-------|------------|
| Arrays | 45 | Easy - Hard |
| Strings | 35 | Easy - Hard |
| Linked Lists | 25 | Easy - Hard |
| Stacks & Queues | 20 | Easy - Hard |
| Trees | 50 | Easy - Hard |
| Graphs | 40 | Medium - Hard |
| Dynamic Programming | 60 | Medium - Hard |
| Backtracking | 20 | Medium - Hard |
| Number Theory | 15 | Easy - Hard |
| **Total** | **310+** | - |

## 💻 Example Solution

### Two Sum Problem
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap approach - O(n) time, O(n) space
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
```

## 🎯 Approach & Tips

1. **Understand the Problem**: Read carefully and identify constraints
2. **Identify Pattern**: Recognize similar problems solved before
3. **Brute Force**: Start with simplest solution
4. **Optimize**: Use better data structures and algorithms
5. **Code**: Implement clean and readable solution
6. **Test**: Test edge cases and corner cases

## 📈 Complexity Analysis

Each solution includes:
- **Time Complexity**: Big O notation
- **Space Complexity**: Memory requirements
- **Explanation**: How the algorithm works

## 🤝 Contributing

Contributions are welcome! Please:
1. Fork the repository
2. Create a new branch
3. Add your solution with proper documentation
4. Submit a pull request

## 📝 Coding Standards

- Clean and readable code
- Meaningful variable names
- Comments for complex logic
- Proper error handling
- Time and space complexity comments

## 📚 Resources

- [LeetCode](https://leetcode.com)
- [HackerRank](https://www.hackerrank.com)
- [CodeChef](https://www.codechef.com)
- [GeeksforGeeks](https://www.geeksforgeeks.org)
- [Introduction to Algorithms](https://mitpress.mit.edu/9780262033848/)

## 🏆 Problem Solving Statistics

- Total Problems Solved: 300+
- Accepted Solutions: 98%
- Average Difficulty: Medium
- Learning Time: 500+ hours

## 📝 License
MIT License - See LICENSE file for details

## 👨‍💻 Author
**Sagar Gouda** - [GitHub](https://github.com/sagaar051) | [LinkedIn](https://www.linkedin.com/in/sagar051/)

## 🔗 Related Repositories
- [Student Management System](../projects/student-system)
- [PhishCatcher - ML Detection](../projects/phish-catcher)
- [Personal Portfolio](../projects/portfolio)

---

**Keep learning, keep coding! 🚀**
