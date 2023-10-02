public class bubblesort {
    public static void bubble(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int num[] = { 5, 4, 1, 3, 2 };

        bubble(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

    }

}
// public static void bubble(int arr[]) {
// for (int turn = 0; turn < arr.length - 1; turn++) {
// for (int j = 0; j < arr.length - 1 - turn; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }

// }

// public static void printa(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();

// }

// public static void main(String args[]) {
// int arr[] = { 5, 4, 1, 3, 2 };
// bubble(arr);
// printa(arr);

// }
