package cn.icelo.sort.enums;


import cn.icelo.sort.utils.SortUtil;

public enum SortName {

    SELECT("选择排序") {
        @Override
        public void sort(Comparable[] list) {
            for (int i = 0; i < list.length; i++) {
                int min = i;
                for (int j = i + 1; j < list.length; j++) {
                    if (SortUtil.less(list[j], list[min])) {
                        min = j;
                    }
                }
                SortUtil.exchange(list, i, min);
            }
        }
    };

    private String name;

    public String getName() {
        return name;
    }

    SortName(String name) {
        this.name = name;
    }

    public abstract void sort(Comparable[] list);

    public void doSort(Comparable[] list) {
        // 排序
        sort(list);
        // 打印
        SortUtil.show(getName(), list);
    }

}


