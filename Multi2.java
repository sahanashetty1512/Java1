package oop;
class MultithreadingTwo implements Runnable{
    public void run(){
        try{
        System.out.println("Thread"+Thread.currentThread().getId()+"is running");}
        catch(Exception e){
            System.out.println("Exception is caught");
        }}}
public class Multi2{
    public static void main(String[] args){
        for(int i=0;i<8;i++){
        MultithreadingTwo mt1=new MultithreadingTwo();
        Thread t1=new Thread(mt1);
        t1.start();}}}