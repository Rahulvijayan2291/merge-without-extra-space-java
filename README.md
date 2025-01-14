# 🚀 Merge Two Sorted Arrays Without Extra Space | Java Solution

Welcome to the **Merge Two Sorted Arrays Without Extra Space** problem repository! This repository contains an efficient and concise Java solution to a commonly asked coding interview question. The solution leverages **inbuilt methods** like `System.arraycopy` and `Arrays.sort` for simplicity and performance.

---

## 📜 Problem Statement

You are given two sorted arrays `a[]` and `b[]` of sizes `n` and `m` respectively. Your task is to:
1. Merge the two arrays so that the **first `n` elements** reside in `a[]`.
2. The **last `m` elements** reside in `b[]`.
3. Do this **without using extra space for merging**.

### Example

**Input**:  
`a[] = {1, 4, 7, 8, 10}`  
`b[] = {2, 3, 9}`  

**Output**:  
`a[] = {1, 2, 3, 4, 7}`  
`b[] = {8, 9, 10}`  

---

## 🔍 Solution Overview

The solution focuses on merging the two arrays efficiently using Java’s inbuilt methods:  
1. **Combine the arrays**: Use `System.arraycopy` to merge the two arrays into a single temporary array.  
2. **Sort the combined array**: Use `Arrays.sort()` to sort all the elements in ascending order.  
3. **Split the sorted array**: Copy the first `n` elements back to `a[]` and the remaining `m` elements back to `b[]`.

This method keeps the solution concise and leverages Java's powerful inbuilt utilities for optimal performance.

---

## ⏱️ Complexity Analysis

- **Time Complexity**:  
  - Merging arrays: `O(n + m)`  
  - Sorting the array: `O((n + m) log(n + m))`  
  - Copying back: `O(n + m)`  
  - **Overall**: **O((n + m) log(n + m))**

- **Space Complexity**:  
  - Temporary array of size `n + m`: **O(n + m)**

---

## 🎥 YouTube Video

Want a detailed walkthrough of the problem and solution?  
📺 Watch the full explanation on YouTube here: **https://youtu.be/T13SpG6TLGw**

---

## 🤝 Connect with Me

- **GitHub**: https://github.com/Rahulvijayan2291/  
- **LinkedIn**: https://www.linkedin.com/in/rahul-vijayan-682a12194/  
- **Instagram**: https://www.instagram.com/rv_official_yt/
- **YouTube**: https://www.youtube.com/@Rahul_Vijayan?sub_confirmation=1
- **LeetCode**: https://leetcode.com/u/rahulvijayan2291/ 


---

### 🌟 Don't forget to ⭐ this repository if you found it helpful!  
Feel free to fork, clone, and use this solution for learning or interview preparation. Contributions and feedback are always welcome!

#JavaProgramming #MergeArrays #CodingInterview #DataStructures #Algorithms #FAANGPreparation #SystemArrayCopy #ArraysSort
