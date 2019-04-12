import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
   Walther Alvarez
   CISC 500
   Assignment #12
   A bank contains customers. 
*/
public class Bank
{ 
   private ArrayList<Customer> customers;
   private ArrayList<Accounts> accounts;

   /**
      Constructs a bank with no customers. 
   */
   public Bank()
   {
      customers = new ArrayList<Customer>();
      accounts = new ArrayList<Accounts>();
   }
  
   /**
      Reads the customer numbers and pins.
      @param filename the name of the customer file
   */
   public void readCustomers(String filename)
         throws IOException
   {
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext())
      {
         int number = in.nextInt();
         int pin = in.nextInt();
         Customer c = new Customer(number, pin);
         addCustomer(c);
      }
      in.close();
   }
  public void readAccounts(String filename)
         throws IOException
   {
      Scanner in = new Scanner(new File(filename));
      while (in.hasNext())
      {
         int number = in.nextInt();
         int customerNumber = in.nextInt();
         Accounts a = new Accounts(number, customerNumber);
         addAccount(a);
      }
      in.close();
   }

   /**
      Adds a customer to the bank.
      @param c the customer to add
   */
   public void addCustomer(Customer c)
   {
      customers.add(c);
   }
   public void addAccount(Accounts a)
   {
      accounts.add(a);
   }

   /**
      Finds a customer in the bank.
      @param aNumber a customer number
      @param aPin a personal identification number
      @return the matching customer, or null if no customer
      matches
   */
   public Customer findCustomer(int aNumber, int aPin)
   {
      for (Customer c : customers)
      {
         if (c.match(aNumber, aPin))
         {
            return c;
         }
      }
      return null;
   }
    public Accounts findAccount(int aNumber, int aCustomerNumber)
   {
      for (Accounts a : accounts)
      {
         if (a.match(aNumber, aNumber))
         {
            return a;
         }
      }
      return null;
   }

}

