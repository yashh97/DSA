package com.learn.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
    bubbleSort(arr);
  }

  private static void bubbleSort(Integer[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      boolean swapped = false;           //added this variable to optimise in case an array is already sorted or if it gets sorted before i==length[arr]
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          swapped = true;
          swap(arr, j + 1, j);
        }
      }
      if (!swapped) {
        break;
      }
    }
    System.err.println(Arrays.toString(arr));
  }

  public static void swap(Integer[] arr, int index1, int index2) {
    arr[index1] = arr[index1] + arr[index2];
    arr[index2] = arr[index1] - arr[index2];
    arr[index1] = arr[index1] - arr[index2];
  }
}
