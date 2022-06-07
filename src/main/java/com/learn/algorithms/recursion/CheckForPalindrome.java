package com.learn.algorithms.recursion;

public class CheckForPalindrome {

  public static void main(String[] args) {

    var stringToTest = "racecar";
    System.err.println(checkForPalindrome(stringToTest, 0, stringToTest.length() - 1));
  }

  private static boolean checkForPalindrome(String str, int leftIndex, int rightIndex) {
    if (leftIndex >= rightIndex) {
      return true;
    }
    if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
      return false;
    }
    return checkForPalindrome(str, leftIndex + 1, rightIndex - 1);
  }
}