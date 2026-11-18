public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rightHead;
        if(fast != null){
            rightHead = reverse(slow.next);
        }else {
            rightHead = reverse(slow);
        }
        ListNode leftHead = head;
        while (rightHead != null){
            if(leftHead.val != rightHead.val){
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
