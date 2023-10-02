// print sum of sub array
public class array4 {
    public static void PrintSubarray(int num[]) {
        int currsum = 0;
        int ts = 0;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {

                    currsum += num[k];

                    System.out.println(currsum);

                }

                // System.out.println(currsum);

                // ts++;
                System.out.println();
                ts++;

            }
            System.out.println();

        }
        System.out.println();
        // System.out.println("sum = " + currsum);
        System.out.println(currsum);
        System.out.println(" total subarray = " + ts);
        // System.out.println(currsum);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        PrintSubarray(num);
    }
}
