/*
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 *
 */

class Solution {

    public static int searchInsert(int[] nums, int target) {

        int position = -1;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                position = i;
                break;
            } else if (target > nums[i]) {
                continue;
            } else {
                position = i;
                break;
            }
        }

        if (position == -1) {
            position = nums.length;
        }

        return position;
    }
}
