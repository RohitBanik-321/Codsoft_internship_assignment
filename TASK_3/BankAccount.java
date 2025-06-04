public class BankAccount {

    private double AcBalance;

    public BankAccount(double AcBalance) {
        this.AcBalance=AcBalance;
    }

    public int withdrawlamount(double amount){
        if (AcBalance>=amount) {
           AcBalance=AcBalance-amount;
           return 1;
        }
        else{
            return 0;
        }
    }
    
    public void depositamount(double amount) {
        AcBalance=AcBalance+amount;
    }

    public double getBalance() {
        return AcBalance;
    }
}

