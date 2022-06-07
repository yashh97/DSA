package com.learn.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
    insertionSort(arr);
  }

  private static void insertionSort(Integer[] arr) {
    for (int i = 1; i < arr.length; i++) {
      var temp = arr[i];
      var j = i - 1;
      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }
    System.err.println(Arrays.toString(arr));
  }
}
