import java.util.Scanner;
public class CelsiusToFarenheit{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the temperature in Celsius");
double celsius=scanner.nextDouble();
double Farenheit=(celsius*1.8)+32;
System.out.println("Temparature in Farenheit is"+Farenheit);
}
}