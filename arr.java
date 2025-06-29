public class arr{
    static class queue{
        static int arra[];
        static int size;
        static int rear = -1;

         queue(int n) {
            arra = new int[n];
            this.size = n;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear == size - 1){
                System.out.println("W Full");
                return;
            }
            rear++;
            arra[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
            int front = arra[0];
            for (int i = 0; i < rear; i++) {
                arra[i] = arra[i+1];

            }
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
            return arra[0];

        }      

    }
    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(72);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
    }
    

    }

}