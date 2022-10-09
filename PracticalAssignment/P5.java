//THIS PROGRAM PREPARED BY Jay Thanki 21CE143
package PracticalAssignment;

class CheckingAccount extends Account {      //Account class of P1 
    double overDraft = -1000;
    public void checking(double i) {

        //initializes double variable balance as 0.0
        double balance = 0.0;
        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than $1,000. A $25 +"  + "overdraft fee will be issued to your account. ");
            balance = balance - 25; }
        else
            balance = balance - i;
    }
}
class SavingsAccount extends Account {
    double overdraftLimit = 0;

    public void withdraw (double w) {
        if (balance - w < overdraftLimit)
            System.out.println("Insufficient Funds");
        else
            balance = balance - w;
    }
}

public class P5  {
    SavingsAccount savings = new SavingsAccount();
    CheckingAccount checking = new CheckingAccount();
    Account account;

    public static void main (String[] args) {
        Account account = new Account(1122, 20000);

        System.out.print("After Creation,  " );
        Print (account.getBalance());
        Account.setAnnualInterestRate(4.5);
        System.out.print("After Withdrawal of $2,500,  " );
        account.withdraw(2500);
        Print (account.getBalance());
        System.out.print("After Deposit of $3,000,  " );
        account.deposit(3000);
        Print (account.getBalance());
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
        System.out.println("This account was created at " +
                account.getDateCreated());

    }
    // Extra Print Method
    public static void Print (double x){
        System.out.printf("The current balance is "+" $ "+"%4.2f"+"%n",x);
    }
}