class Solution {

    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);

        // Target not found
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    // First index where value >= target
    private int lowerBound(int[] nums, int target) {

        int low = 0;
        int high = nums.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] >= target)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    // First index where value > target
    private int upperBound(int[] nums, int target) {

        int low = 0;
        int high = nums.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > target)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }
}