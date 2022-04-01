import java.util.*;

class student{
	Scanner sc= new Scanner(System.in);
	String id;
	String nam;
	int[] mark = new int[3]; 
	int total = 0;
	void setStudentDeatils()
	{
		System.out.println("Enter the student id:- ");
		id = sc.nextLine();
		System.out.println("Enter the student name:- ");
		nam = sc.nextLine();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the student mark:- ");
			mark[i] = sc.nextInt();
		}
	}
	void totalmarks()
	{
		for(int i=0;i < 3;i++)
		{
			total = total + mark[i];
		}
		System.out.println();
	}
	void printdata()
	{
		System.out.println("student id:- "+id);
		System.out.println("student name:- " +nam);
		for(int i=0;i<3;i++)
		{
			System.out.println("student Subject " + i +"mark:- "+mark[i]);
		}
		System.out.println("student total marks:- "+total);
	}
}
public class ass8_1{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);   
		int n = 0;
		System.out.println("Enter the range of the student:- ");
		n = sc.nextInt();
		student stu[];
		stu = new student[n];
		for(int i = 0;i < n;i++)
		{
			stu[i] = new student();
			stu[i].setStudentDeatils();
		}
		for(int i = 0;i < n;i++)
		{
			stu[i].totalmarks();
			stu[i].printdata();
		}
		sc.close();
	}
}