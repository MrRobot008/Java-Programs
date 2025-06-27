class poly{
   static class queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear +1) % size == front; 
        }
        public static void add(int data){
            if(rear == size -1){
                System.out.println("Queue Full");
                return;
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
            front = (front + 1 ) % size;
            int result = arr[front];
            return result;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return arr[0];

        }

    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(1);
        q.add(12);
        q.add(16);
        q.add(17);
        q.add(20);
        q.remove();
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}