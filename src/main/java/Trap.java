/**
 * 接雨水
 * 使用双指针法计算给定数组能够接住的雨水量
 */
public class Trap {
    /**
     * 计算能够接住的雨水量
     * @param height 高度数组，表示地形的高度
     * @return 可以接住的雨水的总量
     */
    public int trap(int[] height) {
        // 初始化左右两侧的最大高度
        int leftMax  = 0;
        int rightMax = 0;
        // 初始化左右指针
        int l = 0,r = height.length - 1;
        // 初始化结果
        int ans = 0;
        // 使用双指针遍历数组
        while (l < r){
            // 更新左侧最大高度
            leftMax = Math.max(leftMax,height[l]);
            // 更新右侧最大高度
            rightMax = Math.max(rightMax,height[r]);
            // 如果左侧高度小于右侧高度
            if(height[l] < height[r]){
                // 累加当前左侧位置的雨水量
                ans += (leftMax - height[l]);
                // 左指针右移
                l++;
            }else {
                // 累加当前右侧位置的雨水量
                ans += (rightMax - height[r]);
                // 右指针左移
                r--;
            }

        }
        // 返回总雨水量
        return ans;
    }
}
