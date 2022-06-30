public class Localvar {
    public static void main(String[] args){
//        int i = 0;
//        for (int j =0;j<3;j++){
//            i = i+j;
//        }
//        System.out.println(i+"..."+j);

        try{
            int i = Integer.parseInt("ten");
            System.out.println(i);
        }
        catch (NumberFormatException e){
            int i=10;
        }
        System.out.println(i);
        }

    }

