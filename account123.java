import java.util.*;
class account12 {
    Scanner sc = new Scanner(System.in);
    int accountNumber;
    private double balance;
    private String name;    
    account12(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdrawn(double amount) {
        balance -= amount;
    }
    public void printAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Name: " + name);
    }
}
