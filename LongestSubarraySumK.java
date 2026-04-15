class LongestSubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;

        int left = 0, sum = 0, maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Max Length: " + maxLength);
    }
}
