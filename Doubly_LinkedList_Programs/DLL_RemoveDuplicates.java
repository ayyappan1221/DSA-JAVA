class Solution {
    public DoublyNode removeDuplicates(DoublyNode head){
        DoublyNode cur=head;
        while(cur!=null&&cur.next!=null){
            if(cur.data==cur.next.data){
                DoublyNode next=cur.next;
                cur.next=next.next;
                if(next.next!=null)
                    next.next.prev=cur;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}