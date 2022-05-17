public class BankAccount {

    private String number; //customer account number
    private double balance; 
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {


        this("123456", 50.00, "Default name", "Default address", "Default phone");

        System.out.println("Empty constructor - check!");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {

        System.out.println("Account Constructor with parameters  - check");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("852946", 20.75,customerName,customerEmail,customerPhoneNumber);

        
    }

    //add to the balance
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance = " + this.balance);
    }

    //withdraw balance
    public void withdrawal(double withdrawalAmount) {
        //tests if there are sufficient funds
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal  was not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal amount = " + withdrawalAmount + " and the remaining balance is: " + this.balance);

        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
