/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        // Find the length/size of list.
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        System.out.println(len);
        if(len==1) return null;
        if(len-n==0) return head.next;
        //Reach to the node before the one you want to delete.
        int count=1;
        temp=head;
        //If len is 5, 2nd element from last means 3rd element from start.
        while(count!=len-n)
        {
            temp=temp.next;
            count++;
        }
        System.out.println(temp.val);
        temp.next=temp.next.next;
    return head;
    }
}