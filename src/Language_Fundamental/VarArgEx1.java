package Language_Fundamental;

public class VarArgEx1 {
    public static void main(String[] args) {
        Sum();
        Sum(10, 20);
        Sum(4, 10, 50);
    }

    public static void Sum(int... x) {
        int total = 0;
        for (int x1 : x) {
            total = total + x1;
        }
        System.out.println(total);
    }
}
