package com.adroitwolf.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ADROITWOLF
 * Time: 2021 2021/3/10 21:45
 * Description: ://TODO 罗马转数字
 */
public class Solution13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;

        for (int i = 0; i <= s.length() - 1; ) {
            if (i + 1 < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                int value = map.get(s.charAt(i));
                int next = map.get(s.charAt(i + 1));
                result += next - value;
                i += 2;
            } else {

                result += map.get(s.charAt(i));
                i++;
            }
        }

        return result;


    }
}
