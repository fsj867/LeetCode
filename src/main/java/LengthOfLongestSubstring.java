import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
             while (l < i && set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            ans = Math.max(ans,(i- l + 1));
        }
        return ans;
    }
}
