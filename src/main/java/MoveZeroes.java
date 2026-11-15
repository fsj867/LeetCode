/**
 * 移动零
 */
public class MoveZeroes {
    /**
     * 将数组中的所有零移动到数组末尾的方法
     * @param nums 需要处理的整数数组
     */
    public void moveZeroes(int[] nums) {
        // 初始化指针l，用于记录非零元素应该放置的位置
        int l = 0;
        // 遍历数组，将所有非零元素移动到数组前面
        for(int i = 0; i< nums.length;i++) {
            // 如果当前元素不是零，则将其放到指针l的位置，并递增l
            if(nums[i] != 0){
              nums[l] = nums[i];
              l++;
            }
        }
        // 将指针l之后的所有位置填充为零
        for (int i = l;i < nums.length;i++){
            nums[i] = 0;
        }
    }
}
