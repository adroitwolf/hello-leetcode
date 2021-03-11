package com.adroitwolf.easy;

/**
 * Created with IntelliJ IDEA.
 * User: ADROITWOLF
 * Time: 2021 2021/3/9 21:53
 * Description: ://TODO 回文数
 */
public class Solution9 {
    public static void main(String[] args) {
        System.out.println(isPalindromePlus(1001));


    }
    public static boolean isPalindrome(int x){ // 这是自己的思路
        if(x<0){
            return false;
        }
        int div = 1;
        while (x / div >=10) { //找寻x的位数
            div *= 10;
        }
        while (x != 0){
            int head = x /div;
            int end = x %10;
            if(head != end){
                return false;
            }
            x = (x % div) /10;  // 去除头和尾
            div /= 100;
        }
        return true;
    }
    public static boolean isPalindromePlus(int x){
        if(x <0 || (x%10 == 0 && x!= 0 )){
            return false;
        }
        int revertNum = 0;
        while (x> revertNum){ // 取 一半数字
            revertNum = revertNum * 10 + x %10 ;
            x = x/10;
        }
        return x == revertNum || x == revertNum /10;
    }
}
