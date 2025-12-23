class Solution {
    public boolean isPalindrome(DoublyNode head){
        if(head==null)return true;
        DoublyNode tail=head;
        while(tail.next!=null)tail=tail.next;

        while(head!=tail&&head.prev!=tail){
            if(head.data!=tail.data)return false;
            head=head.next;
            tail=tail.prev;
        }
        return true;
    }
}