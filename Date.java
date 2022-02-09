//Task 3 project 1
public class Date {
  private int day;
  private int month;
  private int year;
  
  //Set and get day,month,year
  public int getDay() {
    if (day>=1 && day <=31) 
      return day;
    else return 0;
  }
  public int getMonth() {
    if (month >=1 && month <=12)
      return month;
    else return 0;
  }
  public int getYear() {
    return year;
  }
  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  
  // increment day
  public void incrementDay() {
    this.day = day + 1;
    if ((day>31 && month==1) || (day>31 && month==3) || (day>31 && month==5) || (day>31 && month== 7) || (day>31 && month==8) || (day>31 && month==10)){
      this.day = day - 31;
      this.month = month +1;
    }
    else if ((day>30 && month == 4) || (day>30 && month == 6) || (day>30 && month == 9) || (day>30 && month == 11)) {
      this.day = day - 30;
      this.month = month + 1;
    }
    else if (day >28 && month == 2) {
      this.day = day - 28;
      this.month = month + 1;
    }
    else if (day>31 &&month == 12) {
      this.day = day -31;
      this.month = 1;
      this.year = year + 1;
    }
  }
  
  //toString method
  public String toString() {
    if (month == 1) return ("January," + getDay() + "," + getYear());
    else if (month == 2) return ("Febuary," + getDay() + "," + getYear());
    else if (month == 3) return ("March," + getDay() + "," + getYear());
    else if (month == 4) return ("April," + getDay() + "," + getYear());
    else if (month == 5) return ("May," + getDay() + "," + getYear());
    else if (month == 6) return ("June," + getDay() + "," + getYear());
    else if (month == 7) return ("July," + getDay() + "," + getYear());
    else if (month == 8) return ("August," + getDay() + "," + getYear());
    else if (month == 9) return ("September," + getDay() + "," + getYear());
    else if (month == 10) return ("October," + getDay() + "," + getYear());
    else if (month == 11) return ("November," + getDay() + "," + getYear());
    else if (month == 12) return ("December," + getDay() + "," + getYear());
  return getMonth() + "," + getDay() + "," + getYear();
}
  /*
  //equals method
  public boolean equals(Date d) {
    //check if this.getDay() = d.getDay() and so on
    return false;
  }
  NOT FINISHED
  */
  
}


