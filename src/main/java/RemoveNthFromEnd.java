public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy.next;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        cur = dummy;
        count = count - n;
        while (count > 0){
            cur = cur.next;
            count++;
        }
        ListNode pre = cur;
        pre.next = cur.next;
        return dummy.next;
    }
}
