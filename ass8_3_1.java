import java.util.*;
class bankAccount1 {
    Scanner sc = new Scanner(System.in);
    int accountNumber;
    private double balance;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private int age;
    
    bankAccount1(int accountNumber) {
        this.accountNumber = accountNumber;
        System.out.println("Enter the balance");
        balance = sc.nextDouble();
        System.out.println("Enter the name");
        name = sc.next();
        sc.nextLine();
        System.out.println("Enter the address");
        address = sc.next();
        sc.nextLine();
        System.out.println("Enter the phone number");
        phoneNumber = sc.next();
        System.out.println("Enter the email");
        email = sc.next();
        System.out.println("Enter the age");
        age = sc.nextInt();

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
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
}
class ass8_3_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        bankAccount1[] b;
        b = new bankAccount1[10];
        int n = 0;
        while(true)
        {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Print Account Details");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    int flag4 = 0;
                    System.out.println("Enter the account number");
                    int accountNumber = sc.nextInt();
                    if(n == 0)
                    {
                        b[n] = new bankAccount1(accountNumber);
                        n++;
                    }
                    else
                    {
                        for(int i = 0;i < n;i++)
                        {
                            if(b[i].accountNumber == accountNumber)
                            {
                                flag4 = 1;
                                System.out.println("Account already exists");
                            }
                        }
                        if(flag4 == 0)
                        {
                            b[n] = new bankAccount1(accountNumber);
                            n++;
                        } 
                    }
                    break;
                case 2:
                    int flag = 0;
                    System.out.println("Enter the account number");
                    int accountNumber1 = sc.nextInt();
                    for(int i = 0;i< n;i++)
                    {
                        if(b[i].accountNumber == accountNumber1)
                        {
                            System.out.println("Enter the amount to be deposited");
                            double amount = sc.nextDouble();
                            b[i].deposit(amount);
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0)
                    {
                        System.out.println("Account number not found");
                    }
                    break;
                case 3:
                    int flag1 = 0;
                    System.out.println("Enter the account number");
                    int accountNumber2 = sc.nextInt(
                        
                    );
                    for(int i = 0;i< n;i++)
                    {
                        if(b[i].accountNumber == accountNumber2)
                        {
                            System.out.println("Enter the amount to be withdrawn");
                            double amount = sc.nextDouble();
                            b[i].withdrawn(amount);
                            flag1 = 1;
                            break;
                        }
                    }
                    if(flag1 == 0)
                    {
                        System.out.println("Account number not found");
                    }
                    break;
                case 4:
                    int flag2 = 0;
                    System.out.println("Enter the account number");
                    int accountNumber3 = sc.nextInt();
                    for(int i = 0;i< n;i++)
                    {
                        if(b[i].accountNumber == accountNumber3)
                        {
                            b[i].printAccount();
                            flag2 = 1;
                            break;
                        }
                    }
                    if(flag2 == 0)
                    {
                        System.out.println("Account number not found");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}