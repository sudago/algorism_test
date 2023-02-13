package leetcode.num83_remove_duplicates_from_sorted_list;


public class Solution {
    public static ListNode deleteDuplicates(ListNode head) {

        // 1. Iteration
        ListNode dHead = new ListNode(Integer.MIN_VALUE);
        ListNode cursor = dHead;
        dHead.next = head;

        while(cursor.next != null){
            if(cursor.val == cursor.next.val){
                cursor.next = cursor.next.next;
            }else{
                cursor = cursor.next;
            }
        }
        return dHead.next;
    }
}
