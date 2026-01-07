package leetcode.integers;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverseInteger(1234));
        System.out.println(reverseInteger(215621212));
        System.out.println(reverseInteger(-190));
    }

    public static int reverseInteger(int num) {

        int rev = 0;

        while (num != 0) {
            // Extract digits one by one.
            int digit = num % 10;

            // Divide num
            num = num / 10;

            // Before Adding to rev Please check Overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            // Build the reversed number.
            rev = rev * 10 + digit;

        }

        return rev;
    }

    public static int reverseInteger2(int num) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if (num == max || num == min) return 0;

        int reversed = 0;

        while (num != 0) {

            int lastDigit = num % 10; // Extract digits one by one.

            if (reversed > max / 10) return 0; // Positive Integer

            if (reversed < min / 10) return 0; // Negative Integer

            reversed = reversed * 10 + lastDigit;

            num = num / 10;  // Removing last number

        }

        return reversed;
    }
}


/**
 * Step 1: Extract digits
 * To extract last digit:
 * digit = x % 10
 * x % 10 gives the last digit.
 * x / 10 removes the last digit.
 * <p>
 * Step 2: Build reversed number
 * Suppose rev is your reversed number:
 * rev = rev * 10 + digit
 * <p>
 * Example: x = 123
 * rev = 0, digit = 3 → rev = 0*10 + 3 = 3
 * x = 12, digit = 2 → rev = 3*10 + 2 = 32
 * x = 1, digit = 1 → rev = 32*10 + 1 = 321
 * <p>
 * Step 3: Handle overflow
 * Before adding a new digit, check if rev will overflow:
 * For positive numbers:
 * if rev > INT_MAX / 10  → overflow
 * if rev == INT_MAX / 10 and digit > 7 → overflow
 * <p>
 * For negative numbers:
 * <p>
 * if rev < INT_MIN / 10  → overflow
 * if rev == INT_MIN / 10 and digit < -8 → overflow
 * <p>
 * <p>
 * Why 7 and -8?
 * <p>
 * INT_MAX = 2147483647 → last digit 7
 * <p>
 * INT_MIN = -2147483648 → last digit 8
 */