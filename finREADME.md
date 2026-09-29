The Fibonacci sequence starts with:
0 1 1 2 3 5 8 13 21 34 ...
Each number is the sum of the two previous nums.

Example 1 — 6 terms
Input:
count = 6
Output:
Fibonacci Series up to 5 terms:
0 1 1 2 3 5

Example 2 — 7 terms
Input:
count = 7
Output:
Fibonacci Series up to 7 terms:
0 1 1 2 3 5 8

Example 3 — 10 terms
Input:
count = 10
Output:
Fibonacci Series up to 10 terms:
0 1 1 2 3 5 8 13 21 34

Recursion Work
The function is recursive because it calls itself:
return fibonacci(n - 1) + fibonacci(n - 2);
For every n > 1,the function creates two new calls:
fibonacci(n)
├── fibonacci(n - 1)
└── fibonacci(n - 2)
The recursion continues until it reaches the base case:
if (n <= 1) {
    return n;
}

Base Case
The base case stops the recursion:
if (n <= 1) {
    return n;
}
So:
fibonacci(0) → 0
fibonacci(1) → 1
Without the base case,the function would continue calling itself indefinitely.
