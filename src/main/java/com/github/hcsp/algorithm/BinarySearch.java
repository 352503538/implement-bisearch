package com.github.hcsp.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "bbb"));
        System.out.println(binarySearch(new String[]{"aaa", "ccc", "fff", "yyy", "zzz"}, "yyy"));
    }


    // 给定一个按照字符串升序升序排好序的用户数组，寻找目标字符串的位置，返回其索引值
    // 如果未找到，返回-1
    // 我们鼓励你使用递归和非递归两种方式
    public static int binarySearch(String[] strings, String target) {
        int start = 0;
        int end = strings.length - 1;
        int mid = (start + end) / 2;
        while (true) {
            if (target.compareTo(strings[start]) < 0 || target.compareTo(strings[end]) > 0) {
                return -1;
            }
            if (target.compareTo(strings[start]) == 0) {
                return start;
            }
            if (target.compareTo(strings[end]) == 0) {
                return end;
            }

            if (target.compareTo(strings[mid]) < 0) {
                end = mid;
                start++;
            } else if (target.compareTo(strings[mid]) > 0) {
                start = mid;
                end--;
            }
            mid = (start + end) / 2;
        }
    }
}
