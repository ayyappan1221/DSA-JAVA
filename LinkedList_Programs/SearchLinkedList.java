class Solution {
    public boolean search(ListNode head,int target){
        while(head!=null){
            if(head.val==target)return true;
            head=head.next;
        }
        return false;
    }
}