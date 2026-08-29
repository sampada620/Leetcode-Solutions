class Solution {

    void swapIfGreater(int[] arr1, int[] arr2, int i, int j) {
        if (arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int len = m + n;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                if (left < m && right >= m) {
                    swapIfGreater(nums1, nums2, left, right - m);
                }

                else if (left >= m) {
                    swapIfGreater(nums2, nums2, left - m, right - m);
                }

                else {
                    swapIfGreater(nums1, nums1, left, right);
                }

                left++;
                right++;
            }

            if (gap == 1) {
                gap = 0;
            }
            else {
                gap = (gap / 2) + (gap % 2);
            }
        }

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}