public class StaticAndInstance {
    static int x = 10; //creates one variable for all objects
    int y = 20; //creates separate variables for all objects
    public static void main(String[] args){
        StaticAndInstance t1 = new StaticAndInstance();
        t1.x = 888;
        t1.y = 999;
        System.out.println(t1.x);
        System.out.println(t1.y);
        StaticAndInstance t2 = new StaticAndInstance();
        System.out.println(t2.x+"...."+t2.y);
    }
}
