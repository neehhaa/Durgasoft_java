package Language_Fundamental;

public class MainParentChild {
    public static void main(String[] args){
        System.out.println("Parent Main");
    }
}
class MainChild extends MainParentChild{
    public static void main(String[] args){
        System.out.println("Child Main");
    }
}
