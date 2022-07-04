package Language_Fundamental;

public class InstanceVar {
    int x = 10;
    int y = 20;
    public static void main(String[] args) {
//        System.out.println(x);
        InstanceVar a = new InstanceVar();
        System.out.println(a.x);
        a.m1();
    }
    public void m1(){
        System.out.println(y);
    }
}
