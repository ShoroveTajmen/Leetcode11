package leetcode12;

import java.util.Scanner;

public class IntegertoRoman {
  public String intToRoman(int num) {
    String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    String res = " ";
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    int i = 0;
    while (num > 0) {
      if (num - values[i] < 0) {
        i++;
        continue;
      } else {
        res += keys[i];
        num -= values[i];
      }
    }
    return res;
  }

  public static void main(String[] args) {
    IntegertoRoman i = new IntegertoRoman();
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("Enter an integer number: ");
    n = s.nextInt();
    String res2 = i.intToRoman(n);
    System.out.println(res2);
  }
}
