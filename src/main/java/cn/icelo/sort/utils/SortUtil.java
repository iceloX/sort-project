package cn.icelo.sort.utils;

import cn.icelo.sort.enums.SortName;

public class SortUtil {

    /**
     * 比较大小
     *
     * @param v 第一参数
     * @param w 第二参数
     * @return 结果
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交互数组
     *
     * @param a 比较的数组
     * @param i 下标
     * @param j 下标
     */
    public static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印数组
     * @param a 数组
     */
    public static void show( Comparable[] a) {
        // 在单行中打印数组

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 检测是否已经排序成功
     *
     * @param a 数组
     * @return 结果
     */
    public static boolean checkIsSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[-1])) {
                return false;
            }
        }
        return true;
    }

}
