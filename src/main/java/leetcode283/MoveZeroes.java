package leetcode283;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int n = nums.length;
    if (n == 0) return;
    int k = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] != 0) {
        nums[k] = nums[i];
        k++;
      }
    }
    for (int i = k; i < nums.length; i++) {
      nums[i] = 0;
    }

    return;
  }

  public static void main(String[] args) {
    MoveZeroes m = new MoveZeroes();
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("Enter no of element you want in array: ");
    n = s.nextInt();
    int[] nums1 = new int[n];
    System.out.println("Enter all the element: ");
    for (int i = 0; i < n; i++) {
      nums1[i] = s.nextInt();
    }
    m.moveZeroes(nums1);
    System.out.println(Arrays.toString(nums1));
  }
}
