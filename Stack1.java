
import java.util.Scanner;
class Stack{
    int top;
    int stk[]=new int[10];
    Stack(){
    top=-1;}
    void push(int item){
        if(stk.length-1==top){
            System.out.println("stack overflow");}
        else{
            top=top+1;
            stk[top]=item;}}
        void pop(){
            if(top==-1){
                System.out.println("Stack underflow");}
            else{
                int item=stk[top];
                System.out.println("Item popped is: " +item);
                top=top-1;}}
        void display(){
            if(top==-1){
                System.out.println("Stack is empty.no items to display");}
            else{
                System.out.println("Items in the stack are");
                for(int i=top;i>=0;i--){
System.out.println(stk[i]);}}}}
public class Stack1{
    public static void main(String[] args){
        int ch;
        Stack stack1=new Stack();
        Scanner sc1=new Scanner(System.in);
        while(true){
            System.out.println("1:push 2:pop 3:display 4.exit");
            ch=sc1.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the items to be pushed");
                    int item=sc1.nextInt();
                    stack1.push(item);
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    stack1.display();
                    break;
                default:
                    System.out.println("Enter the valid choice");
            }
        }
    }
    
}
                      
            
            
              
            
               
           