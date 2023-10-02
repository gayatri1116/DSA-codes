public class maxsubarray {
    public static void sum(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += num[k];
                }
                System.out.print(currsum + " ");
                if (currsum >= maxsum) {
                    maxsum = currsum;
                }
            }
            // 
            System.out.println();
        }
        System.out.println("maxsum sum" + maxsum);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        sum(num);

    }

}
