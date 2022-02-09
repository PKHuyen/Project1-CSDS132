//Task 4 Project 1

public class Customer extends Stock {

private String firstName;
  private String lastName;
  private String address;

  
  //first name of the account
  public String getFirstName() {
   return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  //last name of the account
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  //address of the account
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  
  public Customer(int numShares) {
    super(numShares);
  }
  
  
}

  
  /* private String firstName;
  private String lastName;
  private String address;

  private double currentStockPrice;
  private Cash cashAccount;
  private double commission;
  private Date date;
  private double currentValue;
  private double amount;
  private int numShares;
  
  //first name of the account
  public String getFirstName() {
   return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  //last name of the account
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  //address of the account
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  
  //stock account
  public Stock getStockAccount() {
    return stockAccount;
  }
  public void setStockAccount(Stock stockAccount) {
    this.stockAccount = stockAccount;
  }
  
  //Cash instance associated with the account
  public Cash getCashAccount() {
    return cashAccount;
  }
  public void setCashAccount(Cash cashAccount) {
    this.cashAccount = cashAccount;
  }
  
  //commission of the account
  public double getCommissionAccount() {
    return commission;
  }
  public void setCommissionAccount(double comssion) {
    this.commission = commission;
  }
  
  //return the Date with this account
  public Date getDate() {
    return date;
  }
  
  //return current Stock Price
  public void setStockPrice(double currentStockPrice) {
    this.currentStockPrice = currentStockPrice;
  }
  
  //Cash balance + Stock number * Stock current price
  public double currentValue() {
    return cashAccount + (double)stockAccount * currentStockPrice;
  }
  
  public void deposit(double amount) {
    this.amount = amount;
    this.cashAccount = amount + cashAccount;
  }
  
  public boolean withdraw(double amount) {
  }
}
    */
  