



static class LLJava{
    static class Node{
         String data;
         Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
        static Node head;
        public void addF(String data){
            Node new_n = new Node(data);
            if(head == null){
                head = new_n;
                return;
            }
            new_n.next = head;
            head = new_n;
        }
        public static void addL(String data){
            Node newn = new Node(data);
            if(head == null){
                head = newn;
                return;
            }
            Node currnode = head;
            while(currnode.next!=null){
                currnode = currnode.next;
            }
            currnode.next = newn;
        }
        public void printL(){
            if(head == null){
                System.out.println("List Empty");
                return;
            }
            Node currNode = head;
            while(currNode!=null){
                System.out.print(currNode.data + "->");
                currNode = currNode.next;
            }
            System.out.println("NULL");
            
        }
        public void delF(){
            if(head == null){
                System.out.println("List Empty");
                return;
            }
            head = head.next;
        }
        public void delL(){
            if(head == null){
                System.out.println("List Empty");
                return;
            }
            Node secondlast = head;
            Node last = head.next;
            while(last.next == null){
                last = last.next;
                secondlast = secondlast.next;
            }
            secondlast.next = null;
        }
   }
   public static void main(String[] args) {
       
       
        LLJava list = new LLJava();
        list.addF("Banana");
        list.addF("Apple");
        list.addF("data");
        list.addF("DS");
        list.addL("Last");
        list.delF();
        list.delF();
        list.addF("3434");
        list.addF("dfekr");
        list.delL();
        list.printL();

   }

