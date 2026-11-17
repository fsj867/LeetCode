import java.util.*;

public class FindAnagrams {
/**
 * 查找字符串s中所有是字符串p的字母异位词的起始索引
 * 字母异位词是指由相同字母重新排列形成的不同字符串
 *
 * @param s 原始字符串
 * @param p 目标字符串
 * @return 返回所有起始索引的列表
 */
    public List<Integer> findAnagrams(String s, String p) {

    // 如果p的长度大于s，直接返回空列表，因为不可能存在异位词
        if (p.length() > s.length()) return new ArrayList<>();


    // 创建两个长度为26的数组，用于统计字母出现次数
        int[] s_nums = new int[26];  // 存储s中字母出现次数
        int[] p_nums = new int[26];  // 存储p中字母出现次数
        List<Integer> ans = new ArrayList<>();  // 存储结果列表
    // 初始化两个数组，统计p长度范围内s和p的字母出现次数
        for(int i = 0; i < p.length(); i++){
            s_nums[s.charAt(i) - 'a']++;  // 统计s中字母出现次数
            p_nums[p.charAt(i) - 'a']++;  // 统计p中字母出现次数
        }
    // 比较初始窗口是否匹配，如果匹配则将0加入结果列表
        if(Arrays.equals(s_nums,p_nums)){
            ans.add(0);
        }

    // 滑动窗口遍历s
        for(int i = 0; i < s.length() - p.length(); i++) {

        // 窗口向右移动一位，更新s_nums数组
            s_nums[s.charAt(i) - 'a'] --;      // 移除窗口最左边的字母
            s_nums[s.charAt(i + p.length()) - 'a']++;  // 添加窗口新进入的字母
        // 每次移动后比较两个数组是否相等，如果相等则记录起始位置
            if (Arrays.equals(s_nums,p_nums)){
                ans.add(i+1);  // 匹配时记录新的起始位置
            }
        }
        return ans;  // 返回所有匹配的起始位置列表
    }
}
