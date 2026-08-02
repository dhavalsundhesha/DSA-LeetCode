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
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;

        return check(head);
    }
    public boolean  check (ListNode right) {

        //Base case 
        if(right == null) {
            return true;
        }

        //last  node 
        if(!check(right.next))  {
            return  false;

        }
        //left and  right  compare 
        if(left.val !=right.val) {
            return false;

        }
        //Pointer Forverd
        left = left.next;

        return true;
    }
}