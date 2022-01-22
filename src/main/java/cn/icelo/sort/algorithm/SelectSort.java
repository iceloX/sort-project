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
        int len = list.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (SortUtil.less(list[j], list[min])) {
                    min = j;
                }
            }
            SortUtil.exchange(list, i, min);
        }
    }
}
