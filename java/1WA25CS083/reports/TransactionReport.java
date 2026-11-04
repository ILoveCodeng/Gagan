package reports;

import transaction.Account;

public class TransactionReport {

public void generateReport(Account account) {
System.out.println("\n=============================");
System.out.println(" TRANSACTION REPORT ");
System.out.println("=============================");
System.out.println("Account Number : " + account.getAccountNumber());
System.out.println("Current Balance: $" + String.format("%.2f", account.getBalance()));
System.out.println("=============================\n");
}
}