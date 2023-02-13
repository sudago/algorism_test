package leetcode.num83_remove_duplicates_from_sorted_list;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "val : " + val + " next : " + next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2)));
        System.out.println(listNode);
        System.out.println(Solution.deleteDuplicates(listNode));
    }
}
