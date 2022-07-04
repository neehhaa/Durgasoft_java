package Operators_and_Assignments;

public class NotANum {
    public static void main(String[] args) {
        System.out.println(10 < Float.NaN);
        System.out.println(10 <= Float.NaN);
        System.out.println(10 > Float.NaN);
        System.out.println(10 >= Float.NaN);
        System.out.println(10 == Float.NaN);
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(10 != Float.NaN);
        System.out.println(Float.NaN != Float.NaN);
    }
}
