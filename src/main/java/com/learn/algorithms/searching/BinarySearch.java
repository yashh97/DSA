package com.learn.algorithms.searching;

public class BinarySearch {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
    System.err.println(binarySearch(arr, 5));
  }

  public static Integer binarySearch(Integer[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (key > arr[mid]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
