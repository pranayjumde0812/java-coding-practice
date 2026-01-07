package leetcode.integers;

/**
 * 172. Factorial Trailing Zeroes
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Example 3:
 * <p>
 * Input: n = 0
 * Output: 0
 */
public class FactorialTrailingZeros {
    public static int trailingZeroes(int n) {

        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }

    public static int trailingZeroes2(int n) {

        int count = 0;
        int currentPowerOfFive = 5;

        while (n >= currentPowerOfFive) {
            count += (n / currentPowerOfFive);
            currentPowerOfFive *= 5;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(26));
        System.out.println("=========================");
        System.out.println(trailingZeroes2(125));
    }
}
