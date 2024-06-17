public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Đảm bảo nums1 là mảng ngắn hơn
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        int halfLen = (m + n + 1) / 2;
        int imin = 0, imax = m;

        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = halfLen - i;

            if (i < m && nums1[i] < nums2[j - 1]) {
                // i quá nhỏ, cần tăng i
                imin = i + 1;
            } else if (i > 0 && nums1[i - 1] > nums2[j]) {
                // i quá lớn, cần giảm i
                imax = i - 1;
            } else {
                // i là hoàn hảo
                int maxOfLeft;
                if (i == 0) { maxOfLeft = nums2[j - 1]; }
                else if (j == 0) { maxOfLeft = nums1[i - 1]; }
                else { maxOfLeft = Math.max(nums1[i - 1], nums2[j - 1]); }

                if ((m + n) % 2 == 1) {
                    return maxOfLeft; // Tổng số phần tử lẻ
                }

                int minOfRight;
                if (i == m) { minOfRight = nums2[j]; }
                else if (j == n) { minOfRight = nums1[i]; }
                else { minOfRight = Math.min(nums1[i], nums2[j]); }

                return (maxOfLeft + minOfRight) / 2.0; // Tổng số phần tử chẵn
            }
        }

        return 0.0; // Không thể xảy ra
    }
}
