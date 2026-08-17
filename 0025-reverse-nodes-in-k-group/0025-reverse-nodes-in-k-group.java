class Solution {
      public ListNode reverse(ListNode curr, ListNode tail) {
        ListNode prev = null;
        while(curr != tail){
            ListNode next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        return prev;

      }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = head;

        for(int i = 0;i<k;i++){
            if(tail==null){
                return head;
            }
            tail = tail.next;

        }
        ListNode newhead = reverse(head,tail);
        head.next = reverseKGroup(tail,k);
        return newhead;
    }
}