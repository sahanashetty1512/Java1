import java.util.Calendar;
import java.util.Date;
class BankAccount 
{
    private int accNo;
    private double balance;
    private String mobileNo;
    private Date dateOfBirth;
    public BankAccount(int accNo, double balance, String mobileNo, Date dateOfBirth) 
    {
        this.accNo = accNo;
        this.balance = balance;
        this.mobileNo = mobileNo;
        this.dateOfBirth = dateOfBirth;
    }
    public void depositAmt(double amt)
    {
        balance += amt;
    }
    public void withdrawAmt(double amt) 
    {
        if (balance >= amt) 
        {
            balance -= amt;
            SMS.sendSMS("Bank's mobile number", mobileNo, "Dear Customer, you have withdrawn an amount of Rs " + amt + " on " + new Date());
        } 
        else 
        {
            System.out.println("Insufficient Balance");
        }
    }
    public double getBalance() 
    {
        return balance;
    }
    public void penalty() 
    {
        if (balance < 500) 
        {
            balance -= 100;
        }
    }
    public void interest() 
    {
        double interestRate = (calculateAge() >= 60) ? 0.055 : 0.05;
        double interest = balance * interestRate / 12;
        balance += interest;
    }
    public void calculateMonthlyBalance() 
    {
        penalty();
        if (balance < 0) 
        {
            balance = 0; 
        }
        interest();
    }
    public int calculateAge() 
    {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        Calendar currentDate = Calendar.getInstance();
        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (currentDate.get(Calendar.MONTH) < birthDate.get(Calendar.MONTH) || 
            (currentDate.get(Calendar.MONTH) == birthDate.get(Calendar.MONTH) && currentDate.get(Calendar.DAY_OF_MONTH) < birthDate.get(Calendar.DAY_OF_MONTH))) {
            age--;
     }
        return age;
   }
}
class SMS 
{
    public static void sendSMS(String senderNo, String receiverNo, String message) 
    {
        System.out.println("Sending SMS from " + senderNo + " to " + receiverNo + ": " + message);
    }
}
public class TestBankAccount 
{
    public static void main(String[] args)
    {
        Calendar dob = Calendar.getInstance();
        dob.set(1960, Calendar.JANUARY, 1);
        BankAccount acc1 = new BankAccount(123, 500, "1234567890", dob.getTime());
        System.out.println("Opening Balance: " + acc1.getBalance());
        acc1.depositAmt(200);
        System.out.println("Balance after deposit: " + acc1.getBalance());
        acc1.withdrawAmt(400);
        System.out.println("Balance after withdrawal: " + acc1.getBalance());
        acc1.withdrawAmt(290);
        System.out.println("Balance after withdrawal: " + acc1.getBalance());
        acc1.calculateMonthlyBalance();
        System.out.println("Balance at the end of the month: " + acc1.getBalance());
        System.out.println("Account holder age: " + acc1.calculateAge() + " years");
    }
}
