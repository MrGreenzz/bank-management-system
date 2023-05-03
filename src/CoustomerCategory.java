public class CoustomerCategory {
    private String name;
    private double accountBalance;
 
    public CoustomerCategory (String name, double accountBalance) {
       this.name = name;
       this.accountBalance = accountBalance;
    }
 
    public String getName() {
       return name;
    }
 
    public double getAccountBalance() {
       return accountBalance;
    }
 
    public String getCustomerCategory() {
       if (accountBalance >= 100000) {
          return "Gold";
       } else if (accountBalance >= 10000) {
          return "Silver";
       } else if (accountBalance < 10000 ) {
          return "Normal";
       } else {
          return "Again";
       }
    }
}