package Language_Fundamental;
//array of array

class Arrcreate{
    public static void main(String[] args){

        int[][][] x = new int[3][][];
        x[0] = new int[4][];
        x[0][0] = new int[2];
        x[0][1] = new int[1];
        x[0][2] = new int[1];
        x[0][3]= new int[2];
        x[1] = new int[2][];
        x[1][0] =new int[2];
        x[1][1] = new int[1];
        x[2] = new int[3][];
        x[2][0] = new int[3];
        x[2][1] = new int[2];
        x[2][2] = new int[1];
    }
}
/*
                [ ] [ ] [ ]
         [][][][]   [][]      [][][]
   [][] [] [] [][]  [][] []  [][][] [][] []



*/
