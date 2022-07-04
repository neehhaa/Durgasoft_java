package Language_Fundamental;

public class VarArg {
    public static void m1(int... x){
        System.out.println("Var arg method"+x.length );
    }
    public static void main(String[] args){
        m1();
        m1(10,20);
        m1(30,10,40,20,50);
    }
}
