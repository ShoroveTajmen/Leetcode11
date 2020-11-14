package leetcode148;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static void display(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.println(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public ListNode sortList(ListNode head) {
    if (head == null) return null;
    ListNode temp = head;
    ListNode temp1 = head;
    ArrayList<Integer> a1 = new ArrayList<>();
    while (head != null) {
      a1.add(head.val);
      head = head.next;
    }
    int i = 0;
    Collections.sort(a1);
    int size = a1.size() - 1;
    while (size >= 0) {
      temp.val = a1.get(i);
      i++;
      size--;
      temp = temp.next;
    }
    return temp1;
  }

  public static void main(String[] args) {
    SortList s1 = new SortList();
    ListNode L = new ListNode(4);
    L.next = new ListNode(2);
    L.next.next = new ListNode(1);
    L.next.next.next = new ListNode(3);

    display(L);
    s1.sortList(L);
    display(L);
  }
}
