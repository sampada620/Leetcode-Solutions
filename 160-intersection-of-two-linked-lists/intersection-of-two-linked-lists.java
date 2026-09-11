/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode HeadA, ListNode HeadB) {
        ListNode a=HeadA;
        ListNode b=HeadB;

        while(a!=b){
            a=(a==null)?HeadB:a.next;
            b=(b==null)?HeadA:b.next;
        }
        return a;
        
    }
}