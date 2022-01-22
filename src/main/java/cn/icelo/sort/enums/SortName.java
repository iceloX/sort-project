package cn.icelo.sort.enums;


import cn.icelo.sort.utils.SortUtil;

public enum SortName {

    SELECT("选择") {
        @Override
        public void sort(Comparable[] list) {
            for (int i = 0; i < list.length; i++) {
                int min = i;
                for (int j = i + 1; j < list.length; j++) {
                    if (SortUtil.less(list[j], list[min])) {
                        min = j;
                    }
                    SortUtil.exchange(list, i, min);
                }
            }
        }
    },

    INSERT("插入") {
        @Override
        public void sort(Comparable[] list) {
            //将a[]按升序排列
            int N = list.length;
            for (int i = 1; i < N; i++) {
                //将a[i]插入到a[i-1]，a[i-2]，a[i-3]……之中
                for (int j = i; j > 0 && (SortUtil.less(list[j], list[j - 1])); j--) {
                    SortUtil.exchange(list, j, j - 1);
                }
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


