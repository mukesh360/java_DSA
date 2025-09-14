import java.util.Scanner;

class linkedList {
    node head;

    class node {
        int data;
        node next;
    }

    linkedList() {
        head = null;
    }

    public void insertAtBegnning(int data) {
        node newNode = new node();
        newNode.data = data;

        if (head == null) {
            head = newNode;
            newNode.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        node temp = head;
        System.out.println("Displaying The Data !");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPosition(int pos, int data) {
        if(pos == 0){
            insertAtBegnning(data);
            return;
        }
        node newNode = new node();
        newNode.data = data;
        node temp = head;

        for(int i = 1; i < pos; i++){
            temp = temp.next;
            if(temp == null){
                System.out.print("invalid Position !");
                return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int pos) {
    if (head == null) {
        System.out.println("Can't delete, the list is empty!");
        return;
    }
    if (pos == 0) {
        head = head.next;
        return;
    }
    node temp = head;
    node prev = null;

    for (int i = 1; i <= pos; i++) {
        prev = temp;
        temp = temp.next;

        if (temp == null) {  
            System.out.println("Position out of range!");
            return;
        }
    }
    prev.next = temp.next;
}

}

public class list { 
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        linkedList list = new linkedList();

        while (true) {
            System.out.print("\n<------- Linked List -------->\n" +
                    "1. insertAtBeginning()\n" +
                    "2. Display()\n" +
                    "3. insertAtPosition()\n" +
                    "4. deleteAtPosition()\n" +
                    "5. Exit()\n" +
                    "Enter your Choice : ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Value: ");
                    int data = scan.nextInt();
                    list.insertAtBegnning(data);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    int pos = scan.nextInt();
                    System.out.print("Enter Value: ");
                    int val = scan.nextInt();
                    list.insertAtPosition(pos, val);
                    break;

                case 4:
                    System.out.print("Enter Position to Delete: ");
                    int dpos = scan.nextInt();
                    list.deleteAtPosition(dpos);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
