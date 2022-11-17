package Tugas2OOPChallenge.BankAccount.Constructor;

public class Main {
    public static void main(String[] args){
        //Memasukan set Data BankAccount pada Variable
        BankAccount bankAccount1 = new BankAccount();

        //Memanggil Method Getter
        System.out.println("=========== Information Bank Account ===========");
        System.out.println("Account Number: "+bankAccount1.getAccountNumber());
        System.out.println("Balance: Rp."+bankAccount1.getBalance());
        System.out.println("Customer Name: "+bankAccount1.getCustomerName());
        System.out.println("Customer Email: "+bankAccount1.getCustomerEmail());
        System.out.println("Customer Phone: "+bankAccount1.getCustomerPhone());

        bankAccount1.deposit(500);
        bankAccount1.withdraw(400);
        bankAccount1.withdraw(6000000);
    }
}
