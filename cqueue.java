public class cqueue {
    static class queue{
        static int arr[];
        static int  size;
        static int rear = -1;
        static int front = -1;

        @SuppressWarnings("unused")
         queue(int n) {
            this.size = n;
            arr = new int[n];
        }

        public static  boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static  boolean isFull(){
            return (rear+1) % size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
             if(front == rear){
                front = rear = -1;
             }
            int res = arr[front];
            front = (front + 1) % size;
            return res;

        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[front];

        }


        
    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
    
