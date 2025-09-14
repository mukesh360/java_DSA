import java.util.*;

class dyanamic_array{

    private static final int intial_capacity = 16;
    private int arr[];
    private int size;
    private int capacity;

    dyanamic_array(){
        size = 0;
        arr = new int[intial_capacity];
        capacity = intial_capacity;
    }

    public void add(int value){
        if(size == capacity){
            expand_array();
        }
        arr[size] = value;
        size++;
    }

    private void expand_array(){
        capacity *= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);

    }

    public void insert(int value, int pos){
        if(size == capacity){
            expand_array();
        }
        for(int i = size-1;i >= pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = value;
        size++;
    }
    public void delete(int pos){
        for(int i = pos + 1; i < size ;i++){
            arr[i -1] = arr[i];
        }
        size--;
        
    }

    public void display(){
        System.out.println("Displaying List ! !");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
        }
    }






}

class Array{
    public static void main(String args[]){
        int value , pos ,choice;
        Scanner scan = new Scanner(System.in);
        dyanamic_array list  = new dyanamic_array();
        while(true){
            System.out.println(" ");
            System.out.println(" <----------Dyanamic Array ! ! --------------> ");
            System.out.println("1 . Add at end ");
            System.out.println("2 . Insert at Postion ");
            System.out.println("3 . Delete at postion ");
            System.out.println("4 . Display Array  ");
            System.out.println("5 . Exit   ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the value :");
                    value = scan.nextInt();
                    list.add(value);
                    break;

                case 2:
                    System.out.println("Enter the value :");
                    value = scan.nextInt();
                    System.out.println("Enter the Position :");
                    pos = scan.nextInt();
                    if(pos < 0){
                        System.out.println("Invalid choice");
                        break;
                    }
                    list.insert(value,pos);
                    break;

                case 3:
                    System.out.println("Enter the Position :");
                    pos = scan.nextInt();
                    if(pos < 0){
                        System.out.println("Cannot Delete At the given Position");
                        break;
                    }
                    list.delete(pos);
                    break;

                case 4:
                    
                    list.display();
                    
                    break;

                case 5:
                scan.close();
                System.exit(0);


            
                default:
                System.out.println("Inavlid Choice ! !");
                    break;
            }
        }

    }
}