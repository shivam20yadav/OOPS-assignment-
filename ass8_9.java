interface fruit{
    void cost();
}
class apple implements fruit{
    public void cost(){
        System.out.println("Cost of apple is 10 RS");
    }
}
class mango implements fruit{
    public void cost(){
        System.out.println("Cost of mango is 20 RS");
    }
}
public class ass8_9 {
    public static void main(String[] args) {
        fruit f1 = new apple();
        f1.cost();
        fruit f2 = new mango();
        f2.cost();
    }
}
