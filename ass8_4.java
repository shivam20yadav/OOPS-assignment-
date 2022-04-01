import java.util.Scanner;

class reatangle{
    float length;
    float breadth;
    reatangle(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    float area(){
        return length*breadth;
    }
}
public class ass8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the reatangle:- ");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth of the reatangle:- ");
        float breadth = sc.nextFloat();
        reatangle r = new reatangle(length,breadth);
        System.out.println("Area of the reatangle is:- "+r.area());
        sc.close();
    }
}
