class something
{
    static int i = 0;
    something(){
        i++;
    }

}
public class ass8_6 {
    public static void main(String[] args) {
        something s1 = new something();
        System.out.println(s1.i);
        something s2 = new something();
        System.out.println(s1.i);
        something s3 = new something();
        System.out.println(s1.i);
    }    
}
