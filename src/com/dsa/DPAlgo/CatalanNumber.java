package com.dsa.DPAlgo;

import java.util.ArrayList;

public class CatalanNumber {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(calculate_catalan(n));
        System.out.println(calculate_catalan_with_formula(n));
    }

    /**
     * @param n nth number ?
     *          <p><b>formula:</b> 1/(n+1) * 2nCn => (2n! / n! * n!) / (n + 1)</p>
     *
     * @return <strong>nth catalan number</strong>
     */
    private static int calculate_catalan_with_formula(int n) {
        return BinomialCoefficient.calculate_binomial_coefficient(2*n, n)/(n+1);
    }

    public static int calculate_catalan(int n) {
        return 0;
    }
}
