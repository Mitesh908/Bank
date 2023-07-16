class Account{
    private int accountNo;
    private String openedDate;
    private double balance;
    
    public Account(){};
    public Account(int accountNo, String openedDate, double balance){
        this.accountNo=accountNo;
        this.openedDate=openedDate;
        this.balance=balance;
    }
    
    public void setAccountNo(int accountNo){
        this.accountNo=accountNo;
        
    }
    public int getAccountNo(){
        return accountNo;
    }
    public void setOpenedDate(String openedDate){
        this.openedDate=openedDate;
    }
    
    public String getOpenedDate(){
        return openedDate;
    }
    
    public double setBalance(double balance){
        return balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
}
