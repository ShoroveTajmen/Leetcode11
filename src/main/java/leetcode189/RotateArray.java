package leetcode189;

import java.util.Scanner;

public class RotateArray {
  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
    System.out.println(java.util.Arrays.toString(nums));
  }

  public static void main(String[] args) {
    RotateArray r = new RotateArray();
    Scanner s = new Scanner(System.in);
    int n;
    int k;
    System.out.println("Enter the length of the array:");
    n = s.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      nums[i] = s.nextInt();
    }
    r.rotate(nums, 3);
  }
}
