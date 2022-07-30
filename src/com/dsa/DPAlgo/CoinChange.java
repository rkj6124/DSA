package com.dsa.DPAlgo;

import java.util.Arrays;

public class CoinChange {


  /**
   * @param args
   * <p>You are given coins of different denominations and a total amount of money amount.
   * Write a function to complete the fewest number of coins that you need to make up that amount.
   * If that amount of money cannot be made up by any combination of the coins, return -1.</p>
   * <p>You may assume that you have an infinite number of each kind of coin.</p>
   *<br>
   * <div>
   *   <b>Example 1:</b><br>
   *   <b>Input:</b> coins = [1,2,5], amount = 11<br>
   *   <b>Output:</b> 3<br>
   *   <b>Explanation:</b> 11 = 5 + 5 + 1<br>
   * </div>
   * <br>
   * <div>
   *   <b>Example 2:</b><br>
   *   <b>Input:</b> coins = [2], amount = 3<br>
   *   <b>Output:</b> -1<br>
   * </div>
   * <br>
   * <div>
   *   <b>Example 3:</b><br>
   *   <b>Input:</b> coins = [1,3,4,5], amount = 7<br>
   *   <b>Output:</b> 2<br>
   *   <b>Explanation:</b> 7 = 3 + 4<br> Note : - we can't be greedy here by choosing always the max
   *   coin value (in this case 5 + 1 + 1, would result in 3, which is not minimum coins)
   * </div>
   */
  public static void main(String[] args) {
    int[] coins = {1,3,4,5};
    int amount = 0;
    int output = coinChange(coins, amount);
    System.out.println(output);
  }

  // bottom-up approach
  private static int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0; // min no of coins required to amount to 0 money.

    for (int i = 1; i <= amount; i++) {
      for(int coin: coins) {
        if (i - coin >= 0) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coin]); // recurrence relation
        }
      }
    }
    int result = dp[amount];
    return result != amount + 1 ? result : -1;
  }


}
