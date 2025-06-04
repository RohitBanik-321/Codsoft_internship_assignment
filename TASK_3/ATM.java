import java.util.Scanner;
public class ATM {

    private BankAccount bankAcc;

    public ATM(BankAccount bankAcc) {
        this.bankAcc = bankAcc;
    }

    private void withdrawlamount(){
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner inp = new Scanner(System.in);
        double amount = inp.nextDouble();
        if (bankAcc.withdrawlamount(amount)==1){
           System.out.println("Amount Withdrawn Sucessfully. Please collect your money "+amount);
        }
        else
        {
        System.out.println("Insufficient Account Balance");
        }
    }

    private void depositamount() {
        System.out.println("Enter the amount you want to deposit: ");
        Scanner inp = new Scanner(System.in);
        double amount = inp.nextDouble();
        if(amount<=0.0)
        {
        System.out.println("Please enter a valid amount");
        return;
        }
        bankAcc.depositamount(amount);
        System.out.println("Amount Deposited Sucessfully "+amount);
    }

    private void Balancecheck() {
        System.out.println("Your account balance is: "+bankAcc.getBalance());
    }

         
    
    
    public static void main(String args[]){
        BankAccount bankAcc = new BankAccount(1000);
        ATM atm = new ATM(bankAcc);
        
        int choice;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.println("Welcome to ATM");
        System.out.println("Press 1 to Withdraw");
        System.out.println("Press 2 to Deposit");
        System.out.println("Press 3 to Check Balance");
        System.out.println("Press 4 to Exit");

        System.out.println("Please enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                atm.withdrawlamount();
                break;
            case 2:
                atm.depositamount();
                break;
            case 3:
                atm.Balancecheck();
                break;
            case 4:
            System.out.println("Thank You for using this ATM!\nVisit Again.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
            }
        
        }while(choice!=4);
        sc.close();
    }
 
}


