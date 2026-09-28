class account
{
    private long acc;
    private double bal;

    account(long acc,double bal)
    {
        this.acc=acc;
        this.bal=bal;
    }

    public void deposite(double amt)
    {
        if (amt>0)
        {
            bal+=amt;
            System.out.println("amount deposited");
        }
        else
        {
            System.out.println("Insufficient amount");
        }
    }

    public void withdraw(double amt)
    {
        if (amt<bal)
        {
            bal-=amt;
            System.out.println("aamount withdrawed");
        }
        else
        {
            System.out.println("Insufficient amount");
        }}

    public void viewbalance()
    {
        System.out.println("Balance:"+bal);
    }

}

class test
{
    public static void main(String arg[])
    {
        account ac = new account(74852296,500);
        ac.deposite(1000);
        ac.withdraw(500);
        ac.viewbalance();
    }
}