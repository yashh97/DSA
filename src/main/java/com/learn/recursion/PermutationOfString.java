package com.learn.recursion;

import java.util.Arrays;
import java.util.Collections;

public class PermutationOfString {

  public static void main(String[] args) {
    var str = "abc";
    generatePermutations(str, 0, str.length() - 1);
  }

  private static void generatePermutations(String str, int leftIndex, int rightIndex) {
    if (leftIndex == rightIndex) {
      System.err.println(str);
      return;
    }
    for (int i = leftIndex; i <= rightIndex; i++) {
      str = swap(str, leftIndex, i);
      generatePermutations(str, leftIndex + 1, rightIndex);
      str = swap(str, leftIndex, i);
    }
  }

  private static String swap(String str, int index1, int index2) {
    if (str.charAt(index1) == str.charAt(index2)) {
      return str;
    }
    var arrayListOfString = Arrays.asList(str.split(""));
    Collections.swap(arrayListOfString, index1, index2);
    return String.join("", arrayListOfString);
  }
}
