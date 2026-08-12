import java.util.*;
interface bank
{
    void deposit();
    void withdraw();
    void checkbalance();
}
class abstractbank implements bank
{
    double balance=10000;
    public void deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount=sc.nextDouble();
        balance+=amount;
        System.out.println("Amount deposited successfully.");
    }
    public void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount=sc.nextDouble();
        if(amount>balance)
        {
            System.out.println("Insufficient balance.");
        }
        else
        {
            balance-=amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }
    public void checkbalance()
    {
        System.out.println("Current balance: "+balance);
    }
}