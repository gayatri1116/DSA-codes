import java.util.Queue;

import queue2.queue;

public class queue2 {
    static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static void remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
                return result;
            }
        }

        public static void peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove);
        q.add(4);
        System.out.println(q.remove);
        q.add(5);
        while (!q.isEmpty()) {
            for (int i = 0; i < rear; i++) {
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}
