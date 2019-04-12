/**
   Walther Alvarez
   CISC 500
   Assignment #12
   A bank customer with a checking and a savings account.
*/
public class Accounts
{ 
  private int accountNumber;
  private int customerNumber;
  private BankAccount checkingAccount;
  private BankAccount savingsAccount;

   /**
      Constructs a customer with a given number and PIN. 
      @param aNumber the customer number 
      @param aPin the personal identification number 
   */
   public Accounts (int aNumber, int aCustomerNumber)
   {
      accountNumber = aNumber;
      customerNumber = aCustomerNumber;
      checkingAccount = new BankAccount();
      savingsAccount = new BankAccount();
   }
  
   /**
      Tests if this customer matches a customer number
      and PIN.
      @param aNumber a customer number
      @param aPin a personal identification number
      @return true if the customer number and PIN match
   */
   public boolean match(int aNumber, int aCustomerNumber)
   {
      return accountNumber == aNumber && customerNumber == aCustomerNumber;
   }
  
   /**
      Gets the checking account of this customer.
      @return the checking account
   */
   public BankAccount getCheckingAccount()
   {
      return checkingAccount;
   }
  
   /**
      Gets the savings account of this customer.
      @return the checking account
   */
   public BankAccount getSavingsAccount()
   {
      return savingsAccount;
   }
}
