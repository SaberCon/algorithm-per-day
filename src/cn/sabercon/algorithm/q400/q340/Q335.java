package cn.sabercon.algorithm.q400.q340;

/**
 * Self Cross
 *
 * You are given an array x of n positive numbers. You start at point (0,0) and moves x[0] metres to the north,
 * then x[1] metres to the west, x[2] metres to the south, x[3] metres to the east and so on.
 * In other words, after each move your direction changes counter-clockwise.
 *
 * Write a one-pass algorithm with O(1) extra space to determine, if your path crosses itself, or not.
 *
 * Example 1:
 *
 * ┌───┐
 * │   │
 * └───┼──>
 *     │
 *
 * Input: [2,1,1,2]
 * Output: true
 * Example 2:
 *
 * ┌──────┐
 * │      │
 * │
 * │
 * └────────────>
 *
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * ┌───┐
 * │   │
 * └───┼>
 *
 * Input: [1,1,1,1]
 * Output: true
 *
 * @author ywk
 * @date 2020-04-26
 */
public class Q335 {

    public boolean isSelfCrossing(int[] x) {

        return false;
    }
}
