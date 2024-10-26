package oop;
class Multit extends Thread{
    int threadNumber;
    Multit(int tNo){
    this.threadNumber=tNo;
    }
    public void run(){
        for(int i=1;i<6;i++){
        System.out.println("Task"+i+"by ThreadNumber"+threadNumber);
        try{
            Thread.sleep(1000);}
        catch(Exception e){
            System.out.println("Exception is caught");
        }}}}
public class Multi3{
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            Multit mt1=new Multit(i);
            mt1.start();}}}