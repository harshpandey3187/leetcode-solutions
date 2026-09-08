class Solution {
    public void sortColors(int[] nums) {
        // Dutch National flag Algorithm
        int left = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // 2 wala case
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}