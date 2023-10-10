package Secao9.ExFix;

import static java.lang.String.format;

public class Account {
   private String nameAccount;
   private final int numAccount;
   private double balance;

   public Account(String nameAccount, int numAccount, double balance) {
      this.nameAccount = nameAccount;
      this.numAccount = numAccount;
      this.balance = balance;
   }
   public Account(String nameAccount, int numAccount) {
      this.nameAccount = nameAccount;
      this.numAccount = numAccount;
      this.balance = 0.00;
   }

   public String getNameAccount() {
      return nameAccount;
   }

   public void setNameAccount(String nameAccount) {
      this.nameAccount = nameAccount;
   }

   public int getNumAccount() {
      return numAccount;
   }


   public double getBalance() {
      return balance;
   }

   public void deposit(double value) {
      this.balance += value;
      System.out.print("Updated " +toString());
   }
   public void withDraw(double value){
      this.balance -= value + 5.00;
      System.out.println("Updated " + toString());
   }

   @Override
   public String toString() {
      return "Account data:\n" +
              "Account " + this.numAccount +
              ", Holder: " + this.nameAccount +
              ", balance: $ " + String.format("%.2f", this.balance);
   }
}
