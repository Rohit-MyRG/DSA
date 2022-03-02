
____________________________________________________________________________
# Q1. Number of Good Pairs. (Demo1.java)
 ## Given an array of integers nums, return the number of good pairs.
  A pair (i, j) is called good if nums[i] == nums[j] and i < j.

### Example 1:
 Input: nums = [1,2,3,1,1,3]
 Output: 4
 Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

### Example 2:
 Input: nums = [1,1,1,1]
 Output: 6
 Explanation: Each pair in the array are good.

 ### Example 3:
 Input: nums = [1,2,3]
 Output: 0

 ### Constraints:
 1 <= nums.length <= 100
 1 <= nums[i] <= 100

 _____________________________________________________________________________________
 # Q2.Shuffle the Array
  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
  Return the array in the form [x1,y1,x2,y2,...,xn,yn].

### Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

### Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

### Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 
### Constraints:
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3