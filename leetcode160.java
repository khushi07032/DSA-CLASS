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
public class leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        int lenA =0;
        int lenB =0;
        while(currA!=null){
            lenA++;
            currA = currA.next; 
        }
        while(currB!=null){
            lenB++;
            currB = currB.next;
        }
        currA = headA;
        currB = headB;
        int diff = Math.abs(lenA-lenB);
        if(lenA>lenB){
            while(diff>0){
                currA = currA.next;
                diff--;
            }
        }else if(lenB>lenA){
            while(diff>0){
                currB = currB.next;
                diff--;
            }
        }
        while(currA!=currB){
            currA = currA.next;
            currB = currB.next;
        }
        return currA;

    }
}
