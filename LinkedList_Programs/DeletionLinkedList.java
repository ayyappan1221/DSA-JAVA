class Solution {
    public ListNode deleteAtBegin(ListNode head){
        if(head==null)return null;
        return head.next;
    }

    public ListNode deleteAtEnd(ListNode head){
        if(head==null||head.next==null)return null;
        ListNode temp=head;
        while(temp.next.next!=null)temp=temp.next;
        temp.next=null;
        return head;
    }

    public ListNode deleteAtPos(ListNode head,int pos){
        if(head==null)return null;
        if(pos==1)return head.next;
        ListNode temp=head;
        for(int i=1;i<pos-1;i++)temp=temp.next;
        temp.next=temp.next.next;
        return head;
    }
}