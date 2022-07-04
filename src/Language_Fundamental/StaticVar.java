package Language_Fundamental;

class StaticVar {
    static int x = 15;
    static int y = 20;
    public static void main(String[] args) {
        StaticVar v = new StaticVar();
        System.out.println(v.x);
        System.out.println(StaticVar.x); //recommended to use class name
        System.out.println(x); //can use directly
        v.m1();
    }
    public void m1(){
        System.out.println(y);
    }
}
