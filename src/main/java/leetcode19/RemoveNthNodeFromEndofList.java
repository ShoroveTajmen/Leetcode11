package leetcode19;

import java.util.List;

public class RemoveNthNodeFromEndofList {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static void Display(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.println(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp = new ListNode(0);
    temp.next = head;
    ListNode fast = temp;
    ListNode slow = temp;
    for (int i = 1; i <= n + 1; i++) {
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return temp.next;
  }

  public static void main(String[] args) {
    RemoveNthNodeFromEndofList r = new RemoveNthNodeFromEndofList();
    ListNode n1 = new ListNode(1);
    n1.next = new ListNode(2);
    n1.next.next = new ListNode(3);
    n1.next.next.next = new ListNode(4);
    n1.next.next.next.next = new ListNode(5);
    Display(n1);
    int n = 3;
    r.removeNthFromEnd(n1, n);
    Display(n1);
  }
}
