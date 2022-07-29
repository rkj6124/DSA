package com.dsa.DPAlgo;

public class BinomialCoefficient {

  public static void main(String[] args) {
    System.out.println(calculate_binomial_coefficient(5, 2));
  }

  public static int calculate_binomial_coefficient(int n, int r) {
    int k = n - r;
    if (r < n-r) k = r;
    int result = 1;
    for (int i = 0; i < k; i++) {
      result *= (n - i);
      result /= (i + 1);
    }
    return result;
  }
}
