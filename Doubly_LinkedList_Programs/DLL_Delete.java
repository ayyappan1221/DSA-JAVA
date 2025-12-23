class Solution {
    public DoublyNode deleteAtBegin(DoublyNode head){
        if(head==null)return null;
        head=head.next;
        if(head!=null)head.prev=null;
        return head;
    }

    public DoublyNode deleteAtEnd(DoublyNode head){
        if(head==null||head.next==null)return null;
        DoublyNode temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.prev.next=null;
        return head;
    }

    public DoublyNode deleteAtPos(DoublyNode head,int pos){
        if(pos==1)return deleteAtBegin(head);
        DoublyNode temp=head;
        for(int i=1;i<pos;i++)temp=temp.next;
        temp.prev.next=temp.next;
        if(temp.next!=null)temp.next.prev=temp.prev;
        return head;
    }
}