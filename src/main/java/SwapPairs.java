public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        while (cur != null && cur.next != null){
            ListNode temp = cur.next;
            pre.next = temp;
            cur.next = temp.next;
            temp.next = cur;
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
