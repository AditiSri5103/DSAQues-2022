import java.util.*;

public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next;
         }
        }

class Solution {
    public void reorderList(ListNode head) {
        // Break the list in 2 equal halves
        // Reverse the 2nd list
        ListNode head1=head;
        ListNode head2;
        ListNode ptr1=head;
        ListNode ptr2=head;
        // for finding middle of list using slow fast method
        while(ptr2!=null && ptr2.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        head2=ptr1.next;
        ptr1.next=null;
        // Reversing the list 2
        ListNode prev=null;
        ListNode curr=head2;
        ListNode temp=head2;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head2=prev;

        temp=null;
        while(head1!=null && head2!=null){
            temp=head1.next;
            head1.next=head2;
            head2=head2.next;
            head1=head1.next;
            head1.next=temp;
            head1=head1.next;
        }
    
    }
}