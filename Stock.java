// Project 1 Harley Phung

//Task 1: Create Stock class
public class Stock {
  //A field that stored company name
  private String name;
  //A field that stored company Ticker symbol
  private String tickerSymbol;
  //A field that stored the current price of stock
  private double price;
  //A field that stored number of shares
  protected int numShares;
  //A field that stored the cost basis 
  private double costBasis;
  //A field that stored capital gains
  private double capitalGains;
  //A field that stored commission
  private double commission;
  
  //constructor 1
  public Stock(String tickerSymbol, double currentPrice){
    this.tickerSymbol = tickerSymbol;
    this.price = currentPrice;
  }

  //constructor 2
  public Stock(String companyName, String tickerSymbol, double currentPrice){
    this.companyName = companyName;
    this.tickerSymbol = tickerSymbol;
    this.price = currentPrice;
  }

  // getCompanyName return company name
  public String getCompanyName(){
    return this.name;
  }
  // setCompanyName changes the company name for the stock
  public void setCompanyName(String name) {
    this.name = name;
  }
  //getTickerSympol returns the stock market ticker symbol
  public String getTickerSymbol() {
    return this.tickerSymbol;
  }
  //setTickerSymbol changes the stock market ticker symbol
  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }
  //getCurrentPrice return the current price for a share of the stock
  public double getCurrentPrice() {
    return this.price;
  }
  
  //setCurrentPrice changes the current price of a share of the stock
  public void setCurrentPrice(double price) {
    this.price = price;
  }
  //getNumberShares returns the number of shares owned in stock
  public int getNumberShares() {
    return numShares;
  }
  public void setNumberShares(int numShares) {
    this.numShares = numShares;
  }
  //getCostBasis returns the cost basis for the owned shares
  public double getCostBasis() {
    return costBasis;
  }
  public void setCostBasis(double costBasis) {
    this.costBasis = costBasis;
  }
  //getCapitalGains reutrns the total cpital gains earned so far
  public double getCapitalGains() {
    return capitalGains;
  }
  public void setCommission(double commision) {
    this.commission = commission;
  }
  //Calculate output money for investors
  public double buy(int numShares, double commission) {
    this.costBasis += numShares * price + commission;
    return (double)(numShares * price + commission);
  }
  //Calculate sell
  public double sell(int numShares, double commission) {
    if (numShares > this.numShares) 
      return (int)0;
    
    else if (numShares <= this.numShares) {
      int decreasedCostBasis = this.costBasis*(numShares/this.numShares);
      this.costBasis -= decreasedCostBasis;
      this.capitalGains += numShares * this.price - commission - decreasedCostBasis;
      this.numShares = this.numShares - numShares; //this numShares is previous data
      
      return (double)(numShares * this.price - commission); 
    }
    return -1;
    //return numShares; //need fix
  }
  //Calculate split
  public double split(int ratioNumerator, int ratioDenonimator) {
    if(ratioNumerator <= 0 || ratioDenonimator <=0)
      return 0;
    else {
      double charges = ratioNumerator / ratioDenonimator;
      if (charges >= (int)charges+ 0.5)  charges = (int)charges + 1;
      else if (charges < (int)charges +0.5)  charges = (int)charges;
      this.numShares = (int)(numShares * charges);
      return (double)this.numShares * price;
    }
  }
}


