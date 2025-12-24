package leetcode.integers;

/**
 * 9. Palindrome Number
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;

        if (num != 0 && num % 10 == 0) return false;

        int reverse = 0;

        while (num > reverse) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        return (reverse == num) || (num == reverse / 10);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(100001));

    }
}
