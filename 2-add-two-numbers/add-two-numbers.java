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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;

        // Duyệt qua từng node của cả hai danh sách
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            
            // Cập nhật giá trị nhớ
            carry = sum / 10;
            // Tạo node mới với giá trị số đơn vị của tổng
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Di chuyển đến node tiếp theo
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        
        // Nếu còn giá trị nhớ sau khi duyệt hết cả hai danh sách
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        
        // Trả về danh sách kết quả (bỏ qua node giả)
        return dummyHead.next;
    }
    
}