public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public void deposit(double deposit)
    {
        balance+=deposit;
        System.out.println("Deposit Successfull.NEW BALANCE = "+this.balance);
    }

    public Account(){
        this("000000",000,"Anonymous","NA","0000000");
    }
    public Account (String accountNumber, double balance, String name, String email, String phone){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public void withdraw(double withdraw)
    {
        if(balance - withdraw < 0){
            System.out.println("INSUFFICENT BALANCE. BALANCE AVAILABLE = "+this.balance);
        }
        else{
            balance -= withdraw;
            System.out.println("Withdrawl of "+ withdraw +" processed. Remaining balance = "+this.balance);
        }
    }

    //GETTERS
    public String GetAccountNumber(){
        return accountNumber;
    }
    public double GetBalance(){
        return balance;
    }
    public String GetName(){
        return name;
    }
    public String GetEmail(){
        return email;
    }
    public String GetPhone(){
        return phone;
    }

    //SETTERS


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static void main(String[] args)
    {
        Account Aaryan= new Account("12346", 100, "Aaryan Gambhir","crimson@gmail.com","123456789");

        Aaryan.deposit(700);
        Aaryan.withdraw(400);
    }
    
}
