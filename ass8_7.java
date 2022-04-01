import java.util.*;

class book{
    String bno;
    String book_nam;
    float price;
    book(String bno,String book_nam,float price){
        this.bno = bno;
        this.book_nam = book_nam;
        this.price = price;
    }
    void display()
    {
        System.out.println("Book no:- "+bno);
        System.out.println("Book name:- "+book_nam);
        System.out.println("Book price:- "+price);
    }
}
class specialEditionBook extends book{
    int disscount;
    specialEditionBook(String bno, String book_nam, float price, int disscount) {
        super(bno, book_nam, price);
        this.disscount = disscount;
    }
    void display()
    {
        super.display();
        System.out.println("Disscount:- "+disscount);
    }
}
public class ass8_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0,n1 = 0;
        book b[] = new book[10];
        specialEditionBook seb[] = new specialEditionBook[10];
        while(true)
        {
            System.out.println("1.Add Book");
            System.out.println("2.Add Special Edition Book");
            System.out.println("3.Display");
            System.out.println("4.Special Edition Book Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    int flag = 0;
                    System.out.println("Enter the Book no:- ");
                    String bno1 = sc.nextLine();
                    if(n == 0)
                    {
                        System.out.println("Enter the Book name:- ");
                        String book_nam1 = sc.nextLine();
                        System.out.println("Enter the Book price:- ");
                        float price1 = sc.nextFloat();
                        b[n] = new book(bno1,book_nam1,price1);
                        n++;
                    }
                    else
                    {
                        for(int i = 0;i < n;i++)
                        {
                            if(b[i].bno.matches(bno1) )
                            {
                                System.out.println("Book already exists");
                                flag = 1;
                                break;
                            }
                        }
                        if(flag == 0)
                        {
                            System.out.println("Enter the Book name:- ");
                            String book_nam1 = sc.nextLine();
                            System.out.println("Enter the Book price:- ");
                            float price1 = sc.nextFloat();
                            b[n] = new book(bno1,book_nam1,price1);
                            n++;
                        }
                    }
                    break;
                case 2:
                    int flag1 = 0;
                    System.out.println("Enter the Book no:- ");
                    String spc_no = sc.nextLine();
                    if(n1 == 0)
                    {
                        System.out.println("Enter the Book name:- ");
                        String book_nam1 = sc.nextLine();
                        System.out.println("Enter the Book price:- ");
                        float price1 = sc.nextFloat();
                        System.out.println("Enter the Disscount:- ");
                        int disscount = sc.nextInt();
                        seb[n1] = new specialEditionBook(spc_no,book_nam1,price1,disscount);
                        n1++;
                    }
                    else
                    {
                        for(int i = 0;i < n1;i++)
                        {
                            if(seb[i].bno.matches(spc_no) )
                            {
                                System.out.println("Book already exists");
                                flag1 = 1;
                                break;
                            }
                        }
                        if(flag1 == 0)
                        {
                            System.out.println("Enter the Book name:- ");
                            String book_nam1 = sc.nextLine();
                            System.out.println("Enter the Book price:- ");
                            float price1 = sc.nextFloat();
                            System.out.println("Enter the Disscount:- ");
                            int disscount = sc.nextInt();
                            seb[n1] = new specialEditionBook(spc_no,book_nam1,price1,disscount);
                            n1++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Book Details");
                    for(int i = 0;i < n;i++)
                    {
                        b[i].display();
                    }
                    break;
                case 4:
                    System.out.println("Special Edition Book Details");
                    for(int i = 0;i < n;i++)
                    {
                        seb[i].display();
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