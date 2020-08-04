package study;

/**
 * @author Changyuan Su
 * @date 2020/6/17 22:13
 * @Description: 二分查找算法
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 90, 12, 46};
        System.out.println(binarySearch(arr, 13));
        System.out.println(binarySearch(arr, 12));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 46));
    }


    /**
     * 二分查找元素
     *
     * @param array 有序数组
     * @param data  需要查找的元素
     * @return 元素所在数组的下标，找不到返回-1.
     */
    private static int binarySearch(int[] array, int data) {
        int low = 0, height = array.length - 1;
        while (low <= height) {
            int middle = (low + height) / 2;
            if (array[middle] > data) {
                // 如果中间值比数据大，那么以后的数据更大，向左移动指针
                height = middle - 1;
            } else if (array[middle] == data) {
                return middle;
            } else {
                // 如果中间值比数据小，那么以后的数据更小，向右移动指针
                low = middle + 1;
            }
        }
        return -1;
    }


}
