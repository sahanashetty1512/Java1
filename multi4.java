package oop;
class Multit4 extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);}
        catch(Exception e){
            System.out.println("Exception is caught");
        }}}}
public class Multi4{
    public static void main(String[] args){
            Multit4 mt1=new Multit4();
            mt1.start();}}