package com.adrotiwolf.easy;

/**
 * Created with IntelliJ IDEA.
 * User: ADROITWOLF
 * Time: 2021 2021/3/8 21:11
 * Description:  反转数字
 */
public class Solution7 {
    public static void main(String[] args) {
        int reverse = reverse(-2147483648);
        System.out.println(reverse);
    }

    public static int reverse(int input){
        long tmp = 0L;
        while (input != 0){ // 必须不等于0
            tmp = tmp *10 + input % 10;
            if(tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE){ // 如果是负数，最后加一个符号就ok
                return  0;
            }
            input = input /10;
        }
        return (int)tmp;
    }
}
