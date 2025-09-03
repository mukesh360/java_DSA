
import java.util.*;
import java.lang.*;

class arrayStack{
     private static final int MAX_SIZE = 30;
     private int arr[];
     private int top;

     arrayStack(){
         top = -1;
         arr = new int[MAX_SIZE];
     }

     public void push(int value){
         top++;
         arr[top] = value;
     }

     public void pop(){
         System.out.println("The Top Element of a Stack is POPED() : "+arr[top]);
         top--;

     }

     public void peek(){
         System.out.print("The Element  at the Top of the Stack is : "+arr[top]);
     }

     public void display(){
         System.out.print("The Elements are : ");
         for(int i = 0; i <= top; i++){
             System.out.print(arr[i] + " ");
         }

     }

}




public class stack {
    public static void main(String args[]){


        int choice , value;

        arrayStack stack = new arrayStack();

        while(true){

        System.out.print("\n<------- Stack -------->\n1.Push()\n2.Pop()\n3.Peek()\n4.Display\n5.Exit()\nEnter your Choice : ");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        switch(choice){

            case 1:
                System.out.print("Enter the Value : ");
                value = scan.nextInt();
                stack.push(value);
                break;

            case 2:
                stack.pop();
                break;

            case 3:
                stack.peek();
                break;

            case 4:
                stack.display();
                break;
            case 5:
                System.exit(0);

            default:
                System.out.println("invalid Choice ! !");
                break;


        }

        }
    }

}
