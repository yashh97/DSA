package com.learn.sorting;

import static com.learn.sorting.BubbleSort.swap;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    Integer[] arr = new Integer[]{5, 4, 3, 2, 1};
    selectionSort(arr);
  }

  private static void selectionSort(Integer[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = arr[j];
        }
      }
      if(min!=i){
        swap(arr,min,i);
      }
    }
    System.err.println(Arrays.toString(arr));
  }
}
