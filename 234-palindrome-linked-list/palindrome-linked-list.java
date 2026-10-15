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
    ListNode front;

    public boolean isPalindrome(ListNode head) {
        front = head;
        return check(head);
    }

    private boolean check(ListNode current) {
        if (current == null) {
            return true;
        }

    
        if (!check(current.next)) {
            return false;
        }

        
        if (front.val != current.val) {
            return false;
        }

        front = front.next;
        return true;
    }
}
