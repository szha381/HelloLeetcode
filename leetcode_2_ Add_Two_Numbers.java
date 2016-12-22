/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode tail = new ListNode(0);
    		ListNode res = tail;
    		int carry = 0;  //进位
    		
    		while(l1 != null || l2 != null){
    		
    				int v1 = 0;
    				int v2 = 0;
    				if(l1 != null){
						v1 = l1.val;
						l1 = l1.next;    					
    				}
    				if(l2 != null){
    					v2 = l2.val;
    					l2 = l2.next;
    				}
    				int temp = v1 + v2 + carry;
						    			
    				tail.next = new ListNode(temp % 10);
    				carry = temp / 10;
    				tail = tail.next;
    		}
    		if(carry == 1){
    			tail.next = new ListNode(1);
    		}
    
   			return res.next;
    }
}
