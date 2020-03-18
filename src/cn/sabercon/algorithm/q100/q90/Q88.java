package cn.sabercon.algorithm.q100.q90;

/**
 * Merge Sorted Array
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * <p>
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 *
 * @author ywk
 * @date 2020-03-18
 */
public class Q88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1; i >= 0; i--) {
            nums1[n + i] = nums1[i];
        }
        int mPointer = n;
        int nPointer = 0;
        for (int i = 0; i < m + n; i++) {
            if (mPointer > m + n - 1) {
                nums1[i] = nums2[nPointer++];
            } else if (nPointer > n - 1) {
                nums1[i] = nums1[mPointer++];
            } else if (nums1[mPointer] < nums2[nPointer]) {
                nums1[i] = nums1[mPointer++];
            } else {
                nums1[i] = nums2[nPointer++];
            }
        }
    }
}
