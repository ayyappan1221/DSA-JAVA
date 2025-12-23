class Solution {
    public DoublyNode middle(DoublyNode head){
        DoublyNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}