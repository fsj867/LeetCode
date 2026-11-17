import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(o1, o2) -> o1[0] - o2[0]);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i = 0;i<intervals.length;i++){
            int[] last = ans.get(ans.size() -1);
            int l = last[0];
            int r = last[1];
            if(intervals[i][0] <= r){
                last[1] = Math.max(r,intervals[i][1]);
            }else {
                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
