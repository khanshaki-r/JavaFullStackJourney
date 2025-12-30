
public class Account
{
    private double bankbalance = 500;
    public double getBankbalance(int custId)
    {
        return bankbalance;
    }
    public static void main(String[] args) {
        Account acc = new Account();
        double balance = acc.getBankbalance(513);
        System.out.println("The bank Balance of CustId : 513 is :" + balance);
        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}