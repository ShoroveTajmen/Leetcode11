package leetcode2;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.List;

public class AddTwoNumbers {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode res = null;
    ListNode prev = null;
    ListNode temp = null;
    int carry = 0, sum;
    while (l1 != null || l2 != null) {
      sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
      carry = sum / 10;
      sum = sum % 10;
      temp = new ListNode(sum);
      if (res == null) {
        res = temp;
      } else {
        prev.next = temp;
      }
      prev = temp;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
      if (carry > 0) {
        temp.next = new ListNode(carry);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    ListNode a1 = new ListNode(6);
    ListNode a2 = new ListNode(4, a1);
    ListNode a3 = new ListNode(9, a2);
    ListNode a4 = new ListNode(5, a3);
    ListNode headA = new ListNode(7, a4);

    ListNode b1 = new ListNode(4);
    ListNode headB = new ListNode(8, b1);

    ListNode res = addTwoNumbers(headA, headB);
    while (res != null) {
      System.out.println(res.val);
      res = res.next;
    }
  }
}
