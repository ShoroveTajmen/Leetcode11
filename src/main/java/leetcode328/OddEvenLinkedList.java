package leetcode328;

public class OddEvenLinkedList {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode oddhead = new ListNode(head.val);
    ListNode odd = oddhead;
    ListNode evenhead = new ListNode(head.next.val);
    ListNode even = evenhead;
    ListNode temp = head.next.next;

    while (temp != null) {
      odd.next = new ListNode(temp.val); // ??
      odd = odd.next;
      if (temp.next != null) {
        even.next = new ListNode(temp.next.val);
        even = even.next;
        temp = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
    odd.next = evenhead;
    return oddhead;
  }

  public static void display(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
      System.out.println(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    OddEvenLinkedList s1 = new OddEvenLinkedList();

    ListNode n1 = new ListNode(1);
    n1.next = new ListNode(2);
    n1.next.next = new ListNode(3);
    n1.next.next.next = new ListNode(4);
    n1.next.next.next.next = new ListNode(5);

    display(n1);
    ListNode newNode = s1.oddEvenList(n1);
    display(newNode);
  }
}
