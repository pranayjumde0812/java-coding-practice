package leetcode.integers;

import java.util.HashSet;
import java.util.Set;

/**
 * 136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class SingleNumber {

    public static int singleNumber1(int[] nums) {
        if (nums.length == 1) return nums[0];

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
        // TC: O(n), SC: O(n)
    }

    public static int singleNumber2(int[] nums) {
        // XOR ^ Concept
        int singleNumber = 0;

        for (int num : nums) {
            singleNumber = singleNumber ^ num;
        }

        return singleNumber;
        // TC: O(n), SC: O(1)
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        System.out.println(singleNumber1(arr));

        System.out.println(singleNumber2(arr));
    }
}
