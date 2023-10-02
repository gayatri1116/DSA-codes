
public class linearsearch {
    public static int search(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 20, 33, 54, 67, 45, 33 };
        int key = 33;
        int index = search(nums, key);
        if (index == -1) {
            System.out.println("key not found");

        } else {
            System.out.println("key at index" + " " + index);
        }

    }

    // public static int linear(int num[], int key) {
    // for (int i = 0; i < num.length; i++) {
    // if (num[i] == key) {
    // return i;
    // }
    // }
    // return -1;

    // }

    // public static void main(String args[]) {
    // int num[] = { 10, 20, 30, 40, 50, 60 };
    // int key = 60;
    // int index = linear(num, key);
    // if (index == -1) {
    // System.out.println("not found");

    // } else {
    // System.out.println("key is at index: " + index);
    // }
    // }
}