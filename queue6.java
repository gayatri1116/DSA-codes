
//Deque with all operations

import java.util.*;

public class queue6 {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        // System.out.println(deque);

        deque.removeLast();
        deque.removeFirst();

        System.out.println(deque);

    }

}
