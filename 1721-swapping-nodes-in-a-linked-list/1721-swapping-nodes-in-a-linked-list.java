class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node1 = head;
        for(int i = 1;i<k;i++){
            node1 = node1.next;

        }
        ListNode node2 = head;
        ListNode temp = node1;

        while(temp.next !=null){
            temp = temp.next;
            node2 = node2.next;


        } 
        int data = node1.val;
        node1.val = node2.val;
        node2.val = data;
        return head;
    }
}