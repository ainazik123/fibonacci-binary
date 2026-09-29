public class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] a, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        } else if (target < a[mid]) {
            return binarySearchRecursive(a, target, low, mid - 1);
        } else {
            return binarySearchRecursive(a, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7, 9, 11, 15};

        int target = 9;

        int result = binarySearchRecursive(
                a, target, 0, a.length - 1
        );

        System.out.println("Index: " + result);
    }
}