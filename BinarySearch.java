public class BinarySearch {

  public static int binarySearchIterative(int[] a, int target) {
    int low = 0;
    int high = a.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (a[mid] == target) {
        return mid;
      } else if (target < a[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] a = {1, 3, 5, 7, 9, 11, 15};
    int target = 9;

    int result = binarySearchIterative(a, target);

    System.out.println("Index: " + result);
  }
}