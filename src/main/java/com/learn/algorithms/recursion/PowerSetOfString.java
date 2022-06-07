package com.learn.algorithms.recursion;

public class PowerSetOfString {

  public static void main(String[] args) {
    var testString = "abc";
    generatePowerSet(testString, 0, "");
  }

  private static void generatePowerSet(String str, int i, String current) {
    if (i == str.length()) {
      System.err.println(current);
      return;
    }
    generatePowerSet(str, i + 1, current + str.charAt(i));
    generatePowerSet(str, i + 1, current);
  }

}
