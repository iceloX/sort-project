package cn.icelo.sort.algorithm;

import cn.icelo.sort.utils.SortUtil;

public abstract class AbstractSort {

    public String sortName;

    public abstract String getSortName();

    public abstract void setSortName();

    public abstract void sort(Comparable[] list);

    public void doSort(Comparable[] sortData) {
        // 排序
        sort(sortData);
        // 打印
        SortUtil.show(sortName, sortData);
    }


    ;

}
