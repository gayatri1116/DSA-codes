
public class binarysearch {
    public static int binary(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int nums[] = { 10, 20, 30, 40, 50 };
        int key = 40;
        System.out.println("key at index = " + binary(nums, key));

    }
    // public static int binary(int number[], int key) {
    // int start = 0;
    // int end = number.length - 1;
    // int mid;
    // while (start <= end) {
    // mid = (start + end) / 2;

    // // start of comparision
    // if (mid == key) {
    // return mid;
    // }
    // if (mid < key) {
    // start = mid + 1;
    // return mid;
    // } else
    // end = mid - 1;
    // }
    // return -1;

    // }

    // public static void main(String args[]) {
    // int number[] = { 2, 4, 6, 8, 10, 12, 14 };
    // int key = 10;
    // System.out.println(binary(number, key));
    // //System.out.println(number.length);

    // }

}
