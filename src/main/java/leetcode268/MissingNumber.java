package leetcode268;

import java.util.Scanner;

public class MissingNumber {
  public int missingNumber(int[] nums) {
    int sumofDigit = nums.length * (nums.length + 1) / 2;
    int mainSum = 0;
    for (int i = 0; i < nums.length; i++) {
      mainSum = nums[i] + mainSum;
    }
    return sumofDigit - mainSum;
  }

  public static void main(String[] args) {
    MissingNumber m = new MissingNumber();
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("Enter number of elements you want in array: ");
    n = s.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter an array: ");
    for (int i = 0; i < n; i++) {
      nums[i] = s.nextInt();
    }
    int res = m.missingNumber(nums);
    System.out.println(res);
  }
}
