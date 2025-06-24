import java.util.*;

public class qstack {

    static class QueueUsingStacks {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        public static int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(6);

        System.out.println("Built-in Queue Output:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("\nCustom QueueUsingStacks Output:");
        QueueUsingStacks.add(10);
        QueueUsingStacks.add(20);
        QueueUsingStacks.add(30);

        while (!QueueUsingStacks.s1.isEmpty()) {
            System.out.println(QueueUsingStacks.peek());
            QueueUsingStacks.remove();
        }
    }
}
