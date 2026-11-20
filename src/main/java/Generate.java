import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list);
        for(int i = 2; i <= numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1; j <i-1; j++){
                row.add(list.get(j-1) + list.get(j));
            }
            row.add(1);
            ans.add(row);
            list = row;
        }
        return ans;
    }
}
