public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        int mid = lists.length / 2;
        ListNode[] leftlist = new ListNode[mid];
        for(int i = 0; i < mid; i++){
            leftlist[i] = lists[i];
        }
        ListNode[] rightlist = new ListNode[lists.length - mid];
        for(int i = 0; i < lists.length - mid; i++){
            rightlist[i] = lists[mid + i];
        }
        ListNode left = mergeKLists(leftlist);
        ListNode right = mergeKLists(rightlist);
        return merge(left,right);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
