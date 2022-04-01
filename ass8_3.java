import java.util.*;
class student1{
	
	int total = 0;
    private String id;
    private String name;
    private int[] mark;
	student1(String id,String name,int[] mark)
	{
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	void totalmarks()
	{
		for(int i=0;i < 3;i++)
		{
			total = total + mark[i];
		}
	}
	void printdata()
	{
		System.out.println("student id:- "+id);
		System.out.println("student name:- " +name);
		for(int i=0;i<3;i++)
		{
			System.out.println("student Subject " + i +"mark:- "+mark[i]);
		}
		System.out.println("student total marks:- "+total);
	}
}
public class ass8_3{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);   
		int n = 0;
		System.out.println("Enter the range of the student:- ");
		n = sc.nextInt();
        sc.nextLine();
		student1 stu[];
		stu = new student1[n];
		for(int i = 0;i < n;i++)
		{
            System.out.println("Enter the student id:- ");
            String id = sc.nextLine();
            System.out.println("Enter the student name:- ");
            String nam = sc.nextLine();
            int[] mark = new int[3];
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter the student mark:- ");
                mark[j] = sc.nextInt();
            }
			stu[i] = new student1(id,nam,mark);
		}
		for(int i = 0;i < n;i++)
		{
			stu[i].totalmarks();
			stu[i].printdata();
		}
		sc.close();
	}
}