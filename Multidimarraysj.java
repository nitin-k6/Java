// public class multidimarrays{
//     public static void main(String[] args){
//         int [][] myNum={{1,2,3,4},{5,6,7,8,9}};
//         System.out.println(myNum[1][3]);
//         myNum[1][3]=10;
//         System.out.println(myNum[1][3]); //changing element value

//     }
// }
//looping through an array

public class Multidimarraysj{
    public static void main(String[] args){
        int[][] myNum = { {1,2,3,4,5}, {6,7,8,9} };
        for(int i=0; i<myNum.length; i++){
            for(int j=0; j<myNum[i].length; j++){
                System.out.println(myNum[i][j]);
            }
        }
    }
}