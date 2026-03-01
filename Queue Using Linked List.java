class QueueLinkedList {

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node front, rear;

    void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) return -1;

        int val = front.data;
        front = front.next;

        if (front == null) rear = null;

        return val;
    }
}