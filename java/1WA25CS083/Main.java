import transaction.Account;
import reports.TransactionReport;

public class Main {
public static void main(String[] args) {
System.out.println("Initializing Banking System...\n");

Account myAccount = new Account("ACCT-987654321", 1000.00);


myAccount.deposit(250.00);
myAccount.withdraw(100.00);
myAccount.withdraw(2000.00);
TransactionReport reportGenerator = new TransactionReport();
reportGenerator.generateReport(myAccount);
}
}