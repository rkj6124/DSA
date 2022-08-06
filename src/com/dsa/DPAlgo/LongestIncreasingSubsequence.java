package com.dsa.DPAlgo;

public class LongestIncreasingSubsequence {


  public static void main(String[] args) {
    int[] nums = {1,3,6,7,9,4,10,5,6};
    System.out.println(lengthOfLIS(nums));
    System.out.println(lengthOfLISnlogn(nums));
  }
  public static int lengthOfLIS(int[] nums) {
    int length = nums.length;
    int[] lis = new int[length];
    lis[length-1] = 1;
    int max = 1;
    for(int i = length - 2; i > -1; i--) {
      lis[i] = 1;
      for (int j = i+1; j < length; j++) {
        if (nums[i] < nums[j]) {
          lis[i] = Math.max(lis[i], Math.max(1, 1 + lis[j]));
        }
      }
      max = Math.max(max, lis[i]);
    }
    return max;
  }

  public static int lengthOfLISnlogn(int[] nums) {
    int[] lis = new int[nums.length];
    lis[0] = nums[0];
    int k = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > lis[k]) {
        lis[++k] = nums[i];
      } else {
        int index = getNextBigIndex(nums[i], lis, k);
        lis[index] = nums[i];
      }
    }
    return k + 1;
  }

  public static int getNextBigIndex(int num, int[] arr, int end) {
    int start = 0;
    int ans = -1;
    while(start<=end) {
      int mid = (start + end) / 2;
      if (arr[mid] < num) {
        start = mid + 1;
      } else {
        ans = mid;
        end = mid-1;
      }

    }
    return ans;
  }
}
