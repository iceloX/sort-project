package cn.icelo.sort.algorithm;

import cn.icelo.sort.utils.SortUtil;

public abstract class AbstractSort {

    public String sortName;

    public abstract String getSortName();

    public abstract void setSortName();

    public abstract void sort(Comparable[] list);

    public void doSort(Comparable[] sortData) {
        // 打印排序前
        SortUtil.show(sortData);
        // 排序
        System.out.println();
        sort(sortData);
        // 打印
        SortUtil.show(sortData);
        // 断言
        assert SortUtil.checkIsSorted(sortData);
    }
}
