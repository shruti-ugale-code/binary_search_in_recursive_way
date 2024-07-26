# 🔍 Binary Search in a Rotated Sorted Array

This repository contains a Java implementation of a binary search algorithm to find an element in a rotated sorted array. A rotated sorted array is an array that has been sorted and then rotated some number of times. The algorithm efficiently searches for the target element using recursion.

## 📜 Description

The main class `binary_search_in_rotated_arr` includes a `search` method that takes the array, the key to search for, and the start and end indices as parameters. The method uses recursion to narrow down the search space by adjusting the start and end indices based on the conditions checked at each step.

## 🛠️ Usage

1. Clone the repository.
2. Compile and run the `binary_search_in_rotated_arr` class.

### 💡 Example

The example provided in the `main` method initializes a rotated sorted array and searches for the target element `7`. The index of the target element is printed as output.

```java
public class binary_search_in_rotated_arr {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int ans = search(arr, 7, 0, arr.length - 1);
        System.out.println(ans);
    }

    public static int search(int[] arr, int key, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == key) {
            return m;
        }

        // Check if the left side is sorted
        if (arr[s] <= arr[m]) {
            // Check if the key is in the left side
            if (arr[s] <= key && key <= arr[m]) {
                return search(arr, key, s, m - 1);
            } else {
                return search(arr, key, m + 1, e);
            }
       
