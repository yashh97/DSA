package com.learn.algorithms.sorting;

import static com.learn.algorithms.sorting.BubbleSort.swap;

import java.util.Arrays;

public class QuickSort {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
    quickSort(arr,0,arr.length-1);
  }

  private static void quickSort(Integer[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
    }
    System.err.println(Arrays.toString(arr));
  }

  private static int partition(Integer[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;
    while (i < j) {
      while (arr[i] <= pivot) {
        i++;
      }
      while (arr[j] > pivot) {
        j--;
      }
      if (i < j) {
        swap(arr, i, j);
      }
    }
    swap(arr, j, low);
    return j;
  }
}
