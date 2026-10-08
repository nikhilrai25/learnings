public class OrderAgnosticBinarySearch {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ascending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ascending = {1, 3, 5, 7, 9};
        int[] descending = {9, 7, 5, 3, 1};

        System.out.println(search(ascending, 7));
        System.out.println(search(descending, 7));
    }
}
