class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode l3 = new ListNode(0);
        ListNode current = l3;

        while (l1!=null || l2!=null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(sum%10);
            sum = (sum - sum % 10) / 10;
            current = current.next;
            }
        if (sum == 1) {
            current.next = new ListNode(1);
        }
        return l3.next;
    }
}
