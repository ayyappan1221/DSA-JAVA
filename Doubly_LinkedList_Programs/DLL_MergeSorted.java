class Solution {
    public DoublyNode merge(DoublyNode h1,DoublyNode h2){
        if(h1==null)return h2;
        if(h2==null)return h1;

        if(h1.data<=h2.data){
            h1.next=merge(h1.next,h2);
            if(h1.next!=null)h1.next.prev=h1;
            h1.prev=null;
            return h1;
        }else{
            h2.next=merge(h1,h2.next);
            if(h2.next!=null)h2.next.prev=h2;
            h2.prev=null;
            return h2;
        }
    }
}