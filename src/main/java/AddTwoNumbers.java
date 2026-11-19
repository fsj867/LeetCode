public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        int plus = 0;
        while (l1 != null || l2 != null){
            int cunt = plus;
            if (l1 != null){
                cunt += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                cunt += l2.val;
                l2 = l2.next;
            }
            plus = cunt /10;

            ListNode node = new ListNode(cunt % 10);
            cur.next = node;
            cur = cur.next;
        }
        if(plus != 0){
            ListNode node = new ListNode(plus);
            cur.next = node;
        }
        return dummy.next;
    }

}
