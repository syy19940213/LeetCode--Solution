import com.sun.applet2.AppletParameters;

import java.util.*;

/**
 * Created by syy on 2017/2/27.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
       int max = 0 ;
       HashMap<Character,Integer> map = new HashMap<Character,Integer>();
       for (int right = 0 ,left = 0 ; right < s.length() ; right++){
           if (map.containsKey(s.charAt(right))){
               left = Math.max(left,map.get(s.charAt(right))+1);
           }
           map.put(s.charAt(right),right);
           max = Math.max(max,right-left+1);
       }
       return max;
    }
}
