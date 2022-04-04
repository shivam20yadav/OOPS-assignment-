import java.util.*;
class ass8_10
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        account12[] b;
        b = new account12[10];
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
                        System.out.println("Enter the balance");
                        double balance = sc.nextDouble();
                        System.out.println("Enter the name");
                        String name = sc.next();
                        sc.nextLine();
                        b[n] = new account12(accountNumber, balance, name);
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
                            System.out.println("Enter the balance");
                            double balance = sc.nextDouble();
                            System.out.println("Enter the name");
                            String name = sc.next();
                            sc.nextLine();
                            b[n] = new account12(accountNumber, balance, name);
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
