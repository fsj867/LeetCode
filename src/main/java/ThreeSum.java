import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            int l = i + 1;
            int r = nums.length - 1;
            if (i > 0 && nums[i-1] == nums[i]) continue;
            while (l < r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                }else if (nums[i] + nums[l] + nums[r] > 0){
                    r--;
                }else if(nums[i] + nums[l] + nums[r] < 0){
                    l++;
                }
            }
        }
        return ans;
    }
}
