class Solution {
    public DoublyNode reverse(DoublyNode head){
        DoublyNode temp=null,cur=head;
        while(cur!=null){
            temp=cur.prev;
            cur.prev=cur.next;
            cur.next=temp;
            head=cur;
            cur=cur.prev;
        }
        return head;
    }
}