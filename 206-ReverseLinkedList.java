/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode rev = null;
        ListNode curr = head;
        while (curr != null) {
            temp = rev;
            rev = curr;
            curr = curr.next;
            rev.next = temp;
        }
        return rev;
    }
}
