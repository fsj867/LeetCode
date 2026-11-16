//11. 盛最多水的容器
public class MaxArea {

    public int maxArea(int[] height) {
        // 初始化左指针为数组起始位置
        int l = 0;
        // 初始化右指针为数组末尾位置
        int r = height.length - 1;

        int ans = 0;
        // 使用双指针法，当左指针小于右指针时循环
        while(l < r){
            // 计算当前左右指针所围成的面积
            // 宽度为两指针之间的距离(r - l)
            // 高度为两指针中较小的值(Math.min(height[l], height[r]))
            int res = (r - l) * Math.min(height[l],height[r]);
            // 更新最大面积
            ans = Math.max(ans,res);
            // 移动较短的指针，以寻找可能更大的面积
            if(height[l] < height[r]){
                l++;  // 如果左边高度较小，左指针右移
            }else {
                r--;  // 如果右边高度较小或相等，右指针左移
            }
        }
        // 返回计算得到的最大面积
        return ans;
    }
}
