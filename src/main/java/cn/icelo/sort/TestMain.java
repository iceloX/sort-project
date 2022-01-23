package cn.icelo.sort;

import cn.icelo.sort.algorithm.AbstractSort;
import cn.icelo.sort.algorithm.InsertSort;
import cn.icelo.sort.data.SortData;
import cn.icelo.sort.enums.SortName;
import cn.icelo.sort.utils.SortUtil;

public class TestMain {

    public static void main(String[] args) {

        Comparable[] list = SortData.numList;
// 使用抽象类的方法实现
//        AbstractSort sort = new SelectSort();
//        sort.doSort(list);
        AbstractSort sort = new InsertSort();
        sort.doSort(list);
// 使用枚举类的方法实现
//        SortName.SELECT.doSort(list);
//        SortName.INSERT.doSort(list);
    }
}
