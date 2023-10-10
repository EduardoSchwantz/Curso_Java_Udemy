package Secao9.ExFix;

import static java.lang.String.format;

public class Account {
   private String nameAccount;
   private final int numAccount;
   private double balance;

   public Account(String nameAccount, int numAccount, double intialDeposit) {
      this.nameAccount = nameAccount;
      this.numAccount = numAccount;
      deposit(intialDeposit);
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
   }
   public void withDraw(double value){
      this.balance -= value + 5.00;
   }

   @Override
   public String toString() {
      return "Account data:\n" +
              "Account " + this.numAccount +
              ", Holder: " + this.nameAccount +
              ", balance: $ " + String.format("%.2f", this.balance);
   }
}
