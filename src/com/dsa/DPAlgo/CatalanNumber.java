package com.dsa.DPAlgo;

public class CatalanNumber {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(calculate_catalan_with_recursion(n));
        System.out.println(calculate_catalan_with_dp(n));
        System.out.println(calculate_catalan_with_formula(n));
    }

    /**
     * @param n input n
     *          <p>Formula: 1/(n+1) * 2nCn => (2n! / n! * n!) / (n + 1)</p>
     *          <p>TimeComplexity: O(k) where k is Min(n, n-r), in this case k = n => O(n)</p>
     *          <p>SpaceComplexity: O(1)</p>
     *
     * @return nth catalan number
     */
    private static int calculate_catalan_with_formula(int n) {
        return BinomialCoefficient.calculate_binomial_coefficient(2*n, n)/(n+1);
    }

    /**
     * @param n input n
     *          <p>BaseCase: C0 = C1 = 1</p>
     *          <p>TimeComplexity: Equivalent to nth catalan number which is exponential</p>
     *          <p>SpaceComplexity: O(n)</p>
     *
     * @return nth catalan number
     */
    private static int calculate_catalan_with_recursion(int n) {
        if (n==0 || n==1) return 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
           sum += calculate_catalan_with_recursion(i) * calculate_catalan_with_recursion(n-i-1);
        }
        return sum;
    }

    /**
     * @param n input n
     *          <p>BaseCase: C0 = C1 = 1</p>
     *          <p>TimeComplexity: O(n2)</p>
     *          <p>SpaceComplexity: O(1)</p>
     *
     * @return nth catalan number
     */
    public static int calculate_catalan_with_dp(int n) {
        int[] catalan = new int[n+2];
        catalan[0] = catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i-j-1];
            }
        }
        return catalan[n];
    }
}
