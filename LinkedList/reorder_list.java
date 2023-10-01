package LinkedList;

import LinkedList.palindrome_linked_list.ListNode;

public class reorder_list {
    class Solution {
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,temp=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        return ;
        ListNode h1=head;
        ListNode t1=mid(head);
        ListNode t2=t1.next;
        t1.next=null;
        ListNode h2=reverse(t2);
        while(h2!=null){
            ListNode temp=h1.next;
            ListNode node=h2;
            h2=h2.next;
            h1.next=node;
            node.next=temp;
            h1=h1.next.next;
        }
     
        
    }
}
}
