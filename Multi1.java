package oop;
class Multithreadingone extends Thread{
    public void run(){
        try{
        System.out.println("Thread"+Thread.currentThread().getId()+"is running");}
        catch(Exception e){
            System.out.println("Exception is caught");
        }}}
public class Multi1{
    public static void main(String[] args){
        for(int i=0;i<8;i++){
        Multithreadingone mt1=new Multithreadingone();
        mt1.start();}}}