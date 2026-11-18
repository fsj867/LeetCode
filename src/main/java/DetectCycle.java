public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag = true;
                break;
            }
        }
        if (!flag){
            return null;
        }else {
            slow = head;
            while (true){
                if (slow == fast){
                    return slow;
                }
                slow = slow.next;
                fast = fast.next;
            }
        }
    }
}
