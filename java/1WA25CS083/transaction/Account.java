package transaction;

public class Account {
private String accountNumber;
private double balance;

public Account(String accountNumber, double initialBalance) {
this.accountNumber = accountNumber;
this.balance = initialBalance;
}

public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Successfully deposited: $" + amount);
} else {
System.out.println("Invalid deposit amount.");
}
}

public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Successfully withdrew: $" + amount);
} else if (amount > balance) {
System.out.println("Insufficient funds for withdrawal of $" + amount);
} else {
System.out.println("Invalid withdrawal amount.");
}
}

public String getAccountNumber() {
return accountNumber;
}

public double getBalance() {
return balance;
}
}