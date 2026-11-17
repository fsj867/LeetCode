public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int[] dp = new int[nums.length + 1];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1] + nums[i-1],nums[i-1]);
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
