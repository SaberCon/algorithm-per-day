package cn.sabercon.algorithm.q200.q140;

/**
 * Single Number
 *
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * @author ywk
 * @date 2020-03-23
 */
public class Q136 {

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int num : nums) {
            a ^= num;
        }
        return a;
    }
}
