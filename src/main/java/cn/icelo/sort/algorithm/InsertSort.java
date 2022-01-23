package cn.icelo.sort.algorithm;

import cn.icelo.sort.enums.SortName;
import cn.icelo.sort.utils.SortUtil;

public class InsertSort extends AbstractSort {

    private static final String sortName = SortName.INSERT.getName();


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

        //  默认第一个元素是已经排过序的
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0 && SortUtil.less(list[j], list[j - 1]); j--) {
                SortUtil.exchange(list, j, j - 1);
            }
        }
    }
}
