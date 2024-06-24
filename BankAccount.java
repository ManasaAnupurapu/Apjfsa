 //Program to Demonstrate Usage of Access Modifiers
  package com.apjfsa;
 //BankAccount Class Declaration
  public class BankAccount{
	//Declaration of Variables using public,private,protected modifiers 
	  int amount = 4000;
  private double balance; //private variable to store balance
  protected int accountNumber; //protected variable to store Account number
  public String AccountName; //public variable to store Account name
  
  //Private method to deposit amount in to account
   private void deposit() {
	 balance+=amount;
	 System.out.println("Amount deposited in the Account:"+amount);
	 
  }
  private double getBalance() {
	return balance;
 }
 private void setBalance(double balance) {
	balance = balance;
 }
 //public method to withdraw amount from Account
   public void withdraw(double amount) {
	  if(balance>=amount)
	balance-=amount;
	System.out.println("Amount withdrawn from the Account:"+amount);
	}
   
	//Default method to display Account Information
    void displayAccountInfo(double balance,int accountNumber,String AccountName) {
    System.out.println("Account info:"+ "\nAccount Balance:"+balance+"\nAccount Number:"+accountNumber+"\nAccount Name:"+ AccountName);
    }
  }
    	
    

