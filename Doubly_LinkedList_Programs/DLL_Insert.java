class Solution {
    public DoublyNode insertAtBegin(DoublyNode head,int val){
        DoublyNode node=new DoublyNode(val);
        if(head!=null){
            node.next=head;
            head.prev=node;
        }
        return node;
    }

    public DoublyNode insertAtEnd(DoublyNode head,int val){
        DoublyNode node=new DoublyNode(val);
        if(head==null)return node;
        DoublyNode temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.next=node;
        node.prev=temp;
        return head;
    }

    public DoublyNode insertAtPos(DoublyNode head,int val,int pos){
        if(pos==1)return insertAtBegin(head,val);
        DoublyNode temp=head;
        for(int i=1;i<pos-1;i++)temp=temp.next;
        DoublyNode node=new DoublyNode(val);
        node.next=temp.next;
        node.prev=temp;
        if(temp.next!=null)temp.next.prev=node;
        temp.next=node;
        return head;
    }
}