public class Queue {


    class Node {
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }
    }

    public Queue() {

    }

    protected Node font;
    protected Node rear;

    public void enQueue(int element) {
        Node newNode = new Node(element);
        if (this.font == null) {
            this.font =newNode;

        } else {
            this.rear.link = newNode;
        }
        this.rear = newNode;
        this.rear.link = this.font;
        System.out.println("added " + element);
    }

    public void deQueue() {
        if (this.font == null) {
            throw new IndexOutOfBoundsException("under flow");
        }
        if (this.font == this.rear) {
            this.font = this.rear = null;


        } else {
            Node temp = font;
            this.font = this.font.link;
            this.rear.link = this.font;
            System.out.println("removed " + temp.data);
            temp = null;

        }

    }

    public void displayQueue() {
        if (this.font == null) {
            throw new IndexOutOfBoundsException("k o j");
        } else {
            Node temp = this.font;
            System.out.println(temp.data);
            temp=temp.link;
            while (temp !=this.font) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }

    }
}
