package cn.icelo.sort;

import cn.icelo.sort.algorithm.AbstractSort;
import cn.icelo.sort.algorithm.SelectSort;
import cn.icelo.sort.data.SortData;
import cn.icelo.sort.enums.SortName;

public class TestMain {

    public static void main(String[] args) {

        Comparable[] list = SortData.numList;
        SortName.SELECT.doSort(list);
    }
}
