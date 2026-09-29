Binary Search is an algorithm for finding a target value in a sorted array.At every iteration,it checks the middle element and removes half of the remaining search area.

The implementation uses three main variables:

`low` — left boundary
`mid` — middle position
`high` — right boundary

If `target == a[mid]`,the target is found.

If `target < a[mid]`,the search continues in the left half.

If `target > a[mid]`,the search continues in the right half.



Example 1:Target = 9


[1, 3, 5, 7, 9, 11, 15]
          ↑
        mid = 7


9 is greater than 7,so the search moves right.

[9, 11, 15]
 ↑


Then 9 is found at index `4`.

Result:4

Example 2:Target = 1


[1, 3, 5, 7, 9, 11, 15]
          ↑
        mid = 7


1 is smaller than 7,so the search moves left.


[1, 3, 5]


Then:


[1]
 ↑


The target is found at index `0`.

Result:0

Example 3:Target = 10


[1, 3, 5, 7, 9, 11, 15]
          ↑
        mid = 7


10 is greater than 7,so the search moves right.


[9, 11, 15]


10 is smaller than 11,so the search moves left.


[9]


10 is greater than 9,so the search moves right.The search area becomes empty.

Result:-1



At every iteration,Binary Search reduces the search area by about half.This makes the algorithm much faster than checking every element one by one.
