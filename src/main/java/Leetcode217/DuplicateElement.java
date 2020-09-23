package Leetcode217;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    DuplicateElement d = new DuplicateElement();
    Scanner s = new Scanner(System.in);
    int n;
    n = s.nextInt();
    int nums[] = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = s.nextInt();
    }
    boolean res = d.containsDuplicate(nums);
    System.out.println(res);
  }
}
