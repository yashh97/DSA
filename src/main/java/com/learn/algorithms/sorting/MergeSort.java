package com.learn.algorithms.sorting;

public class MergeSort {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
    mergeSort(arr, 0, arr.length);
  }

  private static void mergeSort(Integer[] arr, int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  private static void merge(Integer[] arr, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = low;
    Integer[] sortedArr = new Integer[arr.length];
    while (i <= mid && j <= high) {
      if (arr[i] < arr[j]) {
        sortedArr[k] = arr[i];
        i++;
      } else {
        sortedArr[k] = arr[j];
        j++;
      }
    }
    if (i > mid) {
      while (j <= high) {
        sortedArr[k] = arr[j];
        k++;
        j++;
      }
    } else {
      while (i <= mid) {
        sortedArr[k] = arr[i];
        k++;
        i++;
      }
    }
    for (k = low; k <= high; k++) {
      arr[k] = sortedArr[k];
    }
  }
}
