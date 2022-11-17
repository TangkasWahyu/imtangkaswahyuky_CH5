package Tugas2OOPChallenge.BankAccount.Constructor;

public class BankAccount {
    //Variable (Private)
    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //Constructor untuk memberikan initial value
    public BankAccount() {
        balance = 5000000;
        accountNumber = 1;
        customerName = "I Made Tangkas Wahyu Kencana Yuda";
        customerEmail = "tangkaswahyu98@gmail.com";
        customerPhone = "081234567890";
    }

    //Method Setter (Public) dan Getter (Public) dengan Parameter accountNumber
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    //Method Setter (Public) dan Getter (Public) dengan Parameter balance
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    //Method Setter (Public) dan Getter (Public) dengan Parameter customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    //Method Setter (Public) dan Getter (Public) dengan Parameter customerEmail
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }

    //Method Setter (Public) dan Getter (Public) dengan Parameter customerPhone
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    public int deposit(int amountDep) {
        this.balance += amountDep;
        System.out.println("Balance after deposit: "+ this.balance);
        return this.balance;
    }

    public int withdraw(int amountWith) {
        if (this.balance < amountWith) {
            System.out.println("Current Balance: "+ this.balance);
        } else {
            this.balance -= amountWith;
            System.out.println("Balance after withdraw: "+ this.balance);
        }
        return this.balance;
    }
}
