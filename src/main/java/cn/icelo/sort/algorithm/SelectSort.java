package cn.icelo.sort.algorithm;

import cn.icelo.sort.enums.SortName;
import cn.icelo.sort.utils.SortUtil;

public class SelectSort extends AbstractSort {

    private static final String sortName = SortName.SELECT.getName();


    @Override
    public String getSortName() {
        return sortName;
    }

    @Override
    public void setSortName() {
        super.sortName = sortName;
    }

    @Override
    public void sort(Comparable[] list) {
        for (int i = 0; i < list.length; i++) {
            // 设置当前最小值
            int min = i;
            // 遍历剩下的值，找出最小值，与未排序的第一个值进行交换
            for (int j = i + 1; j < list.length; j++) {
                if (SortUtil.less(list[j], list[min])) {
                    min = j;
                }
            }
            SortUtil.exchange(list, min, i);
        }
    }
}
