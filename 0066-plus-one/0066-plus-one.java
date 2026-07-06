class Solution {
    public int[] plusOne(int[] digits) {

        // Traverse from the last digit to the first
        for (int i = digits.length - 1; i >= 0; i--) {

            // If current digit is less than 9
            if (digits[i] < 9) {
                digits[i]++;      // Increase it by 1
                return digits;    // No carry, return answer
            }

            // If digit is 9, make it 0 and carry 1
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 9, 99, 999)
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}