public class InsertionSort {
    public static void insertion(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = i;
            int prev = i - 1;
            while (prev >= 0 && num[prev] > num[curr]) {
                num[prev + 1] = num[prev];
                prev--;
            }
            num[prev + 1] = num[curr];
        }

    }

    public static void main(String args[]) {
        int num[] = { 5, 4, 1, 3, 2 };
        insertion(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

}
