package com.dsa.DPAlgo;

public class RegularExpressionMatching {

  /**
   * @param args
   * <div>
   *   <p>Given an input string( s ) and a pattern( p ), implement regular expression matching
   *   with support for '.' and '*' where:</p><br>
   *   <ul>
   *     <li>
   *       '.' 'Matches any single character.
   *     </li>
   *     <li>
   *       '*' Matches zero or more of the preceding element.
   *     </li>
   *   </ul>
   *   <br>
   *   The matching should cover the <b>entire</b>> input string (not partial)
   * </div>
   * <br>
   * <div>
   *   <b>Example 1:</b><br>
   *   <b>Input:</b> s = "aa", p ="a"<br>
   *   <b>Output:</b> false<br>
   *   <b>Explanation:</b> "a" does not match the entire string "aa".
   * </div>
   * <br>
   * <div>
   *   <b>Example 2:</b><br>
   *   <b>Input:</b> s = "aa", p ="a*"<br>
   *   <b>Output:</b> true<br>
   *   <b>Explanation:</b> '*' means zero or more of the preceding element, 'a'. Therefore, by
   *   repeating 'a' once, it becomes "aa".
   * </div>
   * <br>
   * <div>
   *   <b>Example 1:</b><br>
   *   <b>Input:</b> s = "ab", p =".*"<br>
   *   <b>Output:</b> true<br>
   *   <b>Explanation:</b> '*' means zero or more of the preceding element, '.'. Therefore, by
   *   repeating '..' with ab, it becomes "ab".
   * </div>
   * <br>
   */
  public static void main(String[] args) {
    String input = "aa";
    String pattern = "a*";
    boolean result = isMatching(input, pattern);
    System.out.println(result);

    // Let's understand this first
    // p = "a" -> Matching the exact substring p -> "a"
    // p = "a*" -> Matching 0 or more preceding element 'a' -> "", "a", "aa", "aaa", ...
    // p = "a." -> . can be replaced with any literal -> "ab", "ac", "aa", "ad", ....
    // p = ".*" -> Matching 0 or more preceding element '.' -> "", ".", "..", "...", ... -> Now
    // the periods/dots can be replaced with any literal.
  }

  private static boolean isMatching(String input, String pattern) {
    char[] charSequence = input.toCharArray();

    return false;
  }
}
