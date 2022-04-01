abstract class fruit{
    abstract void cost();
}
class apple extends fruit{
    void cost(){
        System.out.println("Cost of apple is 10 RS");
    }
}
class mango extends fruit{
    void cost(){
        System.out.println("Cost of mango is 20 RS");
    }
}
public class ass8_8 {
    public static void main(String[] args) {
        fruit f1 = new apple();
        f1.cost();
        fruit f2 = new mango();
        f2.cost();
    }
}
