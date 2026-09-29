Recursive Binary Search

Recursive Binary Search is an algorithm for finding a target value in a sorted array.

How it works

Find the middle element of the array.
If the middle element equals the target,return its index.
If the target is smaller recursively search the left half.
If the target is larger,recursively search the right half.
If the search area becomes empty,return `-1`.

Recursive Structure

The function calls itself with a smaller search range until the target is found or the range becomes empty.


binarySearch()
     |
     ├── left half → binarySearch()
     |
     └── right half → binarySearch()


Complexity

Time: `O(log n)`
Space: `O(log n)` because of recursive calls.
