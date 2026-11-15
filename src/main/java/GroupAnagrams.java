import java.util.*;

// 字母异位词分组

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res =new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String string = new String(charArray);
            if (!res.containsKey(string)){
                res.put(string,new ArrayList<>());
            }
            res.get(string).add(str);
        }
        return res.values().stream().toList();
    }
}
