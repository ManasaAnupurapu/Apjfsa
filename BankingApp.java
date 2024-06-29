//Program to Demonstrate Custom Exception Handling
//Custom exception class to handle Exception
public class ConditionalNotSatisfiedException extends Exception {
 String msg;  // Variable to store message
	
 // Constructor
 public ConditionalNotSatisfiedException(String msg) {
     super();  // Call the superclass constructor
     this.msg = msg; 
 }
}
public class BankingApp {
 int accountNo;  // Variable to store account number
 int balance;    // Variable to store account balance

 // Constructor to initialize account number and balance
 public BankingApp(int accountNo, int balance) {
     super();
     this.accountNo = accountNo;
     this.balance = balance;
 }

 // Method for depositing amount to the account
 void deposit(int amt) {
     balance += amt;  // Add the deposit amount to the current balance
     System.out.println("New Balance: " + balance);  // Print the new balance
 }

 // Method for withdrawing amount from the account
 void withDraw(int amt) throws InsufficientBalanceException {
     if (balance > amt) {  // Check if there is enough balance to withdraw
         balance -= amt;  // Subtract the amount from the current balance
         System.out.println(" New Balance: " + balance);  
     } else {
         // Throw an exception if the balance is insufficient
         throw new InsufficientBalanceException("Insufficient Balance");
     }
 }

 public static void main(String[] args) {
     // Create a new banking app object with account number and initial balance
     BankingApp bank = new BankingApp(3452313, 200000);
     
     // Deposit amount to the account
     bank.deposit(30000);
     
     try {
         // withdraw an amount from the account
         bank.withDraw(400000);
     } catch (InsufficientBalanceException e) {
         // Handling the exception if there is insufficient balance
         System.out.println(e);
     }
 }
}
