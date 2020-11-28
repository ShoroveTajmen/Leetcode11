package leetcode138;

import leetcode328.OddEvenLinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
  static class ListNode {
    int val;
    ListNode next;
    ListNode random;

    ListNode(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }

  public void display(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.println(temp.val + " ");
      temp = temp.next;
    }
    System.out.println(" ");
  }

  public ListNode copyRandomList(ListNode head) {
    Map<ListNode, ListNode> map = new HashMap<>();

    ListNode temp = head;
    while (temp != null) {
      ListNode newnode = new ListNode(temp.val);
      map.put(temp, newnode);
      temp = temp.next;
    }
    for (Map.Entry<ListNode, ListNode> entry : map.entrySet()) {
      ListNode xNode = entry.getKey();
      ListNode yNode = entry.getValue();

      yNode.next = map.get(xNode.next);
      yNode.random = map.get(xNode.random);
    }
    return map.get(head);
  }

  public static void main(String[] args) {
    CopyListwithRandomPointer c = new CopyListwithRandomPointer();
    ListNode n1 = new ListNode(7);
    n1.next = new ListNode(13);
    n1.next.next = new ListNode(11);
    n1.next.next.next = new ListNode(10);
    n1.next.next.next.next = new ListNode(1);

    n1.random = null;
    n1.next.random = n1;
    n1.next.next.random = n1.next.next.next.next;
    n1.next.next.next.random = n1.next.next;
    n1.next.next.next.next.random = n1;

    c.display(n1);
    ListNode newNode = c.copyRandomList(n1);
    c.display(newNode);
  }
}
