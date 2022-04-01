import java.util.*;
class customer
{
    private String cust_id;
    private String name;
    private String address;
    
    customer(String cust_id,String name,String address)
    {
        this.cust_id = cust_id;
        this.name = name;
        this.address = address;
    }
    void printdata()
    {
        System.out.println("\ncustomer id:- "+cust_id);
        System.out.println("customer name:- " +name);
        System.out.println("customer address:- " +address);
    }
}
class account2 extends customer
{
    private int acc_no;
    private String acc_type;
    private int balance;
    account2(String cust_id,String name,String address,int acc_no,int balance,String acc_type)
    {
        super(cust_id,name,address);
        this.acc_no = acc_no;
        this.balance = balance;
        this.acc_type = acc_type;
    }
    void printdata()
    {
        super.printdata();
        System.out.println("\naccount no:- "+acc_no);
        System.out.println("account balance:- " +balance);
        System.out.println("account type:- " +acc_type);
    }
}
class ass8_5{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer id:- ");
        String cust_id = sc.nextLine();
        System.out.println("Enter the customer name:- ");
        String name = sc.nextLine();
        System.out.println("Enter the customer address:- ");
        String address = sc.nextLine();
        customer c = new customer(cust_id,name,address);
        System.out.println("Enter the account no:- ");
        int acc_no = sc.nextInt();
        System.out.println("Enter the account type:- ");
        String acc_type = sc.next();
        System.out.println("Enter the account balance:- ");
        int balance = sc.nextInt();
        account2 a = new account2(cust_id,name,address,acc_no,balance,acc_type);
        for(int i=0;i<30;i++)
        {
            System.out.print("*");
        }
        c.printdata();
        for(int i=0;i<30;i++)
        {
            System.out.print("*");
        }
        a.printdata();
        for(int i=0;i<30;i++)
        {
            System.out.print("*");
        }
        sc.close();
    }
}