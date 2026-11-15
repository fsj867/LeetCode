import java.util.HashSet;
import java.util.Map;
import java.util.Set;
// 最长连续序列 遍历set
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            res.add(nums[i]);
        }
        for (int num : res ){
            if(!res.contains(num - 1)){
                int count = 1;
                while (res.contains(num+1)){
                    count ++;
                    num ++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}
