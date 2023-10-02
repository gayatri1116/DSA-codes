import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuee {
    public static void main(String args[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // if we use Comparator.reverseOrder then our output will reverse
        // without Comparator.reverseOrder() output will be
        // 3,4,7,9
        pq.add(7);
        pq.add(4);
        pq.add(3);
        pq.add(9);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}