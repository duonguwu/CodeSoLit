public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Khởi tạo ba con trỏ
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Khi cả p1 và p2 đều hợp lệ
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Nếu còn phần tử trong nums2 chưa được chèn vào nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
