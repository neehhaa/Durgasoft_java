public class VarArgCase {

    public static void main(String[] args) {
        case6(10);
    }

    public static void case1(int... x) {
        // m1(int... x) valid
        // m1(int ...x) valid
        // m1(int...x) valid
        // m1(int. ..x) invalid cannot separate . they are best friends
        // m1(int x...) invalid
        // m1(int .x..) invalid
    }

    public static void case2(int... y) {
        // m1(int x, int... y) valid
        // m1(String s, double... y) valid can use vararg with normal parameter
    }

    public static void case3(int... z) {
        // m1(int... y,int x) invalid (vararg parameter must be the last parameter)
    }

    public static void case4(int... x) {
        // m1(int... x, double... d)
    }

    public static void case5(int... a) {
        System.out.println("int...");
    }

    /* public static void case5(int[] a) {
       System.out.println("int...");
     } */

    public static void case6(int... x){
        System.out.println("var-arg");
    }
    public static void case6(int x){
        System.out.println("general"); //normal method
    }
}
