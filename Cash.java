// Task 2 project 1
public class Cash {
//tphung
//A field that stored balance
  private double balance = 100.0;
  //A field that stored Saving rates
  private double savingsRate;
  //A field that stored Loan Rates
  private double loanRate;
  //A field that stored Loan Limit
  private double limit;
  //A field that stored overdraft Penalty
  private double overdraftPenalty;
  //A field that stored deposit amount
  private double amount;
  
  //A method that return the current balance in the account
  public double getBalance() { 
    return balance;
  }
  //A method that returns the interest rate applied to the positive account
  public double getSavingsRate() {
    return savingsRate;
  }
  //A method that changes the interest rates applied to positive balances
  public void setSavingsRate(double savingsRate) {
    this.savingsRate = savingsRate;
  }
  //A method that returns the interest rate applied to negative balances
  public double getLoanRate() {
    return loanRate;
  }
  //A method that changes the loan rates applied to negative balances
  public void setLoanRate(double loanRate) {
    this.loanRate = loanRate;
  }
  //A method that returns the loan limit for the account
  public double getLoanLimit() {
    return limit;
  }
  //A method that changes the loan limit for the account 
  public void setLoanLmit(double limit) {
    this.limit = limit;
  }
  //A method that return the overdrat penalty for the account
  public double getOverdraftPenalty() {
    return overdraftPenalty;
  }
  //A method that changes the overdraft penalty for the account
  public void setOverdraftPenalty(double overdraftPenalty) {
    this.overdraftPenalty = overdraftPenalty;
  }
  //A method that increase the balance y amount
  public void deposit(double amount) {
    this.balance = balance + amount;
  }
  //A method that check if deposit amount is larger and less than current balance
  public boolean withdraw(double amount) {
    if (amount<this.balance) {
      this.balance = this.balance - amount;
      return true;
    }
    else return false;   
  }
  //A method that reduces the current balance by amount
  public void transfer(double amount) {
    this.balance = this.balance - amount;
  }
  //A mthod that calculate process day
  public void processDay() { 
    double monthlyInterest;
    if (this.balance >0) {
      monthlyInterest = savingsRate;
    }
    else {
      monthlyInterest = loanRate;
    }
    if(this.balance>=0) {
      this.balance = this.balance * this.savingsRate / 365 + monthlyInterest;
    }
    else {
      this.balance = this.balance * this.loanRate / 365 + monthlyInterest;
    }
  }
  //A method that calculate process Month
  public void processMonth() { 
    double monthlyInterest;
    if (this.balance >0) {
      monthlyInterest = savingsRate;
    }
    else {
      monthlyInterest = loanRate;
    }
    this.balance = this.balance * monthlyInterest;
    monthlyInterest = 0;
    if (balance + monthlyInterest < 0 && balance + monthlyInterest > limit) {
      this.balance = this.balance - overdraftPenalty;
    }
  }
  //Constructor
  public void constructor (double savingsRate, double loanRate, double loanLimit, double overdraftPenalty) {
    this.savingsRate = savingsRate;
    this.loanRate = loanRate;
    this.limit = loanLimit;
    this.overdraftPenalty = overdraftPenalty;
  }
}
