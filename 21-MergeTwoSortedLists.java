class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode one = l1;
        ListNode two = l2;
        ListNode merged = new ListNode();
        ListNode head = merged;
        
        while (one != null && two != null) {
            ListNode newNode;
            
            if (one.val <= two.val) {
                newNode = new ListNode(one.val);
                merged.next = newNode;
                merged = merged.next;
                one = one.next;
            } else {
                newNode = new ListNode(two.val);
                merged.next = newNode;
                merged = merged.next;
                two = two.next;
            }
        }
        if (two != null) {
            merged.next = two;
        }
        if (one != null) {
            merged.next = one;
        }
        return head.next;
    }
}
