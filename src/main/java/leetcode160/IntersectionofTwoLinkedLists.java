package leetcode160;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static void print(ListNode n) {
    ListNode temp = n;
    while (temp != null) {
      System.out.println(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null && headB == null) return null;
    HashSet<ListNode> set = new HashSet<>();
    ListNode n1 = headA;
    ListNode n2 = headB;
    while (n1 != null) {
      set.add(n1);
      n1 = n1.next;
    }
    while (n2 != null) {
      if (set.contains(n2)) {
        return n2;
      }
      n2 = n2.next;
    }
    return null;
  }

  public static void main(String[] args) {

    ListNode n1 = new ListNode(2);
    n1.next = new ListNode(3);
    n1.next.next = new ListNode(4);
    n1.next.next.next = new ListNode(5);

    ListNode n2 = new ListNode(7);
    n2.next = new ListNode(8);
    n2.next.next = n1.next.next;

    print(n1);
    print(n2);
    System.out.println(getIntersectionNode(n1, n2).val);
  }
}
