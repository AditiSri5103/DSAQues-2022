package LinkedList;

public class merge_two_sorted_lists {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1,l2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode itr=dummy;
        ListNode node;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                node=new ListNode(l1.val);
                l1=l1.next;
            }
            else {
                node=new ListNode(l2.val);
                l2=l2.next;
            }
            itr.next=node;
            itr=itr.next;
        }
        if(l1!=null)
        itr.next=l1;
        else if(l2!=null)
        itr.next=l2;
        return dummy.next;

    }
}
}
}
