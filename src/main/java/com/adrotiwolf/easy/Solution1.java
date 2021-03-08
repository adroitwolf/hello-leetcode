package com.adrotiwolf.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author adroitwolf
 * @version 1.0.0
 * @ClassName Solution7.java
 * @Description 两数之和
 * @createTime 2021年03月08日 10:46:00
 */
public class Solution1 {

    public static void main(String[] args) {
        int [] nums = {2,7,11, 15};
        int target = 22;
        int[] ints = twoSum(nums, target);
        Arrays.stream(ints).forEach(System.out::println);
    }


    public static int[] twoSum(int [] input,int target){
        Map<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        for (int i  = 0;i< input.length;i++){
            Integer rs = Integer.valueOf(target-input[i]);
            if(map.containsKey(rs)){
                result[0] = i;
                result[1] = map.get(rs);
            }else {
                map.put(input[i],i);
            }
        }
        return result;
    }
}
