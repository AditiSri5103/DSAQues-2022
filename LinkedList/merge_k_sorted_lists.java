package LinkedList;

public class merge_k_sorted_lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    class Solution {
        public ListNode merge(ListNode l1,ListNode l2){
            ListNode dummy=new ListNode(),node,st,st2;
            st=dummy;
            st2=dummy;
            while(l1!=null && l2!=null){
                if(l1.val<=l2.val){
                    node=new ListNode(l1.val);
                l1=l1.next;
                }
               else{
                    node=new ListNode(l2.val);
                l2=l2.next;
    
                }
                st.next=node;
                st=st.next;
            }
           if(l1!=null){
                st.next=l1;
            }
            if(l2!=null){
                st.next=l2;
            }
           
            System.out.println();
            return dummy.next;
        }
    
        public ListNode mergeKLists(ListNode[] lists) {
            int n=lists.length;
            if(n==0)
            return null;
            if(n==1)
            return lists[0];
            int c=0;
            ListNode l1=lists[c],l2;
            c++;
            
            while(c<n){
                l2=lists[c];
                l1=merge(l1,l2);
                c++;
            }
            return l1;
        }
    }
}
}