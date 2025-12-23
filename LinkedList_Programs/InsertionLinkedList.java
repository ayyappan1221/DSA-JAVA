class Solution {
    public ListNode insertAtBegin(ListNode head,int val){
        ListNode node=new ListNode(val);
        node.next=head;
        return node;
    }

    public ListNode insertAtEnd(ListNode head,int val){
        ListNode node=new ListNode(val);
        if(head==null)return node;
        ListNode temp=head;
        while(temp.next!=null)temp=temp.next;
        temp.next=node;
        return head;
    }

    public ListNode insertAtPos(ListNode head,int val,int pos){
        if(pos==1)return insertAtBegin(head,val);
        ListNode temp=head;
        for(int i=1;i<pos-1;i++)temp=temp.next;
        ListNode node=new ListNode(val);
        node.next=temp.next;
        temp.next=node;
        return head;
    }
}