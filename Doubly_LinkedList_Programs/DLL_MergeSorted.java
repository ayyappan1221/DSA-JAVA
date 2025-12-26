class Solution {
    public DoublyNode merge(DoublyNode head1,DoublyNode head2){
        if(head1==null)return head2;
        if(head2==null)return head1;

        if(head1.data<=head2.data){
            head1.next=merge(head1.next,head2);
            if(head1.next!=null)head1.next.prev=head1;
            head1.prev=null;
            return head1;
        }else{
            head2.next=merge(head1,head2.next);
            if(head2.next!=null)head2.next.prev=head2;
            head2.prev=null;
            return head2;
        }
    }
}